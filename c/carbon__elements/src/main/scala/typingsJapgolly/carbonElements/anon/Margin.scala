package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`1rem`
import typingsJapgolly.carbonElements.carbonElementsStrings.`42rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Margin extends StObject {
  
  var columns: typingsJapgolly.carbonElements.carbonElementsInts.`8`
  
  var margin: `1rem`
  
  var width: `42rem`
}
object Margin {
  
  inline def apply(): Margin = {
    val __obj = js.Dynamic.literal(columns = 8, margin = "1rem", width = "42rem")
    __obj.asInstanceOf[Margin]
  }
  
  extension [Self <: Margin](x: Self) {
    
    inline def setColumns(value: typingsJapgolly.carbonElements.carbonElementsInts.`8`): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: `1rem`): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `42rem`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
