package typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod

import typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor
import typingsJapgolly.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateParser")
@js.native
class TemplateParser protected ()
  extends typingsJapgolly.atAngularCompiler.srcCompilerMod.TemplateParser {
  def this(
    _config: typingsJapgolly.atAngularCompiler.srcConfigMod.CompilerConfig,
    _reflector: typingsJapgolly.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector,
    _exprParser: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserParserMod.Parser,
    _schemaRegistry: typingsJapgolly.atAngularCompiler.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry,
    _htmlParser: typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    _console: Console,
    transforms: js.Array[TemplateAstVisitor]
  ) = this()
}

