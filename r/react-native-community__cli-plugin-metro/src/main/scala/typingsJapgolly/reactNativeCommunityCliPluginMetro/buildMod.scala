package typingsJapgolly.reactNativeCommunityCliPluginMetro

import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DescriptionFunc
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.Func
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.Options
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.PickConfigrootreactNative
import typingsJapgolly.reactNativeCommunityCliPluginMetro.buildCommandsBundleBundleCommandLineArgsMod.CommandLineArgs
import typingsJapgolly.reactNativeCommunityCliPluginMetro.buildToolsLoadMetroConfigMod.ConfigLoadingContext
import typingsJapgolly.reactNativeCommunityCliPluginMetro.buildToolsLoadMetroConfigMod.ConfigOptionsT
import typingsJapgolly.reactNativeCommunityCliPluginMetro.buildToolsLoadMetroConfigMod.MetroConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig, output: Any): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  
  @JSImport("@react-native-community/cli-plugin-metro/build", "commands")
  @js.native
  val commands: js.Array[Func | Options | DescriptionFunc] = js.native
  
  inline def getDefaultConfig(ctx: PickConfigrootreactNative): MetroConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")(ctx.asInstanceOf[js.Any]).asInstanceOf[MetroConfig]
  
  inline def loadMetroConfig(ctx: ConfigLoadingContext): js.Promise[MetroConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadMetroConfig")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MetroConfig]]
  inline def loadMetroConfig(ctx: ConfigLoadingContext, options: ConfigOptionsT): js.Promise[MetroConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadMetroConfig")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MetroConfig]]
}
