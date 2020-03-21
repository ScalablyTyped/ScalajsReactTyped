package typingsJapgolly.tern.mod

import typingsJapgolly.estree.mod.Node
import typingsJapgolly.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findRefs")
@js.native
object findRefs extends js.Object {
  def apply(
    ast: Program,
    scope: typingsJapgolly.tern.inferMod.Scope,
    name: String,
    refScope: typingsJapgolly.tern.inferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typingsJapgolly.tern.inferMod.Scope, Unit]
  ): Unit = js.native
}

