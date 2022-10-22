package typingsJapgolly.reactFlagIconCss.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFlagIconCss.mod.FlagIconFlip
import typingsJapgolly.reactFlagIconCss.mod.FlagIconProps
import typingsJapgolly.reactFlagIconCss.mod.FlagIconRotate
import typingsJapgolly.reactFlagIconCss.mod.FlagIconSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlagIcon {
  
  inline def apply(code: String): Builder = {
    val __props = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FlagIconProps]))
  }
  
  @JSImport("react-flag-icon-css", "FlagIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactFlagIconCss.mod.FlagIcon] {
    
    inline def Component(value: String): this.type = set("Component", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def flip(value: FlagIconFlip): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def rotate(value: FlagIconRotate): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def size(value: FlagIconSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def squared(value: Boolean): this.type = set("squared", value.asInstanceOf[js.Any])
    
    inline def styleName(value: String): this.type = set("styleName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlagIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
