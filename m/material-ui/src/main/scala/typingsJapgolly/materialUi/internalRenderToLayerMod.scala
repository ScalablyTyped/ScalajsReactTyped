package typingsJapgolly.materialUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalRenderToLayerMod {
  
  @JSImport("material-ui/internal/RenderToLayer", JSImport.Default)
  @js.native
  open class default ()
    extends Component[RenderToLayerProps, js.Object, Any]
  
  type RenderToLayer = japgolly.scalajs.react.facade.React.Component[RenderToLayerProps & js.Object, js.Object]
  
  trait RenderToLayerProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var componentClickAway: js.UndefOr[js.Function] = js.undefined
    
    var open: Boolean
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[RenderToLayerProps & js.Object, js.Object]
        ]
      ] = js.undefined
    
    var render: js.Function
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  }
  object RenderToLayerProps {
    
    inline def apply(open: Boolean, render: js.Function): RenderToLayerProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderToLayerProps]
    }
    
    extension [Self <: RenderToLayerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponentClickAway(value: js.Function): Self = StObject.set(x, "componentClickAway", value.asInstanceOf[js.Any])
      
      inline def setComponentClickAwayUndefined: Self = StObject.set(x, "componentClickAway", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[RenderToLayerProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[RenderToLayerProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[RenderToLayerProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
    }
  }
}
