package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.PickExpoConfigorientation
import typingsJapgolly.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typingsJapgolly.expoConfigPlugins.buildIosIosConfigDottypesMod.InterfaceOrientation
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.default
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.landscape
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosOrientationMod {
  
  @JSImport("@expo/config-plugins/build/ios/Orientation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Orientation", "LANDSCAPE_ORIENTATIONS")
  @js.native
  val LANDSCAPE_ORIENTATIONS: js.Array[InterfaceOrientation] = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Orientation", "PORTRAIT_ORIENTATIONS")
  @js.native
  val PORTRAIT_ORIENTATIONS: js.Array[InterfaceOrientation] = js.native
  
  inline def getOrientation(config: PickExpoConfigorientation): default | portrait | landscape | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")(config.asInstanceOf[js.Any]).asInstanceOf[default | portrait | landscape | Null]
  
  inline def setOrientation(config: PickExpoConfigorientation, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setOrientation")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  @JSImport("@expo/config-plugins/build/ios/Orientation", "withOrientation")
  @js.native
  val withOrientation: ConfigPlugin[Unit] = js.native
}
