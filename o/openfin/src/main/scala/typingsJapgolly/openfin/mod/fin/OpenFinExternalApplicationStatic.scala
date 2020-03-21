package typingsJapgolly.openfin.mod.fin

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinExternalApplicationStatic extends js.Object {
  /**
    * Returns an External Application object that represents an existing external application.
    */
  def wrap(uuid: String): OpenFinExternalApplication
}

object OpenFinExternalApplicationStatic {
  @scala.inline
  def apply(wrap: String => CallbackTo[OpenFinExternalApplication]): OpenFinExternalApplicationStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wrap")(js.Any.fromFunction1((t0: java.lang.String) => wrap(t0).runNow()))
    __obj.asInstanceOf[OpenFinExternalApplicationStatic]
  }
}

