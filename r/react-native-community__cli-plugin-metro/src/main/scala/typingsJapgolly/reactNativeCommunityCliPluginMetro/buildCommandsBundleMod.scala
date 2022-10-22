package typingsJapgolly.reactNativeCommunityCliPluginMetro

import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.Default
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DefaultDescription
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DefaultDescriptionName
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.Description
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DescriptionName
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.NameParse
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.Parse
import typingsJapgolly.reactNativeCommunityCliPluginMetro.buildCommandsBundleBundleCommandLineArgsMod.CommandLineArgs
import typingsJapgolly.reactNativeCommunityCliPluginMetro.buildToolsLoadMetroConfigMod.MetroConfig
import typingsJapgolly.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBundleMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig, output: Any): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  
  object bundleCommand {
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "bundleCommand")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "bundleCommand.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "bundleCommand.func")
    @js.native
    def func: js.Function4[
        /* _ */ js.Array[String], 
        /* config */ Config, 
        /* args */ CommandLineArgs, 
        /* output */ Any, 
        js.Promise[js.UndefOr[Unit]]
      ] = js.native
    inline def func(_underscore: js.Array[String], config: Config, args: CommandLineArgs, output: Any): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(_underscore.asInstanceOf[js.Any], config.asInstanceOf[js.Any], args.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
    inline def func_=(
      x: js.Function4[
          /* _ */ js.Array[String], 
          /* config */ Config, 
          /* args */ CommandLineArgs, 
          /* output */ Any, 
          js.Promise[js.UndefOr[Unit]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "bundleCommand.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "bundleCommand.options")
    @js.native
    def options: js.Array[
        Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
      ] = js.native
    inline def options_=(
      x: js.Array[
          Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "bundleCommand.withOutput")
    @js.native
    def withOutput: js.Function4[
        /* _ */ js.Array[String], 
        /* config */ Config, 
        /* args */ CommandLineArgs, 
        /* output */ Any, 
        js.Promise[js.UndefOr[Unit]]
      ] = js.native
    inline def withOutput(_underscore: js.Array[String], config: Config, args: CommandLineArgs, output: Any): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withOutput")(_underscore.asInstanceOf[js.Any], config.asInstanceOf[js.Any], args.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
    inline def withOutput_=(
      x: js.Function4[
          /* _ */ js.Array[String], 
          /* config */ Config, 
          /* args */ CommandLineArgs, 
          /* output */ Any, 
          js.Promise[js.UndefOr[Unit]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withOutput")(x.asInstanceOf[js.Any])
  }
  
  object ramBundleCommand {
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "ramBundleCommand")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "ramBundleCommand.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "ramBundleCommand.func")
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
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "ramBundleCommand.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle", "ramBundleCommand.options")
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
}
