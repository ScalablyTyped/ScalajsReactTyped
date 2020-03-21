package typingsJapgolly.angularAria.mod.aria

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $aria service (https://docs.angularjs.org/api/ngAria/service/$aria).
  */
trait IAriaService extends js.Object {
  def config(attribute: IAriaAttribute): Boolean
}

object IAriaService {
  @scala.inline
  def apply(config: IAriaAttribute => CallbackTo[Boolean]): IAriaService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.angularAria.mod.aria.IAriaAttribute) => config(t0).runNow()))
    __obj.asInstanceOf[IAriaService]
  }
}

