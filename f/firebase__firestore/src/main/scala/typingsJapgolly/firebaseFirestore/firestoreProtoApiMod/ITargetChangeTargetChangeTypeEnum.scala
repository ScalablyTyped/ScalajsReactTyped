package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetChangeTargetChangeTypeEnum extends js.Object {
  var ADD: TargetChangeTargetChangeType
  var CURRENT: TargetChangeTargetChangeType
  var NO_CHANGE: TargetChangeTargetChangeType
  var REMOVE: TargetChangeTargetChangeType
  var RESET: TargetChangeTargetChangeType
  def values(): js.Array[TargetChangeTargetChangeType]
}

object ITargetChangeTargetChangeTypeEnum {
  @scala.inline
  def apply(
    ADD: TargetChangeTargetChangeType,
    CURRENT: TargetChangeTargetChangeType,
    NO_CHANGE: TargetChangeTargetChangeType,
    REMOVE: TargetChangeTargetChangeType,
    RESET: TargetChangeTargetChangeType,
    values: CallbackTo[js.Array[TargetChangeTargetChangeType]]
  ): ITargetChangeTargetChangeTypeEnum = {
    val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], CURRENT = CURRENT.asInstanceOf[js.Any], NO_CHANGE = NO_CHANGE.asInstanceOf[js.Any], REMOVE = REMOVE.asInstanceOf[js.Any], RESET = RESET.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[ITargetChangeTargetChangeTypeEnum]
  }
}

