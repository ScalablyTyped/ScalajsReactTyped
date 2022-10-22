package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityElementsHidden
import typingsJapgolly.reactNativePaper.libTypescriptComponentsAvatarAvatarImageMod.AvatarImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  inline def apply(source: AvatarImageSource): SharedBuilder_PickViewPropsRefAttributeAccessibilityElementsHidden_119070516[View] = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new SharedBuilder_PickViewPropsRefAttributeAccessibilityElementsHidden_119070516[View](js.Array(this.component, __props.asInstanceOf[PickViewPropsRefAttributeAccessibilityElementsHidden]))
  }
  
  @JSImport("react-native-paper", "Avatar.Image")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PickViewPropsRefAttributeAccessibilityElementsHidden): SharedBuilder_PickViewPropsRefAttributeAccessibilityElementsHidden_119070516[View] = new SharedBuilder_PickViewPropsRefAttributeAccessibilityElementsHidden_119070516[View](js.Array(this.component, p.asInstanceOf[js.Any]))
}
