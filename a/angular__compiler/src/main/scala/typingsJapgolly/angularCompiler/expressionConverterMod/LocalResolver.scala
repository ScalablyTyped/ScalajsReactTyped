package typingsJapgolly.angularCompiler.expressionConverterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResolver extends js.Object {
  def getLocal(name: String): Expression | Null
  def notifyImplicitReceiverUse(): Unit
}

object LocalResolver {
  @scala.inline
  def apply(getLocal: String => CallbackTo[Expression | Null], notifyImplicitReceiverUse: Callback): LocalResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLocal")(js.Any.fromFunction1((t0: java.lang.String) => getLocal(t0).runNow()))
    __obj.updateDynamic("notifyImplicitReceiverUse")(notifyImplicitReceiverUse.toJsFn)
    __obj.asInstanceOf[LocalResolver]
  }
}

