package typingsJapgolly.swiz.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializable extends js.Object {
  def getSerializerType(): String
}

object ISerializable {
  @scala.inline
  def apply(getSerializerType: CallbackTo[String]): ISerializable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSerializerType")(getSerializerType.toJsFn)
    __obj.asInstanceOf[ISerializable]
  }
}

