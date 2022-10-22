package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endcolumn extends StObject {
  
  var end_column: js.UndefOr[Double] = js.undefined
  
  var end_line: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var start_column: js.UndefOr[Double] = js.undefined
  
  var start_line: js.UndefOr[Double] = js.undefined
}
object Endcolumn {
  
  inline def apply(): Endcolumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endcolumn]
  }
  
  extension [Self <: Endcolumn](x: Self) {
    
    inline def setEnd_column(value: Double): Self = StObject.set(x, "end_column", value.asInstanceOf[js.Any])
    
    inline def setEnd_columnUndefined: Self = StObject.set(x, "end_column", js.undefined)
    
    inline def setEnd_line(value: Double): Self = StObject.set(x, "end_line", value.asInstanceOf[js.Any])
    
    inline def setEnd_lineUndefined: Self = StObject.set(x, "end_line", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setStart_column(value: Double): Self = StObject.set(x, "start_column", value.asInstanceOf[js.Any])
    
    inline def setStart_columnUndefined: Self = StObject.set(x, "start_column", js.undefined)
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    inline def setStart_lineUndefined: Self = StObject.set(x, "start_line", js.undefined)
  }
}
