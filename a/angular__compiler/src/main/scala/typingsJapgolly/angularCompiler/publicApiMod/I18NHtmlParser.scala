package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.coreMod.MissingTranslationStrategy
import typingsJapgolly.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "I18NHtmlParser")
@js.native
class I18NHtmlParser protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.I18NHtmlParser {
  def this(_htmlParser: typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser) = this()
  def this(_htmlParser: typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser, translations: String) = this()
  def this(
    _htmlParser: typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String
  ) = this()
  def this(
    _htmlParser: typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy
  ) = this()
  def this(
    _htmlParser: typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy,
    console: Console
  ) = this()
}

