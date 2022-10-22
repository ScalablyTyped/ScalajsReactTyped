package typingsJapgolly.reactNativeActionsheet.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeActionsheet.mod.ActionSheetProps
import typingsJapgolly.reactNativeActionsheet.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeActionsheet {
  
  inline def apply(onPress: Double => Callback, options: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(onPress = js.Any.fromFunction1((t0: Double) => onPress(t0).runNow()), options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetProps]))
  }
  
  @JSImport("react-native-actionsheet", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def cancelButtonIndex(value: Double): this.type = set("cancelButtonIndex", value.asInstanceOf[js.Any])
    
    inline def destructiveButtonIndex(value: Double): this.type = set("destructiveButtonIndex", value.asInstanceOf[js.Any])
    
    inline def message(value: String): this.type = set("message", value.asInstanceOf[js.Any])
    
    inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionSheetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
