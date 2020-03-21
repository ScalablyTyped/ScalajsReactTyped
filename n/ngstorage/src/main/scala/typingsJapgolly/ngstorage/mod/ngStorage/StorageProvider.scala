package typingsJapgolly.ngstorage.mod.ngStorage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ trait StorageProvider extends js.Object {
  def get[T](key: String): T | Boolean
  def remove(key: String): Unit
  def set[T](key: String, value: T): T | Boolean
  def setDeserializer(deserializer: js.Function1[/* value */ String, _]): Unit
  def setKeyPrefix(prefix: String): Unit
  def setSerializer(serializer: js.Function1[/* value */ js.Any, String]): Unit
  def supported(): Boolean
}

object StorageProvider {
  @scala.inline
  def apply(
    get: String => CallbackTo[js.Any | Boolean],
    remove: String => Callback,
    set: (String, js.Any) => CallbackTo[js.Any | Boolean],
    setDeserializer: js.Function1[/* value */ String, js.Any] => Callback,
    setKeyPrefix: String => Callback,
    setSerializer: js.Function1[/* value */ js.Any, String] => Callback,
    supported: CallbackTo[Boolean]
  ): StorageProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("setDeserializer")(js.Any.fromFunction1((t0: js.Function1[/* value */ java.lang.String, js.Any]) => setDeserializer(t0).runNow()))
    __obj.updateDynamic("setKeyPrefix")(js.Any.fromFunction1((t0: java.lang.String) => setKeyPrefix(t0).runNow()))
    __obj.updateDynamic("setSerializer")(js.Any.fromFunction1((t0: js.Function1[/* value */ js.Any, java.lang.String]) => setSerializer(t0).runNow()))
    __obj.updateDynamic("supported")(supported.toJsFn)
    __obj.asInstanceOf[StorageProvider]
  }
}

