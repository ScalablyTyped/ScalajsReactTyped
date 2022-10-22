package typingsJapgolly.fundamentalReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.libIconIconMod.IconGlyph
import typingsJapgolly.fundamentalReact.libIconIconMod.IconProps
import typingsJapgolly.fundamentalReact.libIconIconMod.IconSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  inline def apply(glyph: IconGlyph): Builder = {
    val __props = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("fundamental-react", "Icon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def size(value: IconSize): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
