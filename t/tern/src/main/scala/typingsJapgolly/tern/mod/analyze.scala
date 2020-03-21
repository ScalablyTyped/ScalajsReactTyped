package typingsJapgolly.tern.mod

import typingsJapgolly.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "analyze")
@js.native
object analyze extends js.Object {
  def apply(ast: Program, name: String): Unit = js.native
  def apply(ast: Program, name: String, scope: typingsJapgolly.tern.inferMod.Scope): Unit = js.native
}

