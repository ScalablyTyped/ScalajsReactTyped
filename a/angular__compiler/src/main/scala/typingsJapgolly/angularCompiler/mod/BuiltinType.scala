package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "BuiltinType")
@js.native
class BuiltinType protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.BuiltinType {
  def this(name: typingsJapgolly.angularCompiler.outputAstMod.BuiltinTypeName) = this()
  def this(
    name: typingsJapgolly.angularCompiler.outputAstMod.BuiltinTypeName,
    modifiers: js.Array[TypeModifier]
  ) = this()
}

