package typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod

import typingsJapgolly.atAngularCompiler.Anon_Animations
import typingsJapgolly.atAngularCompiler.srcCoreMod.ViewEncapsulation
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", "CompileTemplateMetadata")
@js.native
class CompileTemplateMetadata protected () extends js.Object {
  def this(hasEncapsulationTemplateTemplateUrlHtmlAstStylesStyleUrlsExternalStylesheetsAnimationsNgContentSelectorsInterpolationIsInlinePreserveWhitespaces: Anon_Animations) = this()
  var animations: js.Array[_] = js.native
  var encapsulation: ViewEncapsulation | Null = js.native
  var externalStylesheets: js.Array[CompileStylesheetMetadata] = js.native
  var htmlAst: ParseTreeResult | Null = js.native
  var interpolation: (js.Tuple2[String, String]) | Null = js.native
  var isInline: Boolean = js.native
  var ngContentSelectors: js.Array[String] = js.native
  var preserveWhitespaces: Boolean = js.native
  var styleUrls: js.Array[String] = js.native
  var styles: js.Array[String] = js.native
  var template: String | Null = js.native
  var templateUrl: String | Null = js.native
  def toSummary(): CompileTemplateSummary = js.native
}

