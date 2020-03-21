package typingsJapgolly.emberEngine.instanceMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(RegistryProxyMixin, ContainerProxyMixin) * / any */ trait EngineInstance extends js.Object {
  /**
    *  Initialize the `EngineInstance` and return a promise that resolves
    *  with the instance itself when the boot process is complete.
    */
  def boot(): js.Promise[EngineInstance]
  /**
    * Unregister a factory.
    */
  def unregister(fullName: String): js.Any
}

object EngineInstance {
  @scala.inline
  def apply(boot: CallbackTo[js.Promise[EngineInstance]], unregister: String => CallbackTo[js.Any]): EngineInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boot")(boot.toJsFn)
    __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: java.lang.String) => unregister(t0).runNow()))
    __obj.asInstanceOf[EngineInstance]
  }
}

