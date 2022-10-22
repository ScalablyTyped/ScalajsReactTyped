package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsParameters extends StObject {
  
  /**
    * Database.
    */
  var Database: typingsJapgolly.awsSdk.clientsQuicksightMod.Database
  
  /**
    * Instance ID.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsQuicksightMod.InstanceId
}
object RdsParameters {
  
  inline def apply(Database: Database, InstanceId: InstanceId): RdsParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdsParameters]
  }
  
  extension [Self <: RdsParameters](x: Self) {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
