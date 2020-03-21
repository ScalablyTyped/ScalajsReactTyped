package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.astMod.AST
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import typingsJapgolly.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import typingsJapgolly.angularCompiler.configMod.CompilerConfig
import typingsJapgolly.angularCompiler.coreMod.SchemaMetadata
import typingsJapgolly.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry
import typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser
import typingsJapgolly.angularCompiler.htmlParserMod.ParseTreeResult
import typingsJapgolly.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsJapgolly.angularCompiler.parserMod.Parser
import typingsJapgolly.angularCompiler.selectorMod.CssSelector
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseErrorLevel
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typingsJapgolly.angularCompiler.srcUtilMod.Console
import typingsJapgolly.angularCompiler.templateAstMod.TemplateAst
import typingsJapgolly.angularCompiler.templateAstMod.TemplateAstVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_parser", JSImport.Namespace)
@js.native
object templateParserMod extends js.Object {
  @js.native
  class TemplateParseError protected () extends ParseError {
    def this(message: String, span: ParseSourceSpan, level: ParseErrorLevel) = this()
  }
  
  @js.native
  class TemplateParseResult () extends js.Object {
    def this(templateAst: js.Array[TemplateAst]) = this()
    def this(templateAst: js.UndefOr[scala.Nothing], usedPipes: js.Array[CompilePipeSummary]) = this()
    def this(templateAst: js.Array[TemplateAst], usedPipes: js.Array[CompilePipeSummary]) = this()
    def this(
      templateAst: js.UndefOr[scala.Nothing],
      usedPipes: js.UndefOr[scala.Nothing],
      errors: js.Array[ParseError]
    ) = this()
    def this(
      templateAst: js.UndefOr[scala.Nothing],
      usedPipes: js.Array[CompilePipeSummary],
      errors: js.Array[ParseError]
    ) = this()
    def this(
      templateAst: js.Array[TemplateAst],
      usedPipes: js.UndefOr[scala.Nothing],
      errors: js.Array[ParseError]
    ) = this()
    def this(
      templateAst: js.Array[TemplateAst],
      usedPipes: js.Array[CompilePipeSummary],
      errors: js.Array[ParseError]
    ) = this()
    var errors: js.UndefOr[js.Array[ParseError]] = js.native
    var templateAst: js.UndefOr[js.Array[TemplateAst]] = js.native
    var usedPipes: js.UndefOr[js.Array[CompilePipeSummary]] = js.native
  }
  
  @js.native
  class TemplateParser protected () extends js.Object {
    def this(
      _config: CompilerConfig,
      _reflector: CompileReflector,
      _exprParser: Parser,
      _schemaRegistry: ElementSchemaRegistry,
      _htmlParser: HtmlParser,
      _console: Console,
      transforms: js.Array[TemplateAstVisitor]
    ) = this()
    var _config: js.Any = js.native
    var _console: js.Any = js.native
    var _exprParser: js.Any = js.native
    var _htmlParser: js.Any = js.native
    var _reflector: js.Any = js.native
    var _schemaRegistry: js.Any = js.native
    val expressionParser: Parser = js.native
    var transforms: js.Array[TemplateAstVisitor] = js.native
    def expandHtml(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = js.native
    def expandHtml(htmlAstWithErrors: ParseTreeResult, forced: Boolean): ParseTreeResult = js.native
    def getInterpolationConfig(component: CompileDirectiveMetadata): js.UndefOr[InterpolationConfig] = js.native
    def parse(
      component: CompileDirectiveMetadata,
      template: String,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): AnonPipes = js.native
    def parse(
      component: CompileDirectiveMetadata,
      template: ParseTreeResult,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): AnonPipes = js.native
    def tryParse(
      component: CompileDirectiveMetadata,
      template: String,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): TemplateParseResult = js.native
    def tryParse(
      component: CompileDirectiveMetadata,
      template: ParseTreeResult,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): TemplateParseResult = js.native
    def tryParseHtml(
      htmlAstWithErrors: ParseTreeResult,
      component: CompileDirectiveMetadata,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata]
    ): TemplateParseResult = js.native
  }
  
  def createElementCssSelector(elementName: String, attributes: js.Array[js.Tuple2[String, String]]): CssSelector = js.native
  def isEmptyExpression(ast: AST): Boolean = js.native
  def removeSummaryDuplicates[T /* <: AnonTypeCompileTypeMetadata */](items: js.Array[T]): js.Array[T] = js.native
  def splitClasses(classAttrValue: String): js.Array[String] = js.native
}

