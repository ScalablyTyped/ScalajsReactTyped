package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexStateEnum extends js.Object {
  var CREATING: IndexState
  var ERROR: IndexState
  var READY: IndexState
  var STATE_UNSPECIFIED: IndexState
  def values(): js.Array[IndexState]
}

object IIndexStateEnum {
  @scala.inline
  def apply(
    CREATING: IndexState,
    ERROR: IndexState,
    READY: IndexState,
    STATE_UNSPECIFIED: IndexState,
    values: CallbackTo[js.Array[IndexState]]
  ): IIndexStateEnum = {
    val __obj = js.Dynamic.literal(CREATING = CREATING.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], STATE_UNSPECIFIED = STATE_UNSPECIFIED.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IIndexStateEnum]
  }
}

