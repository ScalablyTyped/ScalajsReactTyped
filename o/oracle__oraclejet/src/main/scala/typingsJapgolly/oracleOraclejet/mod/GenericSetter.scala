package typingsJapgolly.oracleOraclejet.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericSetter[SP] extends js.Object {
  def set[K /* <: String */](
    propertyName: K,
    propertyValue: /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any
  ): Unit
  def unset(propertyName: String): Unit
}

object GenericSetter {
  @scala.inline
  def apply[SP](
    set: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any) => Callback,
    unset: String => Callback
  ): GenericSetter[SP] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: js.Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("unset")(js.Any.fromFunction1((t0: java.lang.String) => unset(t0).runNow()))
    __obj.asInstanceOf[GenericSetter[SP]]
  }
}

