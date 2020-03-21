package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSubnetGroupMessage extends js.Object {
  /**
    *  A list of DBSubnetGroup instances. 
    */
  var DBSubnetGroups: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.DBSubnetGroups] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBSubnetGroupMessage {
  @scala.inline
  def apply(DBSubnetGroups: DBSubnetGroups = null, Marker: String = null): DBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroups != null) __obj.updateDynamic("DBSubnetGroups")(DBSubnetGroups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSubnetGroupMessage]
  }
}

