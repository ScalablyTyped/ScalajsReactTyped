package typingsJapgolly.jsforce.mod

import typingsJapgolly.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "RecordReference")
@js.native
class RecordReference[T] protected ()
  extends typingsJapgolly.jsforce.recordMod.RecordReference[T] {
  def this(conn: typingsJapgolly.jsforce.connectionMod.Connection, `type`: String, id: SalesforceId) = this()
}

