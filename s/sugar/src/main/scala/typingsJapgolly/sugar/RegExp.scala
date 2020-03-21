package typingsJapgolly.sugar

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExp extends js.Object {
  def addFlags(flags: java.lang.String): RegExp
  def getFlags(): java.lang.String
  def removeFlags(flags: java.lang.String): RegExp
  def setFlags(flags: java.lang.String): RegExp
}

object RegExp {
  @scala.inline
  def apply(
    addFlags: java.lang.String => CallbackTo[RegExp],
    getFlags: CallbackTo[java.lang.String],
    removeFlags: java.lang.String => CallbackTo[RegExp],
    setFlags: java.lang.String => CallbackTo[RegExp]
  ): RegExp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFlags")(js.Any.fromFunction1((t0: java.lang.String) => addFlags(t0).runNow()))
    __obj.updateDynamic("getFlags")(getFlags.toJsFn)
    __obj.updateDynamic("removeFlags")(js.Any.fromFunction1((t0: java.lang.String) => removeFlags(t0).runNow()))
    __obj.updateDynamic("setFlags")(js.Any.fromFunction1((t0: java.lang.String) => setFlags(t0).runNow()))
    __obj.asInstanceOf[RegExp]
  }
}

