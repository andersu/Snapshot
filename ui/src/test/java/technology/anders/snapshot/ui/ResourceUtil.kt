package technology.anders.snapshot.ui

import android.util.Log
import java.lang.reflect.Field

object ResourceUtil {
    /**
     * Finds the resource ID for the current application's resources.
     * @param name Name of the resource to search for.
     * @return The id of the resource or -1 if not found.
     */
    fun getResourceByName(name: String): Int {
        val rClass = R.layout::class.java
        var id = -1
        try {
            val field: Field? = rClass.getField(name)
            if (field != null) id = field.getInt(null)
        } catch (e: Exception) {
            Log.e("GET_RESOURCE_BY_NAME: ", e.toString())
            e.printStackTrace()
        }
        return id
    }
}