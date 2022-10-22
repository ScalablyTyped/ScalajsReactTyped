package typingsJapgolly.reachRouter.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationProps extends StObject {
  
  var children: LocationProviderRenderFn
}
object LocationProps {
  
  inline def apply(children: /* context */ LocationContext => Node): LocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[LocationProps]
  }
  
  extension [Self <: LocationProps](x: Self) {
    
    inline def setChildren(value: /* context */ LocationContext => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
