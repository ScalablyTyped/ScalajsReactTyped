package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesDumbbellDataDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}
object SeriesDumbbellDataDragDropGuideBoxOptions {
  
  inline def apply(): SeriesDumbbellDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesDumbbellDataDragDropGuideBoxOptions]
  }
  
  extension [Self <: SeriesDumbbellDataDragDropGuideBoxOptions](x: Self) {
    
    inline def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
