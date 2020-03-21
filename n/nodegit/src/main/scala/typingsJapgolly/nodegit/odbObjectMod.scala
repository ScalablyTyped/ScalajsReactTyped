package typingsJapgolly.nodegit

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodegit.oidMod.Oid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/odb-object", JSImport.Namespace)
@js.native
object odbObjectMod extends js.Object {
  @js.native
  class OdbObject () extends js.Object {
    def data(): Buffer = js.native
    def dup(): js.Promise[OdbObject] = js.native
    def free(): Unit = js.native
    def id(): Oid = js.native
    def size(): Double = js.native
    def `type`(): Double = js.native
  }
  
}

