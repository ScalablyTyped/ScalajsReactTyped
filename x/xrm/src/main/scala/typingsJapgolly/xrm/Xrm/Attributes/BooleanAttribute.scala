package typingsJapgolly.xrm.Xrm.Attributes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Collection.ItemCollection
import typingsJapgolly.xrm.Xrm.Controls.Control
import typingsJapgolly.xrm.Xrm.Entity
import typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler
import typingsJapgolly.xrm.Xrm.Privilege
import typingsJapgolly.xrm.Xrm.SubmitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Boolean attribute.
  * @see {@link EnumAttribute}
  */
trait BooleanAttribute extends EnumAttribute {
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: Boolean): Unit
}

object BooleanAttribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Callback,
    controls: ItemCollection[Control],
    fireOnChange: Callback,
    getAttributeType: CallbackTo[AttributeType],
    getFormat: CallbackTo[AttributeFormat],
    getInitialValue: CallbackTo[Double | Boolean],
    getIsDirty: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getParent: CallbackTo[Entity],
    getRequiredLevel: CallbackTo[RequirementLevel],
    getSubmitMode: CallbackTo[SubmitMode],
    getUserPrivilege: CallbackTo[Privilege],
    getValue: CallbackTo[js.Any],
    removeOnChange: ContextSensitiveHandler => Callback,
    setRequiredLevel: RequirementLevel => Callback,
    setSubmitMode: SubmitMode => Callback,
    setValue: Boolean => Callback
  ): BooleanAttribute = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any])
    __obj.updateDynamic("addOnChange")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler) => addOnChange(t0).runNow()))
    __obj.updateDynamic("fireOnChange")(fireOnChange.toJsFn)
    __obj.updateDynamic("getAttributeType")(getAttributeType.toJsFn)
    __obj.updateDynamic("getFormat")(getFormat.toJsFn)
    __obj.updateDynamic("getInitialValue")(getInitialValue.toJsFn)
    __obj.updateDynamic("getIsDirty")(getIsDirty.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getRequiredLevel")(getRequiredLevel.toJsFn)
    __obj.updateDynamic("getSubmitMode")(getSubmitMode.toJsFn)
    __obj.updateDynamic("getUserPrivilege")(getUserPrivilege.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("removeOnChange")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler) => removeOnChange(t0).runNow()))
    __obj.updateDynamic("setRequiredLevel")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.Attributes.RequirementLevel) => setRequiredLevel(t0).runNow()))
    __obj.updateDynamic("setSubmitMode")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.SubmitMode) => setSubmitMode(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: scala.Boolean) => setValue(t0).runNow()))
    __obj.asInstanceOf[BooleanAttribute]
  }
}

