package typingsJapgolly.detectPointer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectPointer extends js.Object {
  var anyCoarse: Boolean
  var anyFine: Boolean
  var anyNone: Boolean
  var coarse: Boolean
  var fine: Boolean
  var none: Boolean
  def update(): Unit
}

object detectPointer {
  @scala.inline
  def apply(
    anyCoarse: Boolean,
    anyFine: Boolean,
    anyNone: Boolean,
    coarse: Boolean,
    fine: Boolean,
    none: Boolean,
    update: Callback
  ): detectPointer = {
    val __obj = js.Dynamic.literal(anyCoarse = anyCoarse.asInstanceOf[js.Any], anyFine = anyFine.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], coarse = coarse.asInstanceOf[js.Any], fine = fine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[detectPointer]
  }
}

