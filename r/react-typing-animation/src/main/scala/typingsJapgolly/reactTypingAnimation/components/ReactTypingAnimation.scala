package typingsJapgolly.reactTypingAnimation.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactTypingAnimation.mod.Typing.BackspaceProperties
import typingsJapgolly.reactTypingAnimation.mod.Typing.DelayProperties
import typingsJapgolly.reactTypingAnimation.mod.Typing.ResetProperties
import typingsJapgolly.reactTypingAnimation.mod.Typing.SpeedProperties
import typingsJapgolly.reactTypingAnimation.mod.TypingProps
import typingsJapgolly.reactTypingAnimation.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTypingAnimation {
  
  object Backspace {
    
    @JSImport("react-typing-animation", "default.Backspace")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactTypingAnimation.mod.default.Backspace] {
      
      inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
      
      inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
      
      inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Backspace.type): typingsJapgolly.reactTypingAnimation.components.ReactTypingAnimation.Backspace.Builder = new typingsJapgolly.reactTypingAnimation.components.ReactTypingAnimation.Backspace.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BackspaceProperties): typingsJapgolly.reactTypingAnimation.components.ReactTypingAnimation.Backspace.Builder = new typingsJapgolly.reactTypingAnimation.components.ReactTypingAnimation.Backspace.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Delay {
    
    inline def apply(ms: Double): Default[typingsJapgolly.reactTypingAnimation.mod.default.Delay] = {
      val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
      new Default[typingsJapgolly.reactTypingAnimation.mod.default.Delay](js.Array(this.component, __props.asInstanceOf[DelayProperties]))
    }
    
    @JSImport("react-typing-animation", "default.Delay")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: DelayProperties): Default[typingsJapgolly.reactTypingAnimation.mod.default.Delay] = new Default[typingsJapgolly.reactTypingAnimation.mod.default.Delay](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Reset {
    
    @JSImport("react-typing-animation", "default.Reset")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactTypingAnimation.mod.default.Reset] {
      
      inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
      
      inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
      
      inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Reset.type): typingsJapgolly.reactTypingAnimation.components.ReactTypingAnimation.Reset.Builder = new typingsJapgolly.reactTypingAnimation.components.ReactTypingAnimation.Reset.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ResetProperties): typingsJapgolly.reactTypingAnimation.components.ReactTypingAnimation.Reset.Builder = new typingsJapgolly.reactTypingAnimation.components.ReactTypingAnimation.Reset.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Speed {
    
    inline def apply(ms: Double): Default[typingsJapgolly.reactTypingAnimation.mod.default.Speed] = {
      val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
      new Default[typingsJapgolly.reactTypingAnimation.mod.default.Speed](js.Array(this.component, __props.asInstanceOf[SpeedProperties]))
    }
    
    @JSImport("react-typing-animation", "default.Speed")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: SpeedProperties): Default[typingsJapgolly.reactTypingAnimation.mod.default.Speed] = new Default[typingsJapgolly.reactTypingAnimation.mod.default.Speed](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-typing-animation", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cursor(value: VdomNode): this.type = set("cursor", value.rawNode.asInstanceOf[js.Any])
    
    inline def cursorClassName(value: String): this.type = set("cursorClassName", value.asInstanceOf[js.Any])
    
    inline def cursorNull: this.type = set("cursor", null)
    
    inline def cursorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("cursor", js.Array(value*))
    
    inline def cursorVdomElement(value: VdomElement): this.type = set("cursor", value.rawElement.asInstanceOf[js.Any])
    
    inline def hideCursor(value: Boolean): this.type = set("hideCursor", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def onAfterType(value: Callback): this.type = set("onAfterType", value.toJsFn)
    
    inline def onBeforeType(value: Callback): this.type = set("onBeforeType", value.toJsFn)
    
    inline def onFinishedTyping(value: Callback): this.type = set("onFinishedTyping", value.toJsFn)
    
    inline def onStartedTyping(value: Callback): this.type = set("onStartedTyping", value.toJsFn)
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def startDelay(value: Double): this.type = set("startDelay", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactTypingAnimation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TypingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
