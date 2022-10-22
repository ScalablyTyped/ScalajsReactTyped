package typingsJapgolly.reactNativeMaterialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.anon.`0`
import typingsJapgolly.reactNativeMaterialUi.mod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Divider {
  
  @JSImport("react-native-material-ui", "Divider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Divider] {
    
    inline def inset(value: Boolean): this.type = set("inset", value.asInstanceOf[js.Any])
    
    inline def style(value: `0`): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Divider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DividerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
