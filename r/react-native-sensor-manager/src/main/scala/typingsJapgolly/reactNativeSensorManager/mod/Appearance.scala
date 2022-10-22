package typingsJapgolly.reactNativeSensorManager.mod

import typingsJapgolly.reactNative.mod.Appearance.AppearanceListener
import typingsJapgolly.reactNative.mod.ColorSchemeName
import typingsJapgolly.reactNative.mod.NativeEventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Appearance {
  
  @JSImport("react-native-sensor-manager", "Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChangeListener(listener: AppearanceListener): NativeEventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[NativeEventSubscription]
  
  inline def getColorScheme(): ColorSchemeName = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorScheme")().asInstanceOf[ColorSchemeName]
}
