package typingsJapgolly.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntityResponse extends StObject {
  
  /**
    * This stringified JSON object includes the details of the entity.
    */
  var Details: js.UndefOr[Json] = js.undefined
  
  /**
    * The ARN associated to the unique identifier for the entity referenced in this request.
    */
  var EntityArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the entity, in the format of EntityId@RevisionId.
    */
  var EntityIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The named type of the entity, in the format of EntityType@Version.
    */
  var EntityType: js.UndefOr[typingsJapgolly.awsSdk.clientsMarketplacecatalogMod.EntityType] = js.undefined
  
  /**
    * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[DateTimeISO8601] = js.undefined
}
object DescribeEntityResponse {
  
  inline def apply(): DescribeEntityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityResponse]
  }
  
  extension [Self <: DescribeEntityResponse](x: Self) {
    
    inline def setDetails(value: Json): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setEntityArn(value: ARN): Self = StObject.set(x, "EntityArn", value.asInstanceOf[js.Any])
    
    inline def setEntityArnUndefined: Self = StObject.set(x, "EntityArn", js.undefined)
    
    inline def setEntityIdentifier(value: Identifier): Self = StObject.set(x, "EntityIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEntityIdentifierUndefined: Self = StObject.set(x, "EntityIdentifier", js.undefined)
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "EntityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "EntityType", js.undefined)
    
    inline def setLastModifiedDate(value: DateTimeISO8601): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
  }
}
