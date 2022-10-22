package typingsJapgolly.reactNativeWindows.mod

import typingsJapgolly.reactNativeWindows.rntypesMod.Appearance.AppearanceListener
import typingsJapgolly.reactNativeWindows.rntypesMod.ColorSchemeName
import typingsJapgolly.reactNativeWindows.rntypesMod.NativeEventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Appearance {
  
  @JSImport("react-native-windows", "Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChangeListener(listener: AppearanceListener): NativeEventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[NativeEventSubscription]
  
  inline def getColorScheme(): ColorSchemeName = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorScheme")().asInstanceOf[ColorSchemeName]
  
  inline def removeChangeListener(listener: AppearanceListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChangeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
