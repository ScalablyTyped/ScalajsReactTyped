package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexFieldModeEnum extends js.Object {
  var ASCENDING: IndexFieldMode
  var DESCENDING: IndexFieldMode
  var MODE_UNSPECIFIED: IndexFieldMode
  def values(): js.Array[IndexFieldMode]
}

object IIndexFieldModeEnum {
  @scala.inline
  def apply(
    ASCENDING: IndexFieldMode,
    DESCENDING: IndexFieldMode,
    MODE_UNSPECIFIED: IndexFieldMode,
    values: CallbackTo[js.Array[IndexFieldMode]]
  ): IIndexFieldModeEnum = {
    val __obj = js.Dynamic.literal(ASCENDING = ASCENDING.asInstanceOf[js.Any], DESCENDING = DESCENDING.asInstanceOf[js.Any], MODE_UNSPECIFIED = MODE_UNSPECIFIED.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IIndexFieldModeEnum]
  }
}

