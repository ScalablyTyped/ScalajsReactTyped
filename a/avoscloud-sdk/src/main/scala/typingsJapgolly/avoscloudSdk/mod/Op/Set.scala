package typingsJapgolly.avoscloudSdk.mod.Op

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.avoscloudSdk.mod.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set extends IBaseObject {
  def value(): js.Any
}

object Set {
  @scala.inline
  def apply(toJSON: CallbackTo[js.Any], value: CallbackTo[js.Any]): Set = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("value")(value.toJsFn)
    __obj.asInstanceOf[Set]
  }
}

