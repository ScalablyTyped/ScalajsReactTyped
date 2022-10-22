package typingsJapgolly.tablesorter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tablesorter.widgetsColumnWidgetOptionsMod.ColumnOptions
import typingsJapgolly.tablesorter.widgetsFilterOptionsMod.FilterOptions
import typingsJapgolly.tablesorter.widgetsPagerOptionsMod.PagerOptions
import typingsJapgolly.tablesorter.widgetsResizingOptionsMod.ResizingOptions
import typingsJapgolly.tablesorter.widgetsSaveSortOptionsMod.SaveSortOptions
import typingsJapgolly.tablesorter.widgetsStickyHeaderOptionsMod.StickyHeaderOptions
import typingsJapgolly.tablesorter.widgetsZebraOptionsMod.ZebraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsWidgetOptionsMod {
  
  trait WidgetOptions[TElement]
    extends StObject
       with ColumnOptions
       with FilterOptions[TElement]
       with ResizingOptions
       with SaveSortOptions
       with StickyHeaderOptions
       with PagerOptions[TElement]
       with ZebraOptions
       with /* option */ StringDictionary[Any]
  object WidgetOptions {
    
    inline def apply[TElement](): WidgetOptions[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetOptions[TElement]]
    }
  }
}
