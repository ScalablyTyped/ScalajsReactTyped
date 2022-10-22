package typingsJapgolly.inkTextAnimation

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.glitch
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.neon
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.pulse
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.radar
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.rainbow
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-text-animation", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InkTextAnimationProps, js.Object, Any]
  
  type InkTextAnimation = japgolly.scalajs.react.facade.React.Component[InkTextAnimationProps & js.Object, js.Object]
  
  trait InkTextAnimationProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var name: js.UndefOr[rainbow | pulse | glitch | radar | neon] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object InkTextAnimationProps {
    
    inline def apply(): InkTextAnimationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InkTextAnimationProps]
    }
    
    extension [Self <: InkTextAnimationProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setName(value: rainbow | pulse | glitch | radar | neon): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
}
