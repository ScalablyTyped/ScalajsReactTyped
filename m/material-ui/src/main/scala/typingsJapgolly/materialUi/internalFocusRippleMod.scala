package typingsJapgolly.materialUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalFocusRippleMod {
  
  @JSImport("material-ui/internal/FocusRipple", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FocusRippleProps, js.Object, Any]
  
  type FocusRipple = japgolly.scalajs.react.facade.React.Component[FocusRippleProps & js.Object, js.Object]
  
  trait FocusRippleProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var innerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[FocusRippleProps & js.Object, js.Object]
        ]
      ] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FocusRippleProps {
    
    inline def apply(): FocusRippleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusRippleProps]
    }
    
    extension [Self <: FocusRippleProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setInnerStyle(value: CSSProperties): Self = StObject.set(x, "innerStyle", value.asInstanceOf[js.Any])
      
      inline def setInnerStyleUndefined: Self = StObject.set(x, "innerStyle", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[FocusRippleProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[FocusRippleProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[FocusRippleProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
