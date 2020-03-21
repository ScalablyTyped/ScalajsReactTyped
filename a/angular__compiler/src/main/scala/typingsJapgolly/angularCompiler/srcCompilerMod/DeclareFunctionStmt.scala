package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.outputAstMod.FnParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "DeclareFunctionStmt")
@js.native
class DeclareFunctionStmt protected ()
  extends typingsJapgolly.angularCompiler.outputAstMod.DeclareFunctionStmt {
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: js.Array[typingsJapgolly.angularCompiler.outputAstMod.StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type,
    modifiers: js.Array[typingsJapgolly.angularCompiler.outputAstMod.StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: js.Array[typingsJapgolly.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type,
    modifiers: js.Array[typingsJapgolly.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement],
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type,
    modifiers: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

