package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularLocalize.mod.ɵParsedTranslation
import typingsJapgolly.angularLocalize.toolsSrcBabelCoreMod.PluginObj
import typingsJapgolly.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation]
  ): PluginObj = js.native
  def apply(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: Unit,
    fs: PathManipulation
  ): PluginObj = js.native
  def apply(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions
  ): PluginObj = js.native
  def apply(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions,
    fs: PathManipulation
  ): PluginObj = js.native
}
