package typingsJapgolly.rmcPicker.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcPicker.libPickerMixinMod.IItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  inline def apply(value: Any): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IItemProps]))
  }
  
  @JSImport("rmc-picker", "default.Item")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
