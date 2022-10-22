package typingsJapgolly.reactNavigation.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactNavigation.mod.NavigationFocusInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[T, P] extends StObject {
  
  var onRef: js.UndefOr[Ref[Component[T & NavigationFocusInjectedProps[P] & js.Object, js.Object]]] = js.undefined
}
object `5` {
  
  inline def apply[T, P](): `5`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[T, P]]
  }
  
  extension [Self <: `5`[?, ?], T, P](x: Self & (`5`[T, P])) {
    
    inline def setOnRef(value: Ref[Component[T & NavigationFocusInjectedProps[P] & js.Object, js.Object]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    inline def setOnRefFunction1(value: (Component[T & NavigationFocusInjectedProps[P] & js.Object, js.Object]) | Null => Callback): Self = StObject.set(x, "onRef", js.Any.fromFunction1((t0: (Component[T & NavigationFocusInjectedProps[P] & js.Object, js.Object]) | Null) => value(t0).runNow()))
    
    inline def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    inline def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
