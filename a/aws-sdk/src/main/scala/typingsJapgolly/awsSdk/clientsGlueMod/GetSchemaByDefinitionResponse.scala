package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaByDefinitionResponse extends StObject {
  
  /**
    * The date and time the schema was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined
  
  /**
    * The data format of the schema definition. Currently AVRO, JSON and PROTOBUF are supported.
    */
  var DataFormat: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.DataFormat] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The schema ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The status of the schema version.
    */
  var Status: js.UndefOr[SchemaVersionStatus] = js.undefined
}
object GetSchemaByDefinitionResponse {
  
  inline def apply(): GetSchemaByDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaByDefinitionResponse]
  }
  
  extension [Self <: GetSchemaByDefinitionResponse](x: Self) {
    
    inline def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    inline def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    inline def setStatus(value: SchemaVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
