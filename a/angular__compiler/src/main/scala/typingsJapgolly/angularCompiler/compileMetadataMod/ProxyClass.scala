package typingsJapgolly.angularCompiler.compileMetadataMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyClass extends js.Object {
  def setDelegate(delegate: js.Any): Unit
}

object ProxyClass {
  @scala.inline
  def apply(setDelegate: js.Any => Callback): ProxyClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDelegate")(js.Any.fromFunction1((t0: js.Any) => setDelegate(t0).runNow()))
    __obj.asInstanceOf[ProxyClass]
  }
}

