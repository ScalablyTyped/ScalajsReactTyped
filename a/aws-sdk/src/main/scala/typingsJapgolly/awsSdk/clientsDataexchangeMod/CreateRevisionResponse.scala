package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRevisionResponse extends StObject {
  
  /**
    * The ARN for the revision.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.clientsDataexchangeMod.Arn] = js.undefined
  
  /**
    * An optional comment about the revision.
    */
  var Comment: js.UndefOr[stringMin0Max16384] = js.undefined
  
  /**
    * The date and time that the revision was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier for the data set associated with this revision.
    */
  var DataSetId: js.UndefOr[Id] = js.undefined
  
  /**
    * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this read-only state, you can publish the revision to your products. Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely identified by their ARN.
    */
  var Finalized: js.UndefOr[boolean] = js.undefined
  
  /**
    * The unique identifier for the revision.
    */
  var Id: js.UndefOr[typingsJapgolly.awsSdk.clientsDataexchangeMod.Id] = js.undefined
  
  /**
    * A required comment to inform subscribers of the reason their access to the revision was revoked.
    */
  var RevocationComment: js.UndefOr[stringMin10Max512] = js.undefined
  
  /**
    * A status indicating that subscribers' access to the revision was revoked.
    */
  var Revoked: js.UndefOr[boolean] = js.undefined
  
  /**
    * The date and time that the revision was revoked, in ISO 8601 format.
    */
  var RevokedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter is returned when a revision owner is viewing the entitled copy of its owned revision.
    */
  var SourceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The tags for the revision.
    */
  var Tags: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * The date and time that the revision was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object CreateRevisionResponse {
  
  inline def apply(): CreateRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRevisionResponse]
  }
  
  extension [Self <: CreateRevisionResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setComment(value: stringMin0Max16384): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    inline def setFinalized(value: boolean): Self = StObject.set(x, "Finalized", value.asInstanceOf[js.Any])
    
    inline def setFinalizedUndefined: Self = StObject.set(x, "Finalized", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setRevocationComment(value: stringMin10Max512): Self = StObject.set(x, "RevocationComment", value.asInstanceOf[js.Any])
    
    inline def setRevocationCommentUndefined: Self = StObject.set(x, "RevocationComment", js.undefined)
    
    inline def setRevoked(value: boolean): Self = StObject.set(x, "Revoked", value.asInstanceOf[js.Any])
    
    inline def setRevokedAt(value: js.Date): Self = StObject.set(x, "RevokedAt", value.asInstanceOf[js.Any])
    
    inline def setRevokedAtUndefined: Self = StObject.set(x, "RevokedAt", js.undefined)
    
    inline def setRevokedUndefined: Self = StObject.set(x, "Revoked", js.undefined)
    
    inline def setSourceId(value: Id): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    inline def setTags(value: MapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
