package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style[K, D] extends StObject {
  
  var className: js.UndefOr[
    (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  
  var renderer: js.UndefOr[(js.Function1[/* context */ LabelContext[K, D], `1` | Unit | Null]) | Null] = js.undefined
  
  var style: js.UndefOr[
    (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}
object Style {
  
  inline def apply[K, D](): Style[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style[K, D]]
  }
  
  extension [Self <: Style[?, ?], K, D](x: Self & (Style[K, D])) {
    
    inline def setClassName(value: (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction1(value: /* context */ LabelContext[K, D] => String | Unit | Null): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setRenderer(value: /* context */ LabelContext[K, D] => `1` | Unit | Null): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setStyle(value: (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction1(value: /* context */ LabelContext[K, D] => String | Unit | Null): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
