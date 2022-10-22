package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishSchemaRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see arns.
    */
  var DevelopmentSchemaArn: Arn
  
  /**
    * The minor version under which the schema will be published. This parameter is recommended. Schemas have both a major and minor version associated with them.
    */
  var MinorVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The new name under which the schema will be published. If this is not provided, the development schema is considered.
    */
  var Name: js.UndefOr[SchemaName] = js.undefined
  
  /**
    * The major version under which the schema will be published. Schemas have both a major and minor version associated with them.
    */
  var Version: typingsJapgolly.awsSdk.clientsClouddirectoryMod.Version
}
object PublishSchemaRequest {
  
  inline def apply(DevelopmentSchemaArn: Arn, Version: Version): PublishSchemaRequest = {
    val __obj = js.Dynamic.literal(DevelopmentSchemaArn = DevelopmentSchemaArn.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishSchemaRequest]
  }
  
  extension [Self <: PublishSchemaRequest](x: Self) {
    
    inline def setDevelopmentSchemaArn(value: Arn): Self = StObject.set(x, "DevelopmentSchemaArn", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: Version): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersionUndefined: Self = StObject.set(x, "MinorVersion", js.undefined)
    
    inline def setName(value: SchemaName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
