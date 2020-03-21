package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Statement")
@js.native
abstract class Statement ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.Statement {
  def this(modifiers: js.Array[typingsJapgolly.angularCompiler.outputAstMod.StmtModifier]) = this()
  def this(
    modifiers: js.Array[typingsJapgolly.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(modifiers: Null, sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
}

