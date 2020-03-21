package typingsJapgolly.avoscloudSdk.mod.Op

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.avoscloudSdk.mod.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation extends IBaseObject {
  def objects(): js.Array[_]
}

object BaseOperation {
  @scala.inline
  def apply(objects: CallbackTo[js.Array[js.Any]], toJSON: CallbackTo[js.Any]): BaseOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objects")(objects.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[BaseOperation]
  }
}

