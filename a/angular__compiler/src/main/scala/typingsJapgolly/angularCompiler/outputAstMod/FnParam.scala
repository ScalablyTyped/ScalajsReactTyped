package typingsJapgolly.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "FnParam")
@js.native
class FnParam protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, `type`: Type) = this()
  var name: String = js.native
  var `type`: Type | Null = js.native
  def isEquivalent(param: FnParam): Boolean = js.native
}

