package typingsJapgolly.mangopay2NodejsSdk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToJSON extends js.Object {
  def toJSON(): js.Any
}

object AnonToJSON {
  @scala.inline
  def apply(toJSON: CallbackTo[js.Any]): AnonToJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[AnonToJSON]
  }
}

