package typingsJapgolly.avoscloudSdk.mod.Op

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.avoscloudSdk.mod.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increment extends IBaseObject {
  var amount: Double
}

object Increment {
  @scala.inline
  def apply(amount: Double, toJSON: CallbackTo[js.Any]): Increment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Increment]
  }
}

