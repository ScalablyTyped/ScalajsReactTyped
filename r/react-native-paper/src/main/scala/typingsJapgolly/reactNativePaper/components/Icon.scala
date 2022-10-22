package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityActions
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  inline def apply(icon: IconSource): SharedBuilder_PickViewPropsRefAttributeAccessibilityActions_177550811[View] = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    new SharedBuilder_PickViewPropsRefAttributeAccessibilityActions_177550811[View](js.Array(this.component, __props.asInstanceOf[PickViewPropsRefAttributeAccessibilityActions]))
  }
  
  @JSImport("react-native-paper", "Avatar.Icon")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PickViewPropsRefAttributeAccessibilityActions): SharedBuilder_PickViewPropsRefAttributeAccessibilityActions_177550811[View] = new SharedBuilder_PickViewPropsRefAttributeAccessibilityActions_177550811[View](js.Array(this.component, p.asInstanceOf[js.Any]))
}
