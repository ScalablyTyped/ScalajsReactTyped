package typingsJapgolly.openui5.sap.m.semantic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.semantic.PositiveAction")
@js.native
class PositiveAction protected () extends SemanticButton {
  /**
    * Constructor for a new PositiveAction.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings custom initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>text</code>.Button text
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Sets a new value for property <code>text</code>.Button textWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): PositiveAction = js.native
}

