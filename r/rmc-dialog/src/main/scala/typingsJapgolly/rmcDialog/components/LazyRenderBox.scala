package typingsJapgolly.rmcDialog.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcDialog.libLazyRenderBoxMod.ILazyRenderBoxPropTypes
import typingsJapgolly.rmcDialog.libLazyRenderBoxMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LazyRenderBox {
  
  @JSImport("rmc-dialog/lib/LazyRenderBox", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def hiddenClassName(value: String): this.type = set("hiddenClassName", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LazyRenderBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ILazyRenderBoxPropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
