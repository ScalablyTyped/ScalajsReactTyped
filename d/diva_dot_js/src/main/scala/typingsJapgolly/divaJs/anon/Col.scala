package typingsJapgolly.divaJs.anon

import typingsJapgolly.divaJs.interfacesMod.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Col extends StObject {
  
  var col: Double
  
  var dimensions: typingsJapgolly.divaJs.interfacesMod.Dimensions
  
  var offset: Offset
  
  var row: Double
  
  var url: String
}
object Col {
  
  inline def apply(
    col: Double,
    dimensions: typingsJapgolly.divaJs.interfacesMod.Dimensions,
    offset: Offset,
    row: Double,
    url: String
  ): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  
  extension [Self <: Col](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: typingsJapgolly.divaJs.interfacesMod.Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
