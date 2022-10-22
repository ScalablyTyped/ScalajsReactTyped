package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBounceAnimationMod {
  
  @JSImport("wix-style-react/dist/types/BounceAnimation", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[BounceAnimationProps, js.Object, Any]
  
  type BounceAnimation = PureComponent[BounceAnimationProps, js.Object, Any]
  
  trait BounceAnimationProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: Node
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[String | Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* event */ ReactAnimationEventFrom[HTMLDivElement], Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* event */ ReactAnimationEventFrom[HTMLDivElement], Unit]] = js.undefined
  }
  object BounceAnimationProps {
    
    inline def apply(): BounceAnimationProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[BounceAnimationProps]
    }
    
    extension [Self <: BounceAnimationProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDelay(value: String | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnEnd(value: /* event */ ReactAnimationEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction1((t0: /* event */ ReactAnimationEventFrom[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: /* event */ ReactAnimationEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: /* event */ ReactAnimationEventFrom[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
