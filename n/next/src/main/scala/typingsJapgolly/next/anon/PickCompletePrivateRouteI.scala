package typingsJapgolly.next.anon

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/shared/lib/router/router.CompletePrivateRouteInfo, 'Component' | 'err'> */
trait PickCompletePrivateRouteI extends StObject {
  
  var Component: ComponentType[js.Object]
  
  var err: js.UndefOr[js.Error] = js.undefined
}
object PickCompletePrivateRouteI {
  
  inline def apply(Component: ComponentType[js.Object]): PickCompletePrivateRouteI = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCompletePrivateRouteI]
  }
  
  extension [Self <: PickCompletePrivateRouteI](x: Self) {
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
  }
}
