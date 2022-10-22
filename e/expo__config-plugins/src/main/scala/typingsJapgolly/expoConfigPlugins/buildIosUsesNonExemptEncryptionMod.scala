package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.PickExpoConfigios
import typingsJapgolly.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosUsesNonExemptEncryptionMod {
  
  @JSImport("@expo/config-plugins/build/ios/UsesNonExemptEncryption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUsesNonExemptEncryption(config: PickExpoConfigios): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsesNonExemptEncryption")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def setUsesNonExemptEncryption(config: PickExpoConfigios, hasITSAppUsesNonExemptEncryptionInfoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setUsesNonExemptEncryption")(config.asInstanceOf[js.Any], hasITSAppUsesNonExemptEncryptionInfoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  @JSImport("@expo/config-plugins/build/ios/UsesNonExemptEncryption", "withUsesNonExemptEncryption")
  @js.native
  val withUsesNonExemptEncryption: ConfigPlugin[Unit] = js.native
}
