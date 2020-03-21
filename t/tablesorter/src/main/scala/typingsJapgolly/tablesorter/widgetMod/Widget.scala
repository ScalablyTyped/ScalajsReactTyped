package typingsJapgolly.tablesorter.widgetMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget[TElement] extends js.Object {
  /**
    * The identification of the widget.
    */
  var id: String
  /**
    * The default options of the widget.
    */
  var options: StringDictionary[js.Any]
  /**
    * The priority of the widget.
    */
  var priority: Double
  /**
    * Pre-processes the table after applying a sort.
    *
    * @param table
    * The table which is being processed.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    *
    * @param initializing
    * A value indicating whether the widget is being initialized.
    */
  def format(
    table: TElement,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any],
    initializing: Boolean
  ): Unit
  /**
    * Initializes the widget.
    *
    * @param table
    * The table which is being processed.
    *
    * @param thisWidget
    * This instance of the widget.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    */
  def init(
    table: TElement,
    thisWidget: this.type,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any]
  ): Unit
  /**
    * Removes the widget from the table.
    *
    * @param table
    * The table which is being processed.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    *
    * @param refreshing
    * A value indicating whether the widgets are being refreshed.
    */
  def remove(
    table: TElement,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any],
    refreshing: Boolean
  ): Unit
}

object Widget {
  @scala.inline
  def apply[TElement](
    format: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Callback,
    id: String,
    init: (TElement, Widget[TElement], TablesorterConfigurationStore[TElement], StringDictionary[js.Any]) => Callback,
    options: StringDictionary[js.Any],
    priority: Double,
    remove: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Callback
  ): Widget[TElement] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(js.Any.fromFunction4((t0: TElement, t1: typingsJapgolly.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore[TElement], t2: org.scalablytyped.runtime.StringDictionary[js.Any], t3: scala.Boolean) => format(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction4((t0: TElement, t1: typingsJapgolly.tablesorter.widgetMod.Widget[TElement], t2: typingsJapgolly.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore[TElement], t3: org.scalablytyped.runtime.StringDictionary[js.Any]) => init(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction4((t0: TElement, t1: typingsJapgolly.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore[TElement], t2: org.scalablytyped.runtime.StringDictionary[js.Any], t3: scala.Boolean) => remove(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Widget[TElement]]
  }
}

