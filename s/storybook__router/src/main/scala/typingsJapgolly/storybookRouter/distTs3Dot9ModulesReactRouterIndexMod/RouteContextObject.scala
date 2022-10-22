package typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteContextObject extends StObject {
  
  var matches: js.Array[RouteMatch[String]]
  
  var outlet: Element | Null
}
object RouteContextObject {
  
  inline def apply(matches: js.Array[RouteMatch[String]]): RouteContextObject = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], outlet = null)
    __obj.asInstanceOf[RouteContextObject]
  }
  
  extension [Self <: RouteContextObject](x: Self) {
    
    inline def setMatches(value: js.Array[RouteMatch[String]]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: RouteMatch[String]*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setOutlet(value: VdomElement): Self = StObject.set(x, "outlet", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOutletNull: Self = StObject.set(x, "outlet", null)
  }
}
