package typingsJapgolly.reactHamburgerMenu.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactHamburgerMenu.mod.HamburgerMenuProps
import typingsJapgolly.reactHamburgerMenu.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHamburgerMenu {
  
  inline def apply(color: String, isOpen: Boolean, menuClicked: Callback): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], menuClicked = menuClicked.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[HamburgerMenuProps]))
  }
  
  @JSImport("react-hamburger-menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HamburgerMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
