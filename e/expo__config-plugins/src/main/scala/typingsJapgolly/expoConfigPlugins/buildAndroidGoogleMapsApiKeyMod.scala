package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.PickExpoConfigandroid
import typingsJapgolly.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidGoogleMapsApiKeyMod {
  
  @JSImport("@expo/config-plugins/build/android/GoogleMapsApiKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGoogleMapsApiKey(config: PickExpoConfigandroid): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleMapsApiKey")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setGoogleMapsApiKey(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleMapsApiKey")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  @JSImport("@expo/config-plugins/build/android/GoogleMapsApiKey", "withGoogleMapsApiKey")
  @js.native
  val withGoogleMapsApiKey: ConfigPlugin[Unit] = js.native
}
