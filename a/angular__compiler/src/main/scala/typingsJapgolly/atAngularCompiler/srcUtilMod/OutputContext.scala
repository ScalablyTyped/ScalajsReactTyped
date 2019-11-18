package typingsJapgolly.atAngularCompiler.srcUtilMod

import typingsJapgolly.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputContext extends js.Object {
  var constantPool: ConstantPool = js.native
  var genFilePath: String = js.native
  var statements: js.Array[Statement] = js.native
  def importExpr(reference: js.Any): Expression = js.native
  def importExpr(reference: js.Any, typeParams: js.Array[Type]): Expression = js.native
  def importExpr(reference: js.Any, typeParams: js.Array[Type], useSummaries: Boolean): Expression = js.native
  def importExpr(reference: js.Any, typeParams: Null, useSummaries: Boolean): Expression = js.native
}

