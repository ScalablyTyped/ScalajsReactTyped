package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom plot`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom to top`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`left plot`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`right plot`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top plot`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top to bottom`
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.coupled
import typingsJapgolly.plotlyJs.plotlyJsStrings.independent
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  rows :number,   roworder :'top to bottom' | 'bottom to top',   columns :number,   subplots :std.Array<string>,   xaxes :std.Array<string>,   yaxes :std.Array<string>,   pattern :'independent' | 'coupled',   xgap :number,   ygap :number,   domain :std.Partial<{  x :std.Array<number>,   y :std.Array<number>}>,   xside :'bottom' | 'bottom plot' | 'top plot' | 'top',   yside :'left' | 'left plot' | 'right plot' | 'right'}> */
trait PartialrowsnumberroworderColumns extends StObject {
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var domain: js.UndefOr[Partial[X]] = js.undefined
  
  var pattern: js.UndefOr[independent | coupled] = js.undefined
  
  var roworder: js.UndefOr[(`top to bottom`) | (`bottom to top`)] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var subplots: js.UndefOr[js.Array[String]] = js.undefined
  
  var xaxes: js.UndefOr[js.Array[String]] = js.undefined
  
  var xgap: js.UndefOr[Double] = js.undefined
  
  var xside: js.UndefOr[bottom | (`bottom plot`) | (`top plot`) | top] = js.undefined
  
  var yaxes: js.UndefOr[js.Array[String]] = js.undefined
  
  var ygap: js.UndefOr[Double] = js.undefined
  
  var yside: js.UndefOr[left | (`left plot`) | (`right plot`) | right] = js.undefined
}
object PartialrowsnumberroworderColumns {
  
  inline def apply(): PartialrowsnumberroworderColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialrowsnumberroworderColumns]
  }
  
  extension [Self <: PartialrowsnumberroworderColumns](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setDomain(value: Partial[X]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setPattern(value: independent | coupled): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setRoworder(value: (`top to bottom`) | (`bottom to top`)): Self = StObject.set(x, "roworder", value.asInstanceOf[js.Any])
    
    inline def setRoworderUndefined: Self = StObject.set(x, "roworder", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSubplots(value: js.Array[String]): Self = StObject.set(x, "subplots", value.asInstanceOf[js.Any])
    
    inline def setSubplotsUndefined: Self = StObject.set(x, "subplots", js.undefined)
    
    inline def setSubplotsVarargs(value: String*): Self = StObject.set(x, "subplots", js.Array(value*))
    
    inline def setXaxes(value: js.Array[String]): Self = StObject.set(x, "xaxes", value.asInstanceOf[js.Any])
    
    inline def setXaxesUndefined: Self = StObject.set(x, "xaxes", js.undefined)
    
    inline def setXaxesVarargs(value: String*): Self = StObject.set(x, "xaxes", js.Array(value*))
    
    inline def setXgap(value: Double): Self = StObject.set(x, "xgap", value.asInstanceOf[js.Any])
    
    inline def setXgapUndefined: Self = StObject.set(x, "xgap", js.undefined)
    
    inline def setXside(value: bottom | (`bottom plot`) | (`top plot`) | top): Self = StObject.set(x, "xside", value.asInstanceOf[js.Any])
    
    inline def setXsideUndefined: Self = StObject.set(x, "xside", js.undefined)
    
    inline def setYaxes(value: js.Array[String]): Self = StObject.set(x, "yaxes", value.asInstanceOf[js.Any])
    
    inline def setYaxesUndefined: Self = StObject.set(x, "yaxes", js.undefined)
    
    inline def setYaxesVarargs(value: String*): Self = StObject.set(x, "yaxes", js.Array(value*))
    
    inline def setYgap(value: Double): Self = StObject.set(x, "ygap", value.asInstanceOf[js.Any])
    
    inline def setYgapUndefined: Self = StObject.set(x, "ygap", js.undefined)
    
    inline def setYside(value: left | (`left plot`) | (`right plot`) | right): Self = StObject.set(x, "yside", value.asInstanceOf[js.Any])
    
    inline def setYsideUndefined: Self = StObject.set(x, "yside", js.undefined)
  }
}
