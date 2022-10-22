package typingsJapgolly.angularLocalize

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularLocalize.mod.ɵParsedTranslation
import typingsJapgolly.angularLocalize.toolsSrcBabelCoreMod.PluginObj
import typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import typingsJapgolly.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateSourceFilesEs2015TranslatePluginMod {
  
  @JSImport("@angular/localize/tools/src/translate/source_files/es2015_translate_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeEs2015TranslatePlugin(diagnostics: Diagnostics, translations: Record[String, ɵParsedTranslation]): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: Unit,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
}
