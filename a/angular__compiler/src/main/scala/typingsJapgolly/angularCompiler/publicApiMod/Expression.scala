package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Expression")
@js.native
abstract class Expression ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.Expression {
  def this(`type`: typingsJapgolly.angularCompiler.outputAstMod.Type) = this()
  def this(
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(`type`: Null, sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    `type`: typingsJapgolly.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

