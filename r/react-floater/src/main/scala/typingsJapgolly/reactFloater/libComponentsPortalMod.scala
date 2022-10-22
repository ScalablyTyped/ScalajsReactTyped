package typingsJapgolly.reactFloater

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFloater.libTypesMod.PlacementOptions
import typingsJapgolly.reactFloater.libTypesMod.SelectorOrElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPortalMod {
  
  @JSImport("react-floater/lib/components/Portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait Props extends StObject {
    
    var children: Node
    
    var hasChildren: Boolean
    
    var placement: PlacementOptions
    
    var portalElement: js.UndefOr[SelectorOrElement] = js.undefined
    
    var target: js.UndefOr[SelectorOrElement] = js.undefined
    
    var zIndex: String | Double
  }
  object Props {
    
    inline def apply(hasChildren: Boolean, placement: PlacementOptions, zIndex: String | Double): Props = {
      val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: PlacementOptions): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPortalElement(value: SelectorOrElement): Self = StObject.set(x, "portalElement", value.asInstanceOf[js.Any])
      
      inline def setPortalElementNull: Self = StObject.set(x, "portalElement", null)
      
      inline def setPortalElementUndefined: Self = StObject.set(x, "portalElement", js.undefined)
      
      inline def setTarget(value: SelectorOrElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setZIndex(value: String | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
}
