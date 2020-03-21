package typingsJapgolly.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseAccount extends js.Object {
  var ConsistencyPolicy: typingsJapgolly.documentdb.mod.ConsistencyPolicy
  var CurrentMediaStorageUsageInMB: Double
  var DatabasesLink: String
  var MaxMediaStorageUsageInMB: Double
  var MediaLink: String
  var ReadableLocations: js.Array[String]
  var WritableLocations: js.Array[String]
}

object DatabaseAccount {
  @scala.inline
  def apply(
    ConsistencyPolicy: ConsistencyPolicy,
    CurrentMediaStorageUsageInMB: Double,
    DatabasesLink: String,
    MaxMediaStorageUsageInMB: Double,
    MediaLink: String,
    ReadableLocations: js.Array[String],
    WritableLocations: js.Array[String]
  ): DatabaseAccount = {
    val __obj = js.Dynamic.literal(ConsistencyPolicy = ConsistencyPolicy.asInstanceOf[js.Any], CurrentMediaStorageUsageInMB = CurrentMediaStorageUsageInMB.asInstanceOf[js.Any], DatabasesLink = DatabasesLink.asInstanceOf[js.Any], MaxMediaStorageUsageInMB = MaxMediaStorageUsageInMB.asInstanceOf[js.Any], MediaLink = MediaLink.asInstanceOf[js.Any], ReadableLocations = ReadableLocations.asInstanceOf[js.Any], WritableLocations = WritableLocations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabaseAccount]
  }
}

