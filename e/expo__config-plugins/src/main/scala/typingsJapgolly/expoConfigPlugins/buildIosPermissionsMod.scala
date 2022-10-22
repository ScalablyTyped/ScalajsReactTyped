package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsBooleans.`false`
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosPermissionsMod {
  
  @JSImport("@expo/config-plugins/build/ios/Permissions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPermissions_false[Defaults /* <: Record[String, String] */](
    defaults: Defaults,
    permissions: Partial[Record[/* keyof Defaults */ String, String | `false`]],
    infoPlist: InfoPlist
  ): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPermissions")(defaults.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  inline def createPermissionsPlugin[Defaults /* <: Record[String, String] */](defaults: Defaults): ConfigPlugin[Record[/* keyof Defaults */ String, js.UndefOr[String | `false`]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPermissionsPlugin")(defaults.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[Record[/* keyof Defaults */ String, js.UndefOr[String | `false`]]]]
  inline def createPermissionsPlugin[Defaults /* <: Record[String, String] */](defaults: Defaults, name: String): ConfigPlugin[Record[/* keyof Defaults */ String, js.UndefOr[String | `false`]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPermissionsPlugin")(defaults.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Record[/* keyof Defaults */ String, js.UndefOr[String | `false`]]]]
}
