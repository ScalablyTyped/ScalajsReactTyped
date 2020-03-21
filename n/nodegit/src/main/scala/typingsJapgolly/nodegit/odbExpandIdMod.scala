package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.objectMod.Object.TYPE
import typingsJapgolly.nodegit.oidMod.Oid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/odb-expand-id", JSImport.Namespace)
@js.native
object odbExpandIdMod extends js.Object {
  @js.native
  class OdbExpandId () extends js.Object {
    var id: Oid = js.native
    var length: Double = js.native
    var `type`: TYPE = js.native
  }
  
}

