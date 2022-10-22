package typingsJapgolly.reactTypingAnimation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactTypingAnimation.mod.Typing.BackspaceProperties
import typingsJapgolly.reactTypingAnimation.mod.Typing.DelayProperties
import typingsJapgolly.reactTypingAnimation.mod.Typing.ResetProperties
import typingsJapgolly.reactTypingAnimation.mod.Typing.SpeedProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-typing-animation", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TypingProps, js.Object, Any]
  object default {
    
    @JSImport("react-typing-animation", "default.Backspace")
    @js.native
    open class Backspace ()
      extends Component[BackspaceProperties, js.Object, Any]
    
    @JSImport("react-typing-animation", "default.Delay")
    @js.native
    open class Delay ()
      extends Component[DelayProperties, js.Object, Any]
    
    @JSImport("react-typing-animation", "default.Reset")
    @js.native
    open class Reset ()
      extends Component[ResetProperties, js.Object, Any]
    
    @JSImport("react-typing-animation", "default.Speed")
    @js.native
    open class Speed ()
      extends Component[SpeedProperties, js.Object, Any]
  }
  
  object Typing {
    
    type Backspace = japgolly.scalajs.react.facade.React.Component[BackspaceProperties & js.Object, js.Object]
    
    trait BackspaceProperties extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var speed: js.UndefOr[Double] = js.undefined
    }
    object BackspaceProperties {
      
      inline def apply(): BackspaceProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BackspaceProperties]
      }
      
      extension [Self <: BackspaceProperties](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      }
    }
    
    type Delay = japgolly.scalajs.react.facade.React.Component[DelayProperties & js.Object, js.Object]
    
    trait DelayProperties extends StObject {
      
      var ms: Double
    }
    object DelayProperties {
      
      inline def apply(ms: Double): DelayProperties = {
        val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
        __obj.asInstanceOf[DelayProperties]
      }
      
      extension [Self <: DelayProperties](x: Self) {
        
        inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      }
    }
    
    type Reset = japgolly.scalajs.react.facade.React.Component[ResetProperties & js.Object, js.Object]
    
    trait ResetProperties extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var speed: js.UndefOr[Double] = js.undefined
    }
    object ResetProperties {
      
      inline def apply(): ResetProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResetProperties]
      }
      
      extension [Self <: ResetProperties](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      }
    }
    
    type Speed = japgolly.scalajs.react.facade.React.Component[SpeedProperties & js.Object, js.Object]
    
    trait SpeedProperties extends StObject {
      
      var ms: Double
    }
    object SpeedProperties {
      
      inline def apply(ms: Double): SpeedProperties = {
        val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
        __obj.asInstanceOf[SpeedProperties]
      }
      
      extension [Self <: SpeedProperties](x: Self) {
        
        inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      }
    }
  }
  type Typing = japgolly.scalajs.react.facade.React.Component[TypingProps & js.Object, js.Object]
  
  trait TypingProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[Node] = js.undefined
    
    var cursorClassName: js.UndefOr[String] = js.undefined
    
    var hideCursor: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onAfterType: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onBeforeType: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFinishedTyping: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStartedTyping: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var startDelay: js.UndefOr[Double] = js.undefined
  }
  object TypingProps {
    
    inline def apply(): TypingProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[TypingProps]
    }
    
    extension [Self <: TypingProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCursor(value: VdomNode): Self = StObject.set(x, "cursor", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCursorClassName(value: String): Self = StObject.set(x, "cursorClassName", value.asInstanceOf[js.Any])
      
      inline def setCursorClassNameUndefined: Self = StObject.set(x, "cursorClassName", js.undefined)
      
      inline def setCursorNull: Self = StObject.set(x, "cursor", null)
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setCursorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cursor", js.Array(value*))
      
      inline def setCursorVdomElement(value: VdomElement): Self = StObject.set(x, "cursor", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      inline def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnAfterType(value: Callback): Self = StObject.set(x, "onAfterType", value.toJsFn)
      
      inline def setOnAfterTypeUndefined: Self = StObject.set(x, "onAfterType", js.undefined)
      
      inline def setOnBeforeType(value: Callback): Self = StObject.set(x, "onBeforeType", value.toJsFn)
      
      inline def setOnBeforeTypeUndefined: Self = StObject.set(x, "onBeforeType", js.undefined)
      
      inline def setOnFinishedTyping(value: Callback): Self = StObject.set(x, "onFinishedTyping", value.toJsFn)
      
      inline def setOnFinishedTypingUndefined: Self = StObject.set(x, "onFinishedTyping", js.undefined)
      
      inline def setOnStartedTyping(value: Callback): Self = StObject.set(x, "onStartedTyping", value.toJsFn)
      
      inline def setOnStartedTypingUndefined: Self = StObject.set(x, "onStartedTyping", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
    }
  }
}
