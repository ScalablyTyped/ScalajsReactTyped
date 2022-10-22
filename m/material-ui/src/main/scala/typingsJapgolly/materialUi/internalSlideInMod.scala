package typingsJapgolly.materialUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUi.MaterialUI.propTypes.direction
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalSlideInMod {
  
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SlideInProps, js.Object, Any]
  
  type SlideIn = japgolly.scalajs.react.facade.React.Component[SlideInProps & js.Object, js.Object]
  
  trait SlideInProps extends StObject {
    
    var childStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var direction: js.UndefOr[typingsJapgolly.materialUi.MaterialUI.propTypes.direction] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[SlideInProps & js.Object, js.Object]
        ]
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SlideInProps {
    
    inline def apply(): SlideInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideInProps]
    }
    
    extension [Self <: SlideInProps](x: Self) {
      
      inline def setChildStyle(value: CSSProperties): Self = StObject.set(x, "childStyle", value.asInstanceOf[js.Any])
      
      inline def setChildStyleUndefined: Self = StObject.set(x, "childStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[SlideInProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[SlideInProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[SlideInProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
