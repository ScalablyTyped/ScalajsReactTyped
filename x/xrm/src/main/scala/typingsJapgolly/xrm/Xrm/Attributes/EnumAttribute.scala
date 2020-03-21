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
  * Common interface for enumeration attributes (OptionSet and Boolean).
  * @see {@link Attribute}
  */
trait EnumAttribute extends Attribute {
  /**
    * Gets the initial value of the attribute.
    * @returns The initial value.
    * @remarks Valid for OptionSet and boolean attribute types
    */
  def getInitialValue(): Double | Boolean
}

object EnumAttribute {
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
    setValue: js.Any => Callback
  ): EnumAttribute = {
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
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: js.Any) => setValue(t0).runNow()))
    __obj.asInstanceOf[EnumAttribute]
  }
}

