import org.cryptomator.Service;
import org.cryptomator.ServiceImpl;

module org.cryptomator.bob {
    exports org.cryptomator;

    provides Service with ServiceImpl;

}
