package typingsJapgolly.hapiPino.mod.hapiHapiAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pino.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  def logger(): Logger
}

object Server {
  @scala.inline
  def apply(logger: CallbackTo[Logger]): Server = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logger")(logger.toJsFn)
    __obj.asInstanceOf[Server]
  }
}

