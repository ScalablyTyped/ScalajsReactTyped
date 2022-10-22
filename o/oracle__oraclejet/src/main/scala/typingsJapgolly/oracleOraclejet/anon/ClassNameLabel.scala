package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameLabel[K, D] extends StObject {
  
  var className: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  
  var label: ClassNameRenderer[K, D]
  
  var renderer: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], `1` | Unit | Null]) | Null] = js.undefined
  
  var resizable: Height[K, D]
  
  var style: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}
object ClassNameLabel {
  
  inline def apply[K, D](label: ClassNameRenderer[K, D], resizable: Height[K, D]): ClassNameLabel[K, D] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameLabel[K, D]]
  }
  
  extension [Self <: ClassNameLabel[?, ?], K, D](x: Self & (ClassNameLabel[K, D])) {
    
    inline def setClassName(value: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction1(value: /* context */ HeaderContext[K, D] => String | Unit | Null): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setLabel(value: ClassNameRenderer[K, D]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: /* context */ HeaderContext[K, D] => `1` | Unit | Null): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setResizable(value: Height[K, D]): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction1(value: /* context */ HeaderContext[K, D] => String | Unit | Null): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
