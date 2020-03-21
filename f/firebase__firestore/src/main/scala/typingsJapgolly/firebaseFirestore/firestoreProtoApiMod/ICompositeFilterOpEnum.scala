package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeFilterOpEnum extends js.Object {
  var AND: CompositeFilterOp
  var OPERATOR_UNSPECIFIED: CompositeFilterOp
  def values(): js.Array[CompositeFilterOp]
}

object ICompositeFilterOpEnum {
  @scala.inline
  def apply(
    AND: CompositeFilterOp,
    OPERATOR_UNSPECIFIED: CompositeFilterOp,
    values: CallbackTo[js.Array[CompositeFilterOp]]
  ): ICompositeFilterOpEnum = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[ICompositeFilterOpEnum]
  }
}

