package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShim extends js.Object {
  def dispose(dummy: js.Any): Unit
}

object IShim {
  @scala.inline
  def apply(dispose: js.Any => Callback): IShim = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(js.Any.fromFunction1((t0: js.Any) => dispose(t0).runNow()))
    __obj.asInstanceOf[IShim]
  }
}

