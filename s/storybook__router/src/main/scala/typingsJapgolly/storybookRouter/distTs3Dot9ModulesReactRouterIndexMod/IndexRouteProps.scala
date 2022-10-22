package typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.storybookRouter.storybookRouterBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexRouteProps extends StObject {
  
  var element: js.UndefOr[Element | Null] = js.undefined
  
  var index: `true`
}
object IndexRouteProps {
  
  inline def apply(): IndexRouteProps = {
    val __obj = js.Dynamic.literal(index = true)
    __obj.asInstanceOf[IndexRouteProps]
  }
  
  extension [Self <: IndexRouteProps](x: Self) {
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIndex(value: `true`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
