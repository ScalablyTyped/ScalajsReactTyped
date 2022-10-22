package typingsJapgolly.reactNativeReanimated.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitioningViewProps
  extends StObject
     with ViewProps {
  
  var transition: japgolly.scalajs.react.facade.React.Node
}
object TransitioningViewProps {
  
  inline def apply(): TransitioningViewProps = {
    val __obj = js.Dynamic.literal(transition = null)
    __obj.asInstanceOf[TransitioningViewProps]
  }
  
  extension [Self <: TransitioningViewProps](x: Self) {
    
    inline def setTransition(value: VdomNode): Self = StObject.set(x, "transition", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTransitionNull: Self = StObject.set(x, "transition", null)
    
    inline def setTransitionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "transition", js.Array(value*))
    
    inline def setTransitionVdomElement(value: VdomElement): Self = StObject.set(x, "transition", value.rawElement.asInstanceOf[js.Any])
  }
}
