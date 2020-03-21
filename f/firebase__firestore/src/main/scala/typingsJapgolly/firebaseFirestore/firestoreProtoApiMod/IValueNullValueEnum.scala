package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueNullValueEnum extends js.Object {
  var NULL_VALUE: ValueNullValue
  def values(): js.Array[ValueNullValue]
}

object IValueNullValueEnum {
  @scala.inline
  def apply(NULL_VALUE: ValueNullValue, values: CallbackTo[js.Array[ValueNullValue]]): IValueNullValueEnum = {
    val __obj = js.Dynamic.literal(NULL_VALUE = NULL_VALUE.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IValueNullValueEnum]
  }
}

