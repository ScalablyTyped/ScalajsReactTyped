package typingsJapgolly.reactSelect.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMenuMod.CalculatedMenuPlacementAndHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPortalPlacement extends StObject {
  
  var getPortalPlacement: (js.Function1[/* menuState */ CalculatedMenuPlacementAndHeight, Unit]) | Null
}
object GetPortalPlacement {
  
  inline def apply(): GetPortalPlacement = {
    val __obj = js.Dynamic.literal(getPortalPlacement = null)
    __obj.asInstanceOf[GetPortalPlacement]
  }
  
  extension [Self <: GetPortalPlacement](x: Self) {
    
    inline def setGetPortalPlacement(value: /* menuState */ CalculatedMenuPlacementAndHeight => Callback): Self = StObject.set(x, "getPortalPlacement", js.Any.fromFunction1((t0: /* menuState */ CalculatedMenuPlacementAndHeight) => value(t0).runNow()))
    
    inline def setGetPortalPlacementNull: Self = StObject.set(x, "getPortalPlacement", null)
  }
}
