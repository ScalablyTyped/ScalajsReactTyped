package typingsJapgolly.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.coreMod.MissingTranslationStrategy
import typingsJapgolly.angularCompiler.extractorMod.ExtractorHost
import typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser
import typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsJapgolly.angularCompiler.srcUtilMod.Console
import typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n", JSImport.Namespace)
@js.native
object i18nMod extends js.Object {
  @js.native
  class Extractor protected ()
    extends typingsJapgolly.angularCompiler.extractorMod.Extractor {
    def this(
      host: ExtractorHost,
      staticSymbolResolver: StaticSymbolResolver,
      messageBundle: typingsJapgolly.angularCompiler.messageBundleMod.MessageBundle,
      metadataResolver: CompileMetadataResolver
    ) = this()
  }
  
  @js.native
  class I18NHtmlParser protected ()
    extends typingsJapgolly.angularCompiler.i18nHtmlParserMod.I18NHtmlParser {
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
  }
  
  @js.native
  class MessageBundle protected ()
    extends typingsJapgolly.angularCompiler.messageBundleMod.MessageBundle {
    def this(
      _htmlParser: HtmlParser,
      _implicitTags: js.Array[String],
      _implicitAttrs: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      _implicitTags: js.Array[String],
      _implicitAttrs: StringDictionary[js.Array[String]],
      _locale: String
    ) = this()
  }
  
  @js.native
  abstract class Serializer ()
    extends typingsJapgolly.angularCompiler.serializerMod.Serializer
  
  @js.native
  class Xliff ()
    extends typingsJapgolly.angularCompiler.xliffMod.Xliff
  
  @js.native
  class Xliff2 ()
    extends typingsJapgolly.angularCompiler.xliff2Mod.Xliff2
  
  @js.native
  class Xmb ()
    extends typingsJapgolly.angularCompiler.xmbMod.Xmb
  
  @js.native
  class Xtb ()
    extends typingsJapgolly.angularCompiler.xtbMod.Xtb
  
  /* static members */
  @js.native
  object Extractor extends js.Object {
    def create(host: ExtractorHost): AnonExtractor = js.native
    def create(host: ExtractorHost, locale: String): AnonExtractor = js.native
  }
  
}

