package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.PickExpoConfigandroid
import typingsJapgolly.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typingsJapgolly.expoConfigPlugins.buildAndroidManifestMod.ManifestIntentFilter
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typingsJapgolly.expoConfigTypes.anon.Action
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidIntentFiltersMod {
  
  @JSImport("@expo/config-plugins/build/android/IntentFilters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(intentFilters: AndroidIntentFilters): js.Array[ManifestIntentFilter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(intentFilters.asInstanceOf[js.Any]).asInstanceOf[js.Array[ManifestIntentFilter]]
  
  inline def getIntentFilters(config: PickExpoConfigandroid): AndroidIntentFilters = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntentFilters")(config.asInstanceOf[js.Any]).asInstanceOf[AndroidIntentFilters]
  
  inline def setAndroidIntentFilters(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setAndroidIntentFilters")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  @JSImport("@expo/config-plugins/build/android/IntentFilters", "withAndroidIntentFilters")
  @js.native
  val withAndroidIntentFilters: ConfigPlugin[Unit] = js.native
  
  type AndroidIntentFilters = NonNullable[js.UndefOr[js.Array[Action]]]
}
