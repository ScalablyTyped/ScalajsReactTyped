package typingsJapgolly.reactNavigation.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactNavigation.mod.NavigationInjectedProps
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRef[T /* <: ComponentClassP[P & js.Object] */, P /* <: NavigationInjectedProps[NavigationParams] */] extends StObject {
  
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}
object OnRef {
  
  inline def apply[T /* <: ComponentClassP[P & js.Object] */, P /* <: NavigationInjectedProps[NavigationParams] */](): OnRef[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnRef[T, P]]
  }
  
  extension [Self <: OnRef[?, ?], T /* <: ComponentClassP[P & js.Object] */, P /* <: NavigationInjectedProps[NavigationParams] */](x: Self & (OnRef[T, P])) {
    
    inline def setOnRef(value: Ref[InstanceType[T]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    inline def setOnRefFunction1(value: InstanceType[T] | Null => Callback): Self = StObject.set(x, "onRef", js.Any.fromFunction1((t0: InstanceType[T] | Null) => value(t0).runNow()))
    
    inline def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    inline def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
