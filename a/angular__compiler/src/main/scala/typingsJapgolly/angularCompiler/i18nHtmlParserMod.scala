package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.coreMod.MissingTranslationStrategy
import typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser
import typingsJapgolly.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_html_parser", JSImport.Namespace)
@js.native
object i18nHtmlParserMod extends js.Object {
  @js.native
  class I18NHtmlParser protected () extends HtmlParser {
    def this(_htmlParser: HtmlParser) = this()
    def this(_htmlParser: HtmlParser, translations: String) = this()
    def this(_htmlParser: HtmlParser, translations: String, translationsFormat: String) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
    var _htmlParser: js.Any = js.native
    var _translationBundle: js.Any = js.native
    var getTagDefinition: js.Any = js.native
  }
  
}

