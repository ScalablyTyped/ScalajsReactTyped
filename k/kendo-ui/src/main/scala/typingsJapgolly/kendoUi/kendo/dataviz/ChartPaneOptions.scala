package typingsJapgolly.kendoUi.kendo.dataviz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPaneOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ChartPaneOptions {
  
  inline def apply(): ChartPaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPaneOptions]
  }
  
  extension [Self <: ChartPaneOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
