package typingsJapgolly.fundamentalReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.Text
import typingsJapgolly.fundamentalReact.libMultiInputMultiInputMod.MultiInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiInput {
  
  inline def apply(data: js.Array[Any]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MultiInputProps]))
  }
  
  @JSImport("fundamental-react", "MultiInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fundamentalReact.mod.MultiInput] {
    
    inline def buttonProps(value: Any): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: Any): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def listProps(value: Any): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    inline def onTagsUpdate(value: /* repeated */ Any => Any): this.type = set("onTagsUpdate", js.Any.fromFunction1(value))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: Any): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def tagProps(value: Any): this.type = set("tagProps", value.asInstanceOf[js.Any])
    
    inline def validationState(value: Text): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MultiInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
