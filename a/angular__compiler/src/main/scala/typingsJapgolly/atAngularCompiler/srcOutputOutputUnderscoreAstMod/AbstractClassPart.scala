package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "AbstractClassPart")
@js.native
class AbstractClassPart () extends js.Object {
  def this(`type`: Type) = this()
  def this(`type`: js.UndefOr[scala.Nothing], modifiers: js.Array[StmtModifier]) = this()
  def this(`type`: Null, modifiers: js.Array[StmtModifier]) = this()
  def this(`type`: Type, modifiers: js.Array[StmtModifier]) = this()
  var modifiers: js.Array[StmtModifier] | Null = js.native
  var `type`: Type | Null = js.native
  def hasModifier(modifier: StmtModifier): Boolean = js.native
}

