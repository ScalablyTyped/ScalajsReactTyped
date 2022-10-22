package typingsJapgolly.expoConfigPlugins

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoConfigPlugins.anon.PickExpoConfiglocales
import typingsJapgolly.expoConfigPlugins.anon.ProjectProjectRoot
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosLocalesMod {
  
  @JSImport("@expo/config-plugins/build/ios/Locales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocales(config: PickExpoConfiglocales): (Record[String, String | LocaleJson]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")(config.asInstanceOf[js.Any]).asInstanceOf[(Record[String, String | LocaleJson]) | Null]
  
  inline def getResolvedLocalesAsync(projectRoot: String, input: ExpoConfigLocales): js.Promise[ResolvedLocalesJson] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolvedLocalesAsync")(projectRoot.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolvedLocalesJson]]
  
  inline def setLocalesAsync(config: PickExpoConfiglocales, hasProjectRootProject: ProjectProjectRoot): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocalesAsync")(config.asInstanceOf[js.Any], hasProjectRootProject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ]]
  
  @JSImport("@expo/config-plugins/build/ios/Locales", "withLocales")
  @js.native
  val withLocales: ConfigPlugin[Unit] = js.native
  
  type ExpoConfigLocales = NonNullable[js.UndefOr[StringDictionary[String | StringDictionary[Any]]]]
  
  type LocaleJson = Record[String, String]
  
  type ResolvedLocalesJson = Record[String, LocaleJson]
}
