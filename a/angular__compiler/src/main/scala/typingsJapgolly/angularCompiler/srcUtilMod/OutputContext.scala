package typingsJapgolly.angularCompiler.srcUtilMod

import typingsJapgolly.angularCompiler.constantPoolMod.ConstantPool
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.outputAstMod.Statement
import typingsJapgolly.angularCompiler.outputAstMod.Type
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

