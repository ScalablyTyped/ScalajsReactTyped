package typingsJapgolly.globalizeCompiler.mod

import typingsJapgolly.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globalize-compiler", "extract")
@js.native
object extract extends js.Object {
  def apply(input: String): ExtractFunction = js.native
  def apply(input: Program): ExtractFunction = js.native
}

