package typingsJapgolly.reactNavigation.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactNavigation.mod.NavigationFocusInjectedProps
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[T /* <: ComponentClassP[P & js.Object] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */] extends StObject {
  
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}
object `4` {
  
  inline def apply[T /* <: ComponentClassP[P & js.Object] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */](): `4`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[T, P]]
  }
  
  extension [Self <: `4`[?, ?], T /* <: ComponentClassP[P & js.Object] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */](x: Self & (`4`[T, P])) {
    
    inline def setOnRef(value: Ref[InstanceType[T]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    inline def setOnRefFunction1(value: InstanceType[T] | Null => Callback): Self = StObject.set(x, "onRef", js.Any.fromFunction1((t0: InstanceType[T] | Null) => value(t0).runNow()))
    
    inline def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    inline def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
