package typingsJapgolly.xrm.Xrm.Attributes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Collection.ItemCollection
import typingsJapgolly.xrm.Xrm.Controls.DateControl
import typingsJapgolly.xrm.Xrm.Entity
import typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler
import typingsJapgolly.xrm.Xrm.Privilege
import typingsJapgolly.xrm.Xrm.SubmitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Date attribute.
  *
  * @see {@link Attribute}
  */
trait DateAttribute extends Attribute {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @JSName("controls")
  var controls_DateAttribute: ItemCollection[DateControl]
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: js.Date): Unit
}

object DateAttribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Callback,
    controls: ItemCollection[DateControl],
    fireOnChange: Callback,
    getAttributeType: CallbackTo[AttributeType],
    getFormat: CallbackTo[AttributeFormat],
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
    setValue: js.Date => Callback
  ): DateAttribute = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any])
    __obj.updateDynamic("addOnChange")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler) => addOnChange(t0).runNow()))
    __obj.updateDynamic("fireOnChange")(fireOnChange.toJsFn)
    __obj.updateDynamic("getAttributeType")(getAttributeType.toJsFn)
    __obj.updateDynamic("getFormat")(getFormat.toJsFn)
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
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: js.Date) => setValue(t0).runNow()))
    __obj.asInstanceOf[DateAttribute]
  }
}

