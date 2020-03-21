package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Type")
@js.native
abstract class Type ()
  extends typingsJapgolly.angularCompiler.publicApiMod.Type {
  def this(modifiers: js.Array[TypeModifier]) = this()
}

