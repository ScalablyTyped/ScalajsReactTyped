package typingsJapgolly.oracleOraclejet.ojcontextMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  def getBusyContext(): BusyContext
}

object Context {
  @scala.inline
  def apply(getBusyContext: CallbackTo[BusyContext]): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBusyContext")(getBusyContext.toJsFn)
    __obj.asInstanceOf[Context]
  }
}

