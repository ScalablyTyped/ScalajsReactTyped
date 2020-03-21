package typingsJapgolly.titanium.Titanium.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Font
import typingsJapgolly.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A picker column, representing a selectable group of items in a <Titanium.UI.Picker>.
		 */
trait PickerColumn extends Proxy {
  /**
  			 * Font to use for text.
  			 */
  var font: Font
  /**
  			 * Number of rows in this column.
  			 */
  val rowCount: Double
  /**
  			 * Rows of this column.
  			 */
  val rows: js.Array[PickerRow]
  /**
  			 * Adds a row to this column.
  			 */
  def addRow(row: PickerRow): Unit
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.font> property.
  			 */
  def getFont(): Font
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.rowCount> property.
  			 */
  def getRowCount(): Double
  /**
  			 * Gets the value of the <Titanium.UI.PickerColumn.rows> property.
  			 */
  def getRows(): js.Array[PickerRow]
  /**
  			 * Removes a row from this column.
  			 */
  def removeRow(row: PickerRow): Unit
  /**
  			 * Sets the value of the <Titanium.UI.PickerColumn.font> property.
  			 */
  def setFont(font: Font): Unit
}

object PickerColumn {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    addRow: PickerRow => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    font: Font,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getFont: CallbackTo[Font],
    getRowCount: CallbackTo[Double],
    getRows: CallbackTo[js.Array[PickerRow]],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    removeRow: PickerRow => Callback,
    rowCount: Double,
    rows: js.Array[PickerRow],
    setBubbleParent: Boolean => Callback,
    setFont: Font => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PickerColumn = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("addRow")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.UI.PickerRow) => addRow(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getFont")(getFont.toJsFn)
    __obj.updateDynamic("getRowCount")(getRowCount.toJsFn)
    __obj.updateDynamic("getRows")(getRows.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeRow")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.UI.PickerRow) => removeRow(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setFont")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Font) => setFont(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerColumn]
  }
}

