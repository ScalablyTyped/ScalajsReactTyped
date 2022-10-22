package typingsJapgolly.reactNativePlatformTouchable.components

import typingsJapgolly.reactNativePlatformTouchable.mod.PlatformTouchableProps
import typingsJapgolly.reactNativePlatformTouchable.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativePlatformTouchable {
  
  @JSImport("react-native-platform-touchable", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativePlatformTouchable.type): SharedBuilder_PlatformTouchableProps_1066354137[default] = new SharedBuilder_PlatformTouchableProps_1066354137[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PlatformTouchableProps): SharedBuilder_PlatformTouchableProps_1066354137[default] = new SharedBuilder_PlatformTouchableProps_1066354137[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
