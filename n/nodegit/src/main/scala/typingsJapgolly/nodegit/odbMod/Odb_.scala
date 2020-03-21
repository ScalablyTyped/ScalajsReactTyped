package typingsJapgolly.nodegit.odbMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodegit.objectMod.Object.TYPE
import typingsJapgolly.nodegit.odbExpandIdMod.OdbExpandId
import typingsJapgolly.nodegit.odbObjectMod.OdbObject
import typingsJapgolly.nodegit.oidMod.Oid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/odb", "Odb")
@js.native
class Odb_ () extends js.Object {
  def addDiskAlternate(path: String): Double = js.native
  def expandIds(ids: OdbExpandId, count: Double): Double = js.native
  def free(): Unit = js.native
  def read(id: Oid): js.Promise[OdbObject] = js.native
  def write(data: Buffer, len: Double, `type`: TYPE): js.Promise[Oid] = js.native
}

