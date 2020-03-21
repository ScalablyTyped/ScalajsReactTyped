package typingsJapgolly.angularCompiler.r3ModuleCompilerMod

import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.outputAstMod.Statement
import typingsJapgolly.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3NgModuleDef extends js.Object {
  var additionalStatements: js.Array[Statement]
  var expression: Expression
  var `type`: Type
}

object R3NgModuleDef {
  @scala.inline
  def apply(additionalStatements: js.Array[Statement], expression: Expression, `type`: Type): R3NgModuleDef = {
    val __obj = js.Dynamic.literal(additionalStatements = additionalStatements.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleDef]
  }
}

