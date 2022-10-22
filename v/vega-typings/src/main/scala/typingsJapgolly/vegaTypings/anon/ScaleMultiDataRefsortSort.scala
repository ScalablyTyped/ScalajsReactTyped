package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleData
import typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleDataRef
import typingsJapgolly.vegaTypings.typesSpecScaleMod.SortField
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-typings.vega-typings/types/spec/scale.ScaleMultiDataRef & {  sort :vega-typings.vega-typings/types/spec/scale.SortField | undefined} */
trait ScaleMultiDataRefsortSort
  extends StObject
     with ScaleData {
  
  var fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]
  
  var sort: js.UndefOr[SortField] = js.undefined
}
object ScaleMultiDataRefsortSort {
  
  inline def apply(fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): ScaleMultiDataRefsortSort = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiDataRefsortSort]
  }
  
  extension [Self <: ScaleMultiDataRefsortSort](x: Self) {
    
    inline def setFields(value: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: ((js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
