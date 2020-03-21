package typingsJapgolly.avoscloudSdk.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseObject extends js.Object {
  def toJSON(): js.Any
}

object IBaseObject {
  @scala.inline
  def apply(toJSON: CallbackTo[js.Any]): IBaseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[IBaseObject]
  }
}

