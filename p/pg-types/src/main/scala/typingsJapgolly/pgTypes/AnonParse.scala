package typingsJapgolly.pgTypes

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParse extends js.Object {
  def parse(): js.Array[_]
}

object AnonParse {
  @scala.inline
  def apply(parse: CallbackTo[js.Array[js.Any]]): AnonParse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse.toJsFn)
    __obj.asInstanceOf[AnonParse]
  }
}

