package typingsJapgolly.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: typingsJapgolly.orbitUiReactComponents.distLayoutSrcAdaptersMod.Direction
}
object Direction {
  
  inline def apply(direction: typingsJapgolly.orbitUiReactComponents.distLayoutSrcAdaptersMod.Direction): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: typingsJapgolly.orbitUiReactComponents.distLayoutSrcAdaptersMod.Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
