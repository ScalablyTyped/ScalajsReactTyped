package typingsJapgolly.reactOffcanvas.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOffcanvas.mod.OffCanvasMenuProps
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.left
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OffCanvasMenu {
  
  @JSImport("react-offcanvas", "OffCanvasMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOffcanvas.mod.OffCanvasMenu] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def isMenuOpened(value: Boolean): this.type = set("isMenuOpened", value.asInstanceOf[js.Any])
    
    inline def position(value: left | right): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: OffCanvasMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OffCanvasMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
