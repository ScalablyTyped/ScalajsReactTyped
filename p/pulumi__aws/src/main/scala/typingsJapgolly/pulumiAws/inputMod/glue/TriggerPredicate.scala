package typingsJapgolly.pulumiAws.inputMod.glue

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerPredicate extends js.Object {
  /**
    * A list of the conditions that determine when the trigger will fire. Defined below.
    */
  var conditions: Input[js.Array[Input[TriggerPredicateCondition]]] = js.native
  /**
    * How to handle multiple conditions. Defaults to `AND`. Valid values are `AND` or `ANY`.
    */
  var logical: js.UndefOr[Input[String]] = js.native
}

object TriggerPredicate {
  @scala.inline
  def apply(conditions: Input[js.Array[Input[TriggerPredicateCondition]]], logical: Input[String] = null): TriggerPredicate = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    if (logical != null) __obj.updateDynamic("logical")(logical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerPredicate]
  }
}

