package typingsJapgolly.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Statement")
@js.native
abstract class Statement ()
  extends typingsJapgolly.angularCompiler.publicApiMod.Statement {
  def this(modifiers: js.Array[typingsJapgolly.angularCompiler.outputAstMod.StmtModifier]) = this()
  def this(
    modifiers: js.Array[typingsJapgolly.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(modifiers: Null, sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
}

