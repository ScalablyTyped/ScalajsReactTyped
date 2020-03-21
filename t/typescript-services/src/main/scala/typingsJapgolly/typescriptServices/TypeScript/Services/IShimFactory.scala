package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimFactory extends js.Object {
  def registerShim(shim: IShim): Unit
  def unregisterShim(shim: IShim): Unit
}

object IShimFactory {
  @scala.inline
  def apply(registerShim: IShim => Callback, unregisterShim: IShim => Callback): IShimFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerShim")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.Services.IShim) => registerShim(t0).runNow()))
    __obj.updateDynamic("unregisterShim")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.Services.IShim) => unregisterShim(t0).runNow()))
    __obj.asInstanceOf[IShimFactory]
  }
}

