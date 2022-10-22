package typingsJapgolly.vegaTypings.typesSpecScaleMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.anon.ScaleDataRefsortSortField
  - typingsJapgolly.vegaTypings.anon.ScaleMultiDataRefsortSort
  - typingsJapgolly.vegaTypings.anon.ScaleMultiFieldsRefsortSo
*/
trait ScaleData extends StObject
object ScaleData {
  
  inline def ScaleDataRefsortSortField(data: String, field: ScaleField): typingsJapgolly.vegaTypings.anon.ScaleDataRefsortSortField = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.ScaleDataRefsortSortField]
  }
  
  inline def ScaleMultiDataRefsortSort(fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): typingsJapgolly.vegaTypings.anon.ScaleMultiDataRefsortSort = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.ScaleMultiDataRefsortSort]
  }
  
  inline def ScaleMultiFieldsRefsortSo(data: String, fields: js.Array[ScaleField]): typingsJapgolly.vegaTypings.anon.ScaleMultiFieldsRefsortSo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.ScaleMultiFieldsRefsortSo]
  }
}
