package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleField
import typingsJapgolly.vegaTypings.typesSpecScaleMod.SortOrder
import typingsJapgolly.vegaTypings.typesSpecScaleMod._SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Op
  extends StObject
     with _SortField {
  
  var field: js.UndefOr[ScaleField] = js.undefined
  
  var op: ScaleField
  
  var order: js.UndefOr[SortOrder] = js.undefined
}
object Op {
  
  inline def apply(op: ScaleField): Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
  
  extension [Self <: Op](x: Self) {
    
    inline def setField(value: ScaleField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: ScaleField): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
