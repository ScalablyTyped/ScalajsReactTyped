package typingsJapgolly.xrm.Xrm.ProcessFlow

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /**
    * Returns the logical name of the attribute associated to the step.
    * @returns The attribute.
    * @remarks Some steps don’t contain an attribute value.
    */
  def getAttribute(): String
  /**
    * Returns the name of the step.
    * @returns The name.
    */
  def getName(): String
  /**
    * Returns whether the step is required in the business process flow.
    * @returns true if required, false if not.
    * @remarks     Returns true if the step is marked as required in the Business Process Flow editor; otherwise, false.
    *              There is no connection between this value and the values you can change in the formContext.data.entity
    *              attribute RequiredLevel methods.
    */
  def isRequired(): Boolean
}

object Step {
  @scala.inline
  def apply(getAttribute: CallbackTo[String], getName: CallbackTo[String], isRequired: CallbackTo[Boolean]): Step = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttribute")(getAttribute.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("isRequired")(isRequired.toJsFn)
    __obj.asInstanceOf[Step]
  }
}

