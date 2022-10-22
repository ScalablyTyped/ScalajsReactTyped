package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleField
import typingsJapgolly.vegaTypings.typesSpecScaleMod.SortOrder
import typingsJapgolly.vegaTypings.typesSpecScaleMod._UnionSortField
import typingsJapgolly.vegaTypings.vegaTypingsStrings.count
import typingsJapgolly.vegaTypings.vegaTypingsStrings.max
import typingsJapgolly.vegaTypings.vegaTypingsStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOp
  extends StObject
     with _UnionSortField {
  
  var field: ScaleField
  
  var op: count | min | max
  
  var order: js.UndefOr[SortOrder] = js.undefined
}
object FieldOp {
  
  inline def apply(field: ScaleField, op: count | min | max): FieldOp = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOp]
  }
  
  extension [Self <: FieldOp](x: Self) {
    
    inline def setField(value: ScaleField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOp(value: count | min | max): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
