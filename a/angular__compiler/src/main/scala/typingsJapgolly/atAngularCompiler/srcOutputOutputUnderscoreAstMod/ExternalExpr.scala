package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ExternalExpr")
@js.native
class ExternalExpr protected () extends Expression {
  def this(value: ExternalReference) = this()
  def this(value: ExternalReference, `type`: Type) = this()
  def this(value: ExternalReference, `type`: Null, typeParams: js.Array[Type]) = this()
  def this(value: ExternalReference, `type`: Type, typeParams: js.Array[Type]) = this()
  def this(value: ExternalReference, `type`: Null, typeParams: js.Array[Type], sourceSpan: ParseSourceSpan) = this()
  def this(value: ExternalReference, `type`: Null, typeParams: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: ExternalReference, `type`: Type, typeParams: js.Array[Type], sourceSpan: ParseSourceSpan) = this()
  def this(value: ExternalReference, `type`: Type, typeParams: Null, sourceSpan: ParseSourceSpan) = this()
  var typeParams: js.Array[Type] | Null = js.native
  var value: ExternalReference = js.native
}

