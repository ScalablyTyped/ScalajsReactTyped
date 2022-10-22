package typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod

import typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleMultiDataRef
import typingsJapgolly.vegaTypings.typesSpecScaleMod.UnionSortField
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgScaleMultiDataRefWithSort
  extends StObject
     with ScaleMultiDataRef {
  
  @JSName("fields")
  var fields_VgScaleMultiDataRefWithSort: js.Array[js.Array[Any] | VgScaleDataRefWithSort | SignalRef]
  
  var sort: js.UndefOr[UnionSortField] = js.undefined
}
object VgScaleMultiDataRefWithSort {
  
  inline def apply(fields: js.Array[js.Array[Any] | VgScaleDataRefWithSort | SignalRef]): VgScaleMultiDataRefWithSort = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgScaleMultiDataRefWithSort]
  }
  
  extension [Self <: VgScaleMultiDataRefWithSort](x: Self) {
    
    inline def setFields(value: js.Array[js.Array[Any] | VgScaleDataRefWithSort | SignalRef]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (js.Array[Any] | VgScaleDataRefWithSort | SignalRef)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setSort(value: UnionSortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
