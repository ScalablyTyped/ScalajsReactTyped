package typingsJapgolly.tablesorter

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsWidgetMod {
  
  trait Widget[TElement] extends StObject {
    
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
      widgetOptions: StringDictionary[Any],
      initializing: Boolean
    ): Unit
    
    /**
      * The identification of the widget.
      */
    var id: String
    
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
      widgetOptions: StringDictionary[Any]
    ): Unit
    
    /**
      * The default options of the widget.
      */
    var options: StringDictionary[Any]
    
    /**
      * The priority of the widget.
      */
    var priority: Double
    
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
      widgetOptions: StringDictionary[Any],
      refreshing: Boolean
    ): Unit
  }
  object Widget {
    
    inline def apply[TElement](
      format: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[Any], Boolean) => Callback,
      id: String,
      init: (TElement, Widget[TElement], TablesorterConfigurationStore[TElement], StringDictionary[Any]) => Callback,
      options: StringDictionary[Any],
      priority: Double,
      remove: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[Any], Boolean) => Callback
    ): Widget[TElement] = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction4((t0: TElement, t1: TablesorterConfigurationStore[TElement], t2: StringDictionary[Any], t3: Boolean) => (format(t0, t1, t2, t3)).runNow()), id = id.asInstanceOf[js.Any], init = js.Any.fromFunction4((t0: TElement, t1: Widget[TElement], t2: TablesorterConfigurationStore[TElement], t3: StringDictionary[Any]) => (init(t0, t1, t2, t3)).runNow()), options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], remove = js.Any.fromFunction4((t0: TElement, t1: TablesorterConfigurationStore[TElement], t2: StringDictionary[Any], t3: Boolean) => (remove(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[Widget[TElement]]
    }
    
    extension [Self <: Widget[?], TElement](x: Self & Widget[TElement]) {
      
      inline def setFormat(
        value: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[Any], Boolean) => Callback
      ): Self = StObject.set(x, "format", js.Any.fromFunction4((t0: TElement, t1: TablesorterConfigurationStore[TElement], t2: StringDictionary[Any], t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInit(
        value: (TElement, Widget[TElement], TablesorterConfigurationStore[TElement], StringDictionary[Any]) => Callback
      ): Self = StObject.set(x, "init", js.Any.fromFunction4((t0: TElement, t1: Widget[TElement], t2: TablesorterConfigurationStore[TElement], t3: StringDictionary[Any]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setRemove(
        value: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[Any], Boolean) => Callback
      ): Self = StObject.set(x, "remove", js.Any.fromFunction4((t0: TElement, t1: TablesorterConfigurationStore[TElement], t2: StringDictionary[Any], t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
}
