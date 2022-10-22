package typingsJapgolly.reactOffcanvas.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactOffcanvas.mod.OffCanvasProps
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.left
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.overlay
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.parallax
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.push
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OffCanvas {
  
  @JSImport("react-offcanvas", "OffCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOffcanvas.mod.OffCanvas] {
    
    inline def effect(value: push | overlay | parallax): this.type = set("effect", value.asInstanceOf[js.Any])
    
    inline def isMenuOpened(value: Boolean): this.type = set("isMenuOpened", value.asInstanceOf[js.Any])
    
    inline def position(value: left | right): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: OffCanvas.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OffCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
