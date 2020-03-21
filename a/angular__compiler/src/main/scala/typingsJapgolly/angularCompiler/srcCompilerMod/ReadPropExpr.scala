package typingsJapgolly.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ReadPropExpr")
@js.native
class ReadPropExpr protected ()
  extends typingsJapgolly.angularCompiler.outputAstMod.ReadPropExpr {
  def this(receiver: typingsJapgolly.angularCompiler.outputAstMod.Expression, name: String) = this()
  def this(
    receiver: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    receiver: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: Null,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    receiver: typingsJapgolly.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

