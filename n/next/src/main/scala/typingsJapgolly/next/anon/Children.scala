package typingsJapgolly.next.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.next.distServerAppRenderMod.FlightRouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: Node
  
  var hotReloader: js.UndefOr[Node] = js.undefined
  
  var initialCanonicalUrl: String
  
  var initialTree: FlightRouterState
}
object Children {
  
  inline def apply(initialCanonicalUrl: String, initialTree: FlightRouterState): Children = {
    val __obj = js.Dynamic.literal(initialCanonicalUrl = initialCanonicalUrl.asInstanceOf[js.Any], initialTree = initialTree.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHotReloader(value: VdomNode): Self = StObject.set(x, "hotReloader", value.rawNode.asInstanceOf[js.Any])
    
    inline def setHotReloaderNull: Self = StObject.set(x, "hotReloader", null)
    
    inline def setHotReloaderUndefined: Self = StObject.set(x, "hotReloader", js.undefined)
    
    inline def setHotReloaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "hotReloader", js.Array(value*))
    
    inline def setHotReloaderVdomElement(value: VdomElement): Self = StObject.set(x, "hotReloader", value.rawElement.asInstanceOf[js.Any])
    
    inline def setInitialCanonicalUrl(value: String): Self = StObject.set(x, "initialCanonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setInitialTree(value: FlightRouterState): Self = StObject.set(x, "initialTree", value.asInstanceOf[js.Any])
  }
}
