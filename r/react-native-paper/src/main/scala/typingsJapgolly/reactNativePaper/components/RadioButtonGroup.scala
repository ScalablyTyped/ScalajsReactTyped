package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativePaper.libTypescriptComponentsRadioButtonRadioButtonGroupMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonGroup {
  
  inline def apply(onValueChange: String => Callback, value: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(onValueChange = js.Any.fromFunction1((t0: String) => onValueChange(t0).runNow()), value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "RadioButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
