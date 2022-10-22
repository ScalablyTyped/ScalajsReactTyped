package typingsJapgolly.reactMotionUiPack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import typingsJapgolly.reactMotionUiPack.mod.Transition.TransitionProps
import typingsJapgolly.reactMotionUiPack.mod.default.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMotionUiPack {
  
  object ReactMotionUiPack {
    
    @JSImport("react-motion-ui-pack", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[^] {
      
      inline def appear(value: Style): this.type = set("appear", value.asInstanceOf[js.Any])
      
      inline def component(value: String | Boolean | Element): this.type = set("component", value.asInstanceOf[js.Any])
      
      inline def componentVdomElement(value: VdomElement): this.type = set("component", value.rawElement.asInstanceOf[js.Any])
      
      inline def enter(value: Style): this.type = set("enter", value.asInstanceOf[js.Any])
      
      inline def leave(value: Style): this.type = set("leave", value.asInstanceOf[js.Any])
      
      inline def onEnter(value: /* style */ PlainStyle => Callback): this.type = set("onEnter", js.Any.fromFunction1((t0: /* style */ PlainStyle) => value(t0).runNow()))
      
      inline def onLeave(value: /* style */ Style => Callback): this.type = set("onLeave", js.Any.fromFunction1((t0: /* style */ Style) => value(t0).runNow()))
      
      inline def runOnMount(value: Boolean): this.type = set("runOnMount", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: ReactMotionUiPack.type): typingsJapgolly.reactMotionUiPack.components.ReactMotionUiPack.ReactMotionUiPack.Builder = new typingsJapgolly.reactMotionUiPack.components.ReactMotionUiPack.ReactMotionUiPack.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransitionProps): typingsJapgolly.reactMotionUiPack.components.ReactMotionUiPack.ReactMotionUiPack.Builder = new typingsJapgolly.reactMotionUiPack.components.ReactMotionUiPack.ReactMotionUiPack.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-motion-ui-pack", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appear(value: Style): this.type = set("appear", value.asInstanceOf[js.Any])
    
    inline def component(value: String | Boolean | Element): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def componentVdomElement(value: VdomElement): this.type = set("component", value.rawElement.asInstanceOf[js.Any])
    
    inline def enter(value: Style): this.type = set("enter", value.asInstanceOf[js.Any])
    
    inline def leave(value: Style): this.type = set("leave", value.asInstanceOf[js.Any])
    
    inline def onEnter(value: /* style */ PlainStyle => Callback): this.type = set("onEnter", js.Any.fromFunction1((t0: /* style */ PlainStyle) => value(t0).runNow()))
    
    inline def onLeave(value: /* style */ Style => Callback): this.type = set("onLeave", js.Any.fromFunction1((t0: /* style */ Style) => value(t0).runNow()))
    
    inline def runOnMount(value: Boolean): this.type = set("runOnMount", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactMotionUiPack.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
