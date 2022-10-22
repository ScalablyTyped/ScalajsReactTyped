package typingsJapgolly.reactNativeCommunityCliPluginMetro

import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.Default
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DefaultDescription
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DefaultDescriptionName
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.Description
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DescriptionName
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.NameParse
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.Parse
import typingsJapgolly.reactNativeCommunityCliPluginMetro.buildCommandsBundleBundleCommandLineArgsMod.CommandLineArgs
import typingsJapgolly.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBundleRamBundleMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", "default.func")
    @js.native
    def func: js.Function3[
        /* argv */ js.Array[String], 
        /* config */ Config, 
        /* args */ CommandLineArgs, 
        js.Promise[js.UndefOr[Unit]]
      ] = js.native
    inline def func(argv: js.Array[String], config: Config, args: CommandLineArgs): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(argv.asInstanceOf[js.Any], config.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
    inline def func_=(
      x: js.Function3[
          /* argv */ js.Array[String], 
          /* config */ Config, 
          /* args */ CommandLineArgs, 
          js.Promise[js.UndefOr[Unit]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", "default.options")
    @js.native
    def options: js.Array[
        Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
      ] = js.native
    inline def options_=(
      x: js.Array[
          Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Builds the bundle starting to look for dependencies at the given entry path.
    */
  inline def ramBundle(argv: js.Array[String], config: Config, args: CommandLineArgs): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("ramBundle")(argv.asInstanceOf[js.Any], config.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
}
