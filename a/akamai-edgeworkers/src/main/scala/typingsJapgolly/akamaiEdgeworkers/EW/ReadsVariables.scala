package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadsVariables extends js.Object {
  /**
    * Get's the value of a request variable
    */
  def getVariable(name: String): js.UndefOr[String]
}

object ReadsVariables {
  @scala.inline
  def apply(getVariable: String => CallbackTo[js.UndefOr[String]]): ReadsVariables = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getVariable")(js.Any.fromFunction1((t0: java.lang.String) => getVariable(t0).runNow()))
    __obj.asInstanceOf[ReadsVariables]
  }
}

