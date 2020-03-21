package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.srcUtilMod.Console
import typingsJapgolly.angularCompiler.templateAstMod.TemplateAstVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateParser")
@js.native
class TemplateParser protected ()
  extends typingsJapgolly.angularCompiler.templateParserMod.TemplateParser {
  def this(
    _config: typingsJapgolly.angularCompiler.configMod.CompilerConfig,
    _reflector: typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector,
    _exprParser: typingsJapgolly.angularCompiler.parserMod.Parser,
    _schemaRegistry: typingsJapgolly.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _htmlParser: typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser,
    _console: Console,
    transforms: js.Array[TemplateAstVisitor]
  ) = this()
}

