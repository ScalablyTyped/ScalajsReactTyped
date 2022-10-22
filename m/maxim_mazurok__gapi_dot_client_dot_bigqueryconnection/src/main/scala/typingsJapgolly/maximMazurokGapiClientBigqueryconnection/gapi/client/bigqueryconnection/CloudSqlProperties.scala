package typingsJapgolly.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudSqlProperties extends StObject {
  
  /** Input only. Cloud SQL credential. */
  var credential: js.UndefOr[CloudSqlCredential] = js.undefined
  
  /** Database name. */
  var database: js.UndefOr[String] = js.undefined
  
  /** Cloud SQL instance ID in the form `project:location:instance`. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The account ID of the service used for the purpose of this connection. When the connection is used in the context of an operation in BigQuery, this service account will
    * serve as the identity being used for connecting to the CloudSQL instance specified in this connection.
    */
  var serviceAccountId: js.UndefOr[String] = js.undefined
  
  /** Type of the Cloud SQL database. */
  var `type`: js.UndefOr[String] = js.undefined
}
object CloudSqlProperties {
  
  inline def apply(): CloudSqlProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlProperties]
  }
  
  extension [Self <: CloudSqlProperties](x: Self) {
    
    inline def setCredential(value: CloudSqlCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setServiceAccountId(value: String): Self = StObject.set(x, "serviceAccountId", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountIdUndefined: Self = StObject.set(x, "serviceAccountId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
