package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "BuiltinType")
@js.native
class BuiltinType protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.BuiltinType {
  def this(name: typingsJapgolly.angularCompiler.outputAstMod.BuiltinTypeName) = this()
  def this(
    name: typingsJapgolly.angularCompiler.outputAstMod.BuiltinTypeName,
    modifiers: js.Array[TypeModifier]
  ) = this()
}

