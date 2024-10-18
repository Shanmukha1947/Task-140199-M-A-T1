public class Main {
    public static void main(String[] args) {
        java.lang.ModuleLayer layer = java.lang.ModuleLayer.boot();
        java.lang.Module module = layer.findModule("com.example.myapp").get();
        try {
            java.lang.Class<?> myAppClass = module.findClass("com.example.myapp.MyApp");
            java.lang.reflect.Method mainMethod = myAppClass.getMethod("main", String[].class);
         mainMethod.invoke(null, (Object) args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

