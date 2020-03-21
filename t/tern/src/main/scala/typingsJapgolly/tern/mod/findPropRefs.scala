package typingsJapgolly.tern.mod

import typingsJapgolly.estree.mod.Node
import typingsJapgolly.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findPropRefs")
@js.native
object findPropRefs extends js.Object {
  def apply(
    ast: Program,
    scope: typingsJapgolly.tern.inferMod.Scope,
    objType: typingsJapgolly.tern.inferMod.Obj,
    propName: String,
    f: js.Function1[/* Node */ Node, Unit]
  ): Unit = js.native
}

