while getopts rp: flag
do
    case "${flag}" in
        r) find . -name snapshots -type d -exec rm -rf {} \; ;;
        p) prefix=${OPTARG} ;;
    esac
done

./gradlew recordPaparazziDebug -PPAPARAZZI_PREFIX=$prefix