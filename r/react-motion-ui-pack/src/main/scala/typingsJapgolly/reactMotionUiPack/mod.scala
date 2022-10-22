package typingsJapgolly.reactMotionUiPack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import typingsJapgolly.reactMotionUiPack.mod.Transition.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-motion-ui-pack", JSImport.Default)
    @js.native
    open class ^ protected ()
      extends Component[TransitionProps, js.Object, Any] {
      def this(props: TransitionProps) = this()
      def this(props: TransitionProps, context: Any) = this()
    }
    
    @JSImport("react-motion-ui-pack", JSImport.Default)
    @js.native
    val ^ : js.Object & (ComponentClass[TransitionProps, js.Object]) = js.native
    
    type _To = js.Object & (ComponentClass[TransitionProps, js.Object])
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: js.Object & (ComponentClass[TransitionProps, js.Object]) = ^
  }
  
  object Transition {
    
    trait TransitionProps extends StObject {
      
      var appear: js.UndefOr[Style] = js.undefined
      
      var children: js.UndefOr[Node] = js.undefined
      
      var component: js.UndefOr[String | Boolean | Element] = js.undefined
      
      var enter: js.UndefOr[Style] = js.undefined
      
      var leave: js.UndefOr[Style] = js.undefined
      
      var onEnter: js.UndefOr[js.Function1[/* style */ PlainStyle, Unit]] = js.undefined
      
      var onLeave: js.UndefOr[js.Function1[/* style */ Style, Unit]] = js.undefined
      
      var runOnMount: js.UndefOr[Boolean] = js.undefined
    }
    object TransitionProps {
      
      inline def apply(): TransitionProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransitionProps]
      }
      
      extension [Self <: TransitionProps](x: Self) {
        
        inline def setAppear(value: Style): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
        
        inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setComponent(value: String | Boolean | Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
        
        inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
        
        inline def setComponentVdomElement(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
        
        inline def setEnter(value: Style): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
        
        inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
        
        inline def setLeave(value: Style): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
        
        inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
        
        inline def setOnEnter(value: /* style */ PlainStyle => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* style */ PlainStyle) => value(t0).runNow()))
        
        inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
        
        inline def setOnLeave(value: /* style */ Style => Callback): Self = StObject.set(x, "onLeave", js.Any.fromFunction1((t0: /* style */ Style) => value(t0).runNow()))
        
        inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
        
        inline def setRunOnMount(value: Boolean): Self = StObject.set(x, "runOnMount", value.asInstanceOf[js.Any])
        
        inline def setRunOnMountUndefined: Self = StObject.set(x, "runOnMount", js.undefined)
      }
    }
  }
}
