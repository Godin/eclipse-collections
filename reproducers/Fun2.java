import java.util.function.*;

class Fun2 {
    void fun(java.util.List<String> list) {
      list.forEach(bind(cast(this::info), iter -> iter));
    }

    static <T> Consumer<T> cast(Consumer<T> procedure) {
        return null;
    }

    static <T1, T2> Consumer<T1> bind(Consumer<? super T2> delegate, Function<? super T1, T2> function) {
      return null;
    }

    public void info(String msg) {
    }

    public void info(String format, Object arg) {
    }
}
