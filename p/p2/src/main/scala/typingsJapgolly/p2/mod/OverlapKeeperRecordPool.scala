package typingsJapgolly.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "OverlapKeeperRecordPool")
@js.native
class OverlapKeeperRecordPool () extends Pool {
  def create(): OverlapKeeperRecord = js.native
  def destroy(record: OverlapKeeperRecord): OverlapKeeperRecordPool = js.native
}

