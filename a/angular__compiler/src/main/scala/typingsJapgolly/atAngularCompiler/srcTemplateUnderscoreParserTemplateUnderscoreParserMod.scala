package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsJapgolly.atAngularCompiler.srcConfigMod.CompilerConfig
import typingsJapgolly.atAngularCompiler.srcCoreMod.SchemaMetadata
import typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserParserMod.Parser
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult
import typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import typingsJapgolly.atAngularCompiler.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry
import typingsJapgolly.atAngularCompiler.srcSelectorMod.CssSelector
import typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor
import typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParseResult
import typingsJapgolly.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_parser", JSImport.Namespace)
@js.native
object srcTemplateUnderscoreParserTemplateUnderscoreParserMod extends js.Object {
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
    ): Anon_Pipes = js.native
    def parse(
      component: CompileDirectiveMetadata,
      template: ParseTreeResult,
      directives: js.Array[CompileDirectiveSummary],
      pipes: js.Array[CompilePipeSummary],
      schemas: js.Array[SchemaMetadata],
      templateUrl: String,
      preserveWhitespaces: Boolean
    ): Anon_Pipes = js.native
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
  def removeSummaryDuplicates[T /* <: Anon_TypeCompileTypeMetadata */](items: js.Array[T]): js.Array[T] = js.native
  def splitClasses(classAttrValue: String): js.Array[String] = js.native
}

