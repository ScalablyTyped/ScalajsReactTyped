package typingsJapgolly.reactBootstrap.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.reactBootstrap.libOverlayMod.OverlayProps
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.bottom
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.left
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.right
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @JSImport("react-bootstrap", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrap.mod.Overlay] {
    
    inline def animation(value: Any): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def container(value: Any): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerPadding(value: Double): this.type = set("containerPadding", value.asInstanceOf[js.Any])
    
    inline def onEnter(value: /* node */ HTMLElement => Any): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    inline def onEntered(value: /* node */ HTMLElement => Any): this.type = set("onEntered", js.Any.fromFunction1(value))
    
    inline def onEntering(value: /* node */ HTMLElement => Any): this.type = set("onEntering", js.Any.fromFunction1(value))
    
    inline def onExit(value: /* node */ HTMLElement => Any): this.type = set("onExit", js.Any.fromFunction1(value))
    
    inline def onExited(value: /* node */ HTMLElement => Any): this.type = set("onExited", js.Any.fromFunction1(value))
    
    inline def onExiting(value: /* node */ HTMLElement => Any): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    inline def onHide(value: js.Function): this.type = set("onHide", value.asInstanceOf[js.Any])
    
    inline def placement(value: top | right | bottom | left): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def rootClose(value: Boolean): this.type = set("rootClose", value.asInstanceOf[js.Any])
    
    inline def shouldUpdatePosition(value: Boolean): this.type = set("shouldUpdatePosition", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def target(value: js.Function | ReactInstance): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Overlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
