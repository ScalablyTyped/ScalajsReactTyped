package typingsJapgolly.waterline.mod

import typingsJapgolly.waterline.waterlineStrings.alter
import typingsJapgolly.waterline.waterlineStrings.drop
import typingsJapgolly.waterline.waterlineStrings.safe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionDefinition
  extends StObject
     with LifecycleCallbacks {
  
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  var connection: js.UndefOr[String] = js.undefined
  
  var dataEncryptionKeys: js.UndefOr[Any] = js.undefined
  
  var datastore: js.UndefOr[String] = js.undefined
  
  var identity: js.UndefOr[String] = js.undefined
  
  var migrate: js.UndefOr[alter | drop | safe] = js.undefined
  
  var primaryKey: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[Boolean] = js.undefined
  
  var tableName: js.UndefOr[String] = js.undefined
  
  var types: js.UndefOr[Any] = js.undefined
}
object CollectionDefinition {
  
  inline def apply(): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDefinition]
  }
  
  extension [Self <: CollectionDefinition](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setDataEncryptionKeys(value: Any): Self = StObject.set(x, "dataEncryptionKeys", value.asInstanceOf[js.Any])
    
    inline def setDataEncryptionKeysUndefined: Self = StObject.set(x, "dataEncryptionKeys", js.undefined)
    
    inline def setDatastore(value: String): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setDatastoreUndefined: Self = StObject.set(x, "datastore", js.undefined)
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setMigrate(value: alter | drop | safe): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
    
    inline def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
    
    inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setSchema(value: Boolean): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    inline def setTypes(value: Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
