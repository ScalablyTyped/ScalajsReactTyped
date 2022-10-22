package typingsJapgolly.reactNativeMaterialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.anon.Text
import typingsJapgolly.reactNativeMaterialUi.mod.SubheaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subheader {
  
  inline def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SubheaderProps]))
  }
  
  @JSImport("react-native-material-ui", "Subheader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Subheader] {
    
    inline def inset(value: Boolean): this.type = set("inset", value.asInstanceOf[js.Any])
    
    inline def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    
    inline def style(value: Text): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SubheaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
