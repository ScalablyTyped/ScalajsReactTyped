package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Type")
@js.native
abstract class Type ()
  extends typingsJapgolly.angularCompiler.outputAstMod.Type {
  def this(modifiers: js.Array[TypeModifier]) = this()
}

