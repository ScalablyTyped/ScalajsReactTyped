package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typingsJapgolly.firebaseFirestore.firestoreProtoApiMod.OrderDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var direction: js.UndefOr[OrderDirection] = js.undefined
  var field: js.UndefOr[FieldReference] = js.undefined
}

object Order {
  @scala.inline
  def apply(direction: OrderDirection = null, field: FieldReference = null): Order = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

