package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderDirectionEnum extends js.Object {
  var ASCENDING: OrderDirection
  var DESCENDING: OrderDirection
  var DIRECTION_UNSPECIFIED: OrderDirection
  def values(): js.Array[OrderDirection]
}

object IOrderDirectionEnum {
  @scala.inline
  def apply(
    ASCENDING: OrderDirection,
    DESCENDING: OrderDirection,
    DIRECTION_UNSPECIFIED: OrderDirection,
    values: CallbackTo[js.Array[OrderDirection]]
  ): IOrderDirectionEnum = {
    val __obj = js.Dynamic.literal(ASCENDING = ASCENDING.asInstanceOf[js.Any], DESCENDING = DESCENDING.asInstanceOf[js.Any], DIRECTION_UNSPECIFIED = DIRECTION_UNSPECIFIED.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IOrderDirectionEnum]
  }
}

