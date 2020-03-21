package typingsJapgolly.openui5.sap.ui.unified

import typingsJapgolly.openui5.sap.ui.core.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.FileUploaderParameter")
@js.native
/**
  * Constructor for a new FileUploaderParameter.Accepts an object literal <code>mSettings</code> that
  * defines initialproperty values, aggregated and associated objects as well as event handlers.See
  * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
  * settings object.
  * @param sId id for the new control, generated automatically if no id is given
  * @param mSettings initial settings for the new control
  */
class FileUploaderParameter () extends Element {
  def this(mSettings: js.Any) = this()
  /**
    * Constructor for a new FileUploaderParameter.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>name</code>.The name of the hidden inputfield.
    * @since 1.12.2
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
  /**
    * Gets current value of property <code>value</code>.The value of the hidden inputfield.
    * @since 1.12.2
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  /**
    * Sets a new value for property <code>name</code>.The name of the hidden inputfield.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.12.2
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): FileUploaderParameter = js.native
  /**
    * Sets a new value for property <code>value</code>.The value of the hidden inputfield.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.12.2
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): FileUploaderParameter = js.native
}

