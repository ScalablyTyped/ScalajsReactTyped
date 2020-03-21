package typingsJapgolly.mathjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Help extends js.Object {
  def toJSON(): String
}

object Help {
  @scala.inline
  def apply(toJSON: CallbackTo[String]): Help = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Help]
  }
}

