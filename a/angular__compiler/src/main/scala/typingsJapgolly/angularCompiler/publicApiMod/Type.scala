package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Type")
@js.native
abstract class Type ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.Type {
  def this(modifiers: js.Array[TypeModifier]) = this()
}

