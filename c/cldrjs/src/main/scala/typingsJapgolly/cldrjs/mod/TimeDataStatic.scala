package typingsJapgolly.cldrjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDataStatic extends js.Object {
  def allowed(): String
  def preferred(): String
}

object TimeDataStatic {
  @scala.inline
  def apply(allowed: CallbackTo[String], preferred: CallbackTo[String]): TimeDataStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowed")(allowed.toJsFn)
    __obj.updateDynamic("preferred")(preferred.toJsFn)
    __obj.asInstanceOf[TimeDataStatic]
  }
}

