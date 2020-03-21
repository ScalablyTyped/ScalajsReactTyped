package typingsJapgolly.tslint

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Set
import typingsJapgolly.tslint.completedDocsRuleMod.All
import typingsJapgolly.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import typingsJapgolly.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusion", JSImport.Namespace)
@js.native
object exclusionMod extends js.Object {
  @js.native
  abstract class Exclusion[TDescriptor /* <: ExclusionDescriptor */] () extends js.Object {
    def this(descriptor: Partial[TDescriptor]) = this()
    val descriptor: Partial[TDescriptor] = js.native
    /* protected */ def createSet[T /* <: All | String */](): Set[T] = js.native
    /* protected */ def createSet[T /* <: All | String */](values: js.Array[T]): Set[T] = js.native
    def excludes(node: Node): Boolean = js.native
  }
  
}

