package typingsJapgolly.titanium.Titanium.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A table view section is a container within a table used to organize table view rows.
		 */
trait TableViewSection extends Proxy {
  /**
  			 * Title of this section footer.
  			 */
  var footerTitle: String
  /**
  			 * View to use for this section footer.
  			 */
  var footerView: View
  /**
  			 * Title of this section header.
  			 */
  var headerTitle: String
  /**
  			 * View to use for this section header.
  			 */
  var headerView: View
  /**
  			 * Number of rows in this section.
  			 */
  val rowCount: Double
  /**
  			 * Rows in this section.
  			 */
  val rows: js.Array[TableViewRow]
  /**
  			 * Adds a table view row to this section.
  			 */
  def add(row: TableViewRow): Unit
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.footerTitle> property.
  			 */
  def getFooterTitle(): String
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.footerView> property.
  			 */
  def getFooterView(): View
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.headerTitle> property.
  			 */
  def getHeaderTitle(): String
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.headerView> property.
  			 */
  def getHeaderView(): View
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.rowCount> property.
  			 */
  def getRowCount(): Double
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.rows> property.
  			 */
  def getRows(): js.Array[TableViewRow]
  /**
  			 * Removes a table view row from this section.
  			 */
  def remove(row: TableViewRow): Unit
  /**
  			 * Returns a row in this section.
  			 */
  def rowAtIndex(index: Double): TableViewRow
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): Unit
}

object TableViewSection {
  @scala.inline
  def apply(
    add: TableViewRow => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    footerTitle: String,
    footerView: View,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getFooterTitle: CallbackTo[String],
    getFooterView: CallbackTo[View],
    getHeaderTitle: CallbackTo[String],
    getHeaderView: CallbackTo[View],
    getRowCount: CallbackTo[Double],
    getRows: CallbackTo[js.Array[TableViewRow]],
    headerTitle: String,
    headerView: View,
    remove: TableViewRow => Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    rowAtIndex: Double => CallbackTo[TableViewRow],
    rowCount: Double,
    rows: js.Array[TableViewRow],
    setBubbleParent: Boolean => Callback,
    setFooterTitle: String => Callback,
    setFooterView: js.Any => Callback,
    setHeaderTitle: String => Callback,
    setHeaderView: js.Any => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): TableViewSection = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], footerTitle = footerTitle.asInstanceOf[js.Any], footerView = footerView.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerView = headerView.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.UI.TableViewRow) => add(t0).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getFooterTitle")(getFooterTitle.toJsFn)
    __obj.updateDynamic("getFooterView")(getFooterView.toJsFn)
    __obj.updateDynamic("getHeaderTitle")(getHeaderTitle.toJsFn)
    __obj.updateDynamic("getHeaderView")(getHeaderView.toJsFn)
    __obj.updateDynamic("getRowCount")(getRowCount.toJsFn)
    __obj.updateDynamic("getRows")(getRows.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.UI.TableViewRow) => remove(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("rowAtIndex")(js.Any.fromFunction1((t0: scala.Double) => rowAtIndex(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setFooterTitle")(js.Any.fromFunction1((t0: java.lang.String) => setFooterTitle(t0).runNow()))
    __obj.updateDynamic("setFooterView")(js.Any.fromFunction1((t0: js.Any) => setFooterView(t0).runNow()))
    __obj.updateDynamic("setHeaderTitle")(js.Any.fromFunction1((t0: java.lang.String) => setHeaderTitle(t0).runNow()))
    __obj.updateDynamic("setHeaderView")(js.Any.fromFunction1((t0: js.Any) => setHeaderView(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewSection]
  }
}

