package typingsJapgolly.materialUiCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.materialUiCoreStrings.down
import typingsJapgolly.materialUiCore.materialUiCoreStrings.left
import typingsJapgolly.materialUiCore.materialUiCoreStrings.right
import typingsJapgolly.materialUiCore.materialUiCoreStrings.up
import typingsJapgolly.materialUiCore.slideSlideMod.SlideProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slide {
  
  @JSImport("@material-ui/core", "Slide")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def addEndListener(value: Any): this.type = set("addEndListener", value.asInstanceOf[js.Any])
    
    inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    
    inline def direction(value: left | right | up | down): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
    
    inline def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    
    inline def in(value: Any): this.type = set("in", value.asInstanceOf[js.Any])
    
    inline def mountOnEnter(value: Any): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def onEnter(value: Any): this.type = set("onEnter", value.asInstanceOf[js.Any])
    
    inline def onEntered(value: Any): this.type = set("onEntered", value.asInstanceOf[js.Any])
    
    inline def onEntering(value: Any): this.type = set("onEntering", value.asInstanceOf[js.Any])
    
    inline def onExit(value: Any): this.type = set("onExit", value.asInstanceOf[js.Any])
    
    inline def onExited(value: Any): this.type = set("onExited", value.asInstanceOf[js.Any])
    
    inline def onExiting(value: Any): this.type = set("onExiting", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Any): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def unmountOnExit(value: Any): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slide.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SlideProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
