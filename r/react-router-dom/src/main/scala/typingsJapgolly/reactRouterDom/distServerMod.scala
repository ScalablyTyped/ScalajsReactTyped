package typingsJapgolly.reactRouterDom

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactRouter.distLibContextMod.RouteObject
import typingsJapgolly.reactRouterDom.anon.PartialLocation
import typingsJapgolly.remixRunRouter.distRouterMod.Router
import typingsJapgolly.remixRunRouter.distRouterMod.StaticHandlerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerMod {
  
  @JSImport("react-router-dom/dist/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StaticRouter(hasBasenameChildrenLocationProp: StaticRouterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StaticRouter")(hasBasenameChildrenLocationProp.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def unstableCreateStaticRouter(routes: js.Array[RouteObject], context: StaticHandlerContext): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createStaticRouter")(routes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  inline def unstableStaticRouterProvider(hasBasenameContextRouterHydrateNonce: StaticRouterProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_StaticRouterProvider")(hasBasenameContextRouterHydrateNonce.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StaticRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var location: PartialLocation | String
  }
  object StaticRouterProps {
    
    inline def apply(location: PartialLocation | String): StaticRouterProps = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRouterProps]
    }
    
    extension [Self <: StaticRouterProps](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait StaticRouterProviderProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var context: StaticHandlerContext
    
    var hydrate: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var router: Router
  }
  object StaticRouterProviderProps {
    
    inline def apply(context: StaticHandlerContext, router: Router): StaticRouterProviderProps = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRouterProviderProps]
    }
    
    extension [Self <: StaticRouterProviderProps](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setContext(value: StaticHandlerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
}
