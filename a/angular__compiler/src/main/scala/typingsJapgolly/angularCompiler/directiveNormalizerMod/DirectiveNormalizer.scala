package typingsJapgolly.angularCompiler.directiveNormalizerMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileTemplateMetadata
import typingsJapgolly.angularCompiler.configMod.CompilerConfig
import typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser
import typingsJapgolly.angularCompiler.resourceLoaderMod.ResourceLoader
import typingsJapgolly.angularCompiler.srcUtilMod.SyncAsync
import typingsJapgolly.angularCompiler.urlResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/directive_normalizer", "DirectiveNormalizer")
@js.native
class DirectiveNormalizer protected () extends js.Object {
  def this(
    _resourceLoader: ResourceLoader,
    _urlResolver: UrlResolver,
    _htmlParser: HtmlParser,
    _config: CompilerConfig
  ) = this()
  var _config: js.Any = js.native
  var _fetch: js.Any = js.native
  var _htmlParser: js.Any = js.native
  var _inlineStyles: js.Any = js.native
  var _loadMissingExternalStylesheets: js.Any = js.native
  var _normalizeLoadedTemplateMetadata: js.Any = js.native
  var _normalizeStylesheet: js.Any = js.native
  var _normalizeTemplateMetadata: js.Any = js.native
  var _preParseTemplate: js.Any = js.native
  var _preparseLoadedTemplate: js.Any = js.native
  var _resourceLoader: js.Any = js.native
  var _resourceLoaderCache: js.Any = js.native
  var _urlResolver: js.Any = js.native
  def clearCache(): Unit = js.native
  def clearCacheFor(normalizedDirective: CompileDirectiveMetadata): Unit = js.native
  def normalizeTemplate(prenormData: PrenormalizedTemplateMetadata): SyncAsync[CompileTemplateMetadata] = js.native
}

