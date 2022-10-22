package typingsJapgolly.reactNativeCommunityCliPluginMetro

import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DefaultDescriptionName
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DefaultDescriptionNameParse
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DefaultUndefined
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DescriptionName
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DescriptionNameParse
import typingsJapgolly.reactNativeCommunityCliPluginMetro.anon.DescriptionString
import typingsJapgolly.reactNativeCommunityCliPluginMetro.buildCommandsStartRunServerMod.Args
import typingsJapgolly.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsStartMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", "default.func")
    @js.native
    def func: js.Function3[/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args, js.Promise[Unit]] = js.native
    inline def func(_argv: js.Array[String], ctx: Config, args: Args): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(_argv.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def func_=(x: js.Function3[/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", "default.options")
    @js.native
    def options: js.Array[
        DescriptionNameParse | DefaultDescriptionNameParse | DefaultDescriptionName | DefaultUndefined | DescriptionName | DescriptionString
      ] = js.native
    inline def options_=(
      x: js.Array[
          DescriptionNameParse | DefaultDescriptionNameParse | DefaultDescriptionName | DefaultUndefined | DescriptionName | DescriptionString
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
}
