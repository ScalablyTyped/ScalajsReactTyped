package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowflakeParameters extends StObject {
  
  /**
    * Database.
    */
  var Database: typingsJapgolly.awsSdk.clientsQuicksightMod.Database
  
  /**
    * Host.
    */
  var Host: typingsJapgolly.awsSdk.clientsQuicksightMod.Host
  
  /**
    * Warehouse.
    */
  var Warehouse: typingsJapgolly.awsSdk.clientsQuicksightMod.Warehouse
}
object SnowflakeParameters {
  
  inline def apply(Database: Database, Host: Host, Warehouse: Warehouse): SnowflakeParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Warehouse = Warehouse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnowflakeParameters]
  }
  
  extension [Self <: SnowflakeParameters](x: Self) {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setWarehouse(value: Warehouse): Self = StObject.set(x, "Warehouse", value.asInstanceOf[js.Any])
  }
}
