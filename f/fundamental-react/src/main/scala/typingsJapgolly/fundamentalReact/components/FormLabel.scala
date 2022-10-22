package typingsJapgolly.fundamentalReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.libFormsFormLabelMod.FormLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormLabel {
  
  @JSImport("fundamental-react", "FormLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def isInlineHelp(value: Boolean): this.type = set("isInlineHelp", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FormLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
