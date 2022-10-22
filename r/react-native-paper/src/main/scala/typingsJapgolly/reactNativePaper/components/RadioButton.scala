package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickPropscoloronPresstestColor
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.checked
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  inline def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropscoloronPresstestColor]))
  }
  
  @JSImport("react-native-paper", "RadioButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def status(value: checked | unchecked): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def uncheckedColor(value: String): this.type = set("uncheckedColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropscoloronPresstestColor): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
