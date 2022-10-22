package typingsJapgolly.reactNativeTableComponent.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTableComponent.mod.TableWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableWrapper {
  
  @JSImport("react-native-table-component", "TableWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeTableComponent.mod.TableWrapper] {
    
    inline def borderStyle(value: StyleProp[ViewStyle]): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    inline def borderStyleNull: this.type = set("borderStyle", null)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: TableWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
