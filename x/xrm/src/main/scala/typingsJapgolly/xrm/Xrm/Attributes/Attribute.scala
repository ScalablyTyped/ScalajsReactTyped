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
  * Interface for an Entity attribute.
  */
trait Attribute extends js.Object {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control]
  /**
    * Adds a handler to be called when the attribute's value is changed.
    * @param handler The function reference.
    */
  def addOnChange(handler: ContextSensitiveHandler): Unit
  /**
    * Fire all "on change" event handlers.
    */
  def fireOnChange(): Unit
  /**
    * Gets attribute type.
    * @returns The attribute's type name.<BR><BR>
    * **Values returned are**:
    * * boolean
    * * datetime
    * * decimal
    * * double
    * * integer
    * * lookup
    * * memo
    * * money
    * * optionset
    * * string
    */
  def getAttributeType(): AttributeType
  /**
    * Gets the attribute format.
    * @returns The format of the attribute.<BR><BR>
    * **Values returned are**:
    * * date           (datetime)
    * * datetime       (datetime)
    * * duration       (integer)
    * * email          (string)
    * * language       (optionset)
    * * none           (integer)
    * * phone          (string)
    * * text           (string)
    * * textarea       (string)
    * * tickersymbol   (string)
    * * timezone       (optionset)
    * * url            (string)
    * @see {@link getAttributeType}
    */
  def getFormat(): AttributeFormat
  /**
    * Gets a boolean value indicating whether this Attribute has unsaved changes.
    * @returns true if there are unsaved changes, otherwise false.
    */
  def getIsDirty(): Boolean
  /**
    * Gets the logical name of the attribute.
    * @returns The logical name.
    */
  def getName(): String
  /**
    * Gets a reference to the record context of this attribute.
    * @returns The parent record context.
    */
  def getParent(): Entity
  /**
    * Gets the current level of requirement for the attribute.
    * @returns The required level, as either "none", "required", or "recommended"
    */
  def getRequiredLevel(): RequirementLevel
  /**
    * Gets current submit mode for the attribute.
    * @returns The submit mode, as either "always", "never", or "dirty"
    * @remarks The default value is "dirty"
    */
  def getSubmitMode(): SubmitMode
  /**
    * Gets the current user's privileges for the attribute.
    * @returns The user privileges.
    */
  def getUserPrivilege(): Privilege
  /**
    * Gets the value.
    * @returns The value.
    */
  def getValue(): js.Any
  /**
    * Removes the handler from the "on change" event.
    * @param handler The handler.
    */
  def removeOnChange(handler: ContextSensitiveHandler): Unit
  /**
    * Sets the required level.
    * @param requirementLevel The requirement level, as either "none", "required", or "recommended"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setRequiredLevel(requirementLevel: RequirementLevel): Unit
  /**
    * Sets the submit mode.
    * @param submitMode The submit mode, as either "always", "never", or "dirty".
    * @default submitMode "dirty"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setSubmitMode(submitMode: SubmitMode): Unit
  /**
    * Sets the value.
    * @param value The value.
    */
  def setValue(value: js.Any): Unit
}

object Attribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Callback,
    controls: ItemCollection[Control],
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
    setValue: js.Any => Callback
  ): Attribute = {
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
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: js.Any) => setValue(t0).runNow()))
    __obj.asInstanceOf[Attribute]
  }
}

