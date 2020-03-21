package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldTransformSetToServerValueEnum extends js.Object {
  var REQUEST_TIME: FieldTransformSetToServerValue
  var SERVER_VALUE_UNSPECIFIED: FieldTransformSetToServerValue
  def values(): js.Array[FieldTransformSetToServerValue]
}

object IFieldTransformSetToServerValueEnum {
  @scala.inline
  def apply(
    REQUEST_TIME: FieldTransformSetToServerValue,
    SERVER_VALUE_UNSPECIFIED: FieldTransformSetToServerValue,
    values: CallbackTo[js.Array[FieldTransformSetToServerValue]]
  ): IFieldTransformSetToServerValueEnum = {
    val __obj = js.Dynamic.literal(REQUEST_TIME = REQUEST_TIME.asInstanceOf[js.Any], SERVER_VALUE_UNSPECIFIED = SERVER_VALUE_UNSPECIFIED.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IFieldTransformSetToServerValueEnum]
  }
}

