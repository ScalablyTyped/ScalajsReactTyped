package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ItemContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectable[K, D] extends StObject {
  
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.undefined
  
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}
object Selectable {
  
  inline def apply[K, D](): Selectable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selectable[K, D]]
  }
  
  extension [Self <: Selectable[?, ?], K, D](x: Self & (Selectable[K, D])) {
    
    inline def setRenderer(value: /* context */ ItemContext[K, D] => Callback): Self = StObject.set(x, "renderer", js.Any.fromFunction1((t0: /* context */ ItemContext[K, D]) => value(t0).runNow()))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSelectable(value: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableFunction1(value: /* context */ ItemContext[K, D] => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
