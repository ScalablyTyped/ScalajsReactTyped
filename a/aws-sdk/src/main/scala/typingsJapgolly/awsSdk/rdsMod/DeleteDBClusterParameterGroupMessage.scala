package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group. Constraints:   Must be the name of an existing DB cluster parameter group.   You can't delete a default DB cluster parameter group.   Can't be associated with any DB clusters.  
    */
  var DBClusterParameterGroupName: String = js.native
}

object DeleteDBClusterParameterGroupMessage {
  @scala.inline
  def apply(DBClusterParameterGroupName: String): DeleteDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDBClusterParameterGroupMessage]
  }
}

