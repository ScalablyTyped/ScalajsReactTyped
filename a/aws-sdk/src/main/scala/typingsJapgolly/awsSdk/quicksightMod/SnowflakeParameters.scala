package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnowflakeParameters extends js.Object {
  /**
    * Database.
    */
  var Database: typingsJapgolly.awsSdk.quicksightMod.Database = js.native
  /**
    * Host.
    */
  var Host: typingsJapgolly.awsSdk.quicksightMod.Host = js.native
  /**
    * Warehouse.
    */
  var Warehouse: typingsJapgolly.awsSdk.quicksightMod.Warehouse = js.native
}

object SnowflakeParameters {
  @scala.inline
  def apply(Database: Database, Host: Host, Warehouse: Warehouse): SnowflakeParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Warehouse = Warehouse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnowflakeParameters]
  }
}

