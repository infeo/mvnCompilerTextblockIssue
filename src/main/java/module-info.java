import org.example.Service;
import org.example.ServiceImpl;

module org.example.bob {
    exports org.example;

    provides Service with ServiceImpl;

}
