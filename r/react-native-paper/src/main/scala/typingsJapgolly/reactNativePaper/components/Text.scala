package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  inline def apply(label: String): SharedBuilder_PickViewPropsRefAttributeAccessibilityHint72644435[View] = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    new SharedBuilder_PickViewPropsRefAttributeAccessibilityHint72644435[View](js.Array(this.component, __props.asInstanceOf[PickViewPropsRefAttributeAccessibilityHint]))
  }
  
  @JSImport("react-native-paper", "Avatar.Text")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PickViewPropsRefAttributeAccessibilityHint): SharedBuilder_PickViewPropsRefAttributeAccessibilityHint72644435[View] = new SharedBuilder_PickViewPropsRefAttributeAccessibilityHint72644435[View](js.Array(this.component, p.asInstanceOf[js.Any]))
}
