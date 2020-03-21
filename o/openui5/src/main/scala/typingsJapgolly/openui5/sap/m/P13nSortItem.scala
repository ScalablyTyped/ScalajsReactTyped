package typingsJapgolly.openui5.sap.m

import typingsJapgolly.openui5.sap.ui.core.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nSortItem")
@js.native
class P13nSortItem protected () extends Item {
  /**
    * Constructor for a new P13nSortItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>columnKey</code>.key of the column
    * @since 1.26.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): String = js.native
  /**
    * Gets current value of property <code>operation</code>.sap.m.P13nConditionOperation
    * @since 1.26.0
    * @returns Value of property <code>operation</code>
    */
  def getOperation(): String = js.native
  /**
    * Sets a new value for property <code>columnKey</code>.key of the columnWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: String): P13nSortItem = js.native
  /**
    * Sets a new value for property <code>operation</code>.sap.m.P13nConditionOperationWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.26.0
    * @param sOperation New value for property <code>operation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOperation(sOperation: String): P13nSortItem = js.native
}

