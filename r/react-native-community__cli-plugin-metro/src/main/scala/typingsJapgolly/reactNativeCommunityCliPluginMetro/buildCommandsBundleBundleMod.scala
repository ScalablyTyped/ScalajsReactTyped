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

object buildCommandsBundleBundleMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/bundle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/bundle", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/bundle", "default.func")
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
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/bundle", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/bundle", "default.options")
    @js.native
    def options: js.Array[
        Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
      ] = js.native
    inline def options_=(
      x: js.Array[
          Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/bundle", "default.withOutput")
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
  
  /**
    * Builds the bundle starting to look for dependencies at the given entry path.
    */
  /* was `typeof bundleWithOutput` */
  inline def withOutput(_underscore: js.Array[String], config: Config, args: CommandLineArgs, output: Any): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withOutput")(_underscore.asInstanceOf[js.Any], config.asInstanceOf[js.Any], args.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
}
