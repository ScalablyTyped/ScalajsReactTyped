package typingsJapgolly.angularCompiler.constantPoolMod

import typingsJapgolly.angularCompiler.AnonLiteralFactory
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.outputAstMod.LiteralArrayExpr
import typingsJapgolly.angularCompiler.outputAstMod.LiteralMapExpr
import typingsJapgolly.angularCompiler.outputAstMod.Statement
import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/constant_pool", "ConstantPool")
@js.native
class ConstantPool () extends js.Object {
  var _getLiteralFactory: js.Any = js.native
  var componentDefinitions: js.Any = js.native
  var definitionsOf: js.Any = js.native
  var directiveDefinitions: js.Any = js.native
  var freshName: js.Any = js.native
  var injectorDefinitions: js.Any = js.native
  var keyOf: js.Any = js.native
  var literalFactories: js.Any = js.native
  var literals: js.Any = js.native
  var nextNameIndex: js.Any = js.native
  var pipeDefinitions: js.Any = js.native
  var statements: js.Array[Statement] = js.native
  def getConstLiteral(literal: Expression): Expression = js.native
  def getConstLiteral(literal: Expression, forceShared: Boolean): Expression = js.native
  def getDefinition(`type`: js.Any, kind: DefinitionKind, ctx: OutputContext): Expression = js.native
  def getDefinition(`type`: js.Any, kind: DefinitionKind, ctx: OutputContext, forceShared: Boolean): Expression = js.native
  def getLiteralFactory(literal: LiteralArrayExpr): AnonLiteralFactory = js.native
  def getLiteralFactory(literal: LiteralMapExpr): AnonLiteralFactory = js.native
  def propertyNameOf(kind: DefinitionKind): String = js.native
  /**
    * Produce a unique name.
    *
    * The name might be unique among different prefixes if any of the prefixes end in
    * a digit so the prefix should be a constant string (not based on user input) and
    * must not end in a digit.
    */
  def uniqueName(prefix: String): String = js.native
}

