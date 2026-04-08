### Установка
Добавляем репозиторий
# 1
`
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation("com.github.OnixNine:OnixEvents:гитхеш")
}
`
# 2
Создаем любой евент
```java
import dev.onix.events.Cancellable;
import dev.onix.events.Event;

public class MyFirstEvent implements Event, Cancellable {
    private boolean cancel;
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void cancel() {
        cancel = true;
    }
}

```
# 3 Вызываем евент
```java
        MyFirstEvent event = new MyFirstEvent();
        EventManager.callEvent(event);
        if (event.isCancelled()) {
            System.out.println("Евент отменен");
        }
```
