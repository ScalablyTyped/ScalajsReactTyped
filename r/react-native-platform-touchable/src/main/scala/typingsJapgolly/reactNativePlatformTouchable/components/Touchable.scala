package typingsJapgolly.reactNativePlatformTouchable.components

import typingsJapgolly.reactNativePlatformTouchable.mod.PlatformTouchableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Touchable {
  
  @JSImport("react-native-platform-touchable", "Touchable")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Touchable.type): SharedBuilder_PlatformTouchableProps_1066354137[typingsJapgolly.reactNativePlatformTouchable.mod.Touchable] = new SharedBuilder_PlatformTouchableProps_1066354137[typingsJapgolly.reactNativePlatformTouchable.mod.Touchable](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PlatformTouchableProps): SharedBuilder_PlatformTouchableProps_1066354137[typingsJapgolly.reactNativePlatformTouchable.mod.Touchable] = new SharedBuilder_PlatformTouchableProps_1066354137[typingsJapgolly.reactNativePlatformTouchable.mod.Touchable](js.Array(this.component, p.asInstanceOf[js.Any]))
}
