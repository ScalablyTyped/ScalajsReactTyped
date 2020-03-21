package typingsJapgolly.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsJapgolly.angularCompiler.mlParserAstMod.Node
import typingsJapgolly.angularCompiler.mlParserParserMod.ParseTreeResult
import typingsJapgolly.angularCompiler.parseUtilMod.I18nError
import typingsJapgolly.angularCompiler.translationBundleMod.TranslationBundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/extractor_merger", JSImport.Namespace)
@js.native
object extractorMergerMod extends js.Object {
  @js.native
  class ExtractionResult protected () extends js.Object {
    def this(messages: js.Array[Message], errors: js.Array[I18nError]) = this()
    var errors: js.Array[I18nError] = js.native
    var messages: js.Array[Message] = js.native
  }
  
  def extractMessages(
    nodes: js.Array[Node],
    interpolationConfig: InterpolationConfig,
    implicitTags: js.Array[String],
    implicitAttrs: StringDictionary[js.Array[String]]
  ): ExtractionResult = js.native
  def mergeTranslations(
    nodes: js.Array[Node],
    translations: TranslationBundle,
    interpolationConfig: InterpolationConfig,
    implicitTags: js.Array[String],
    implicitAttrs: StringDictionary[js.Array[String]]
  ): ParseTreeResult = js.native
}

