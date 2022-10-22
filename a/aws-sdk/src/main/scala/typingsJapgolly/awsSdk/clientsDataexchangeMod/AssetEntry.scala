package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetEntry extends StObject {
  
  /**
    * The ARN for the asset.
    */
  var Arn: typingsJapgolly.awsSdk.clientsDataexchangeMod.Arn
  
  /**
    * Information about the asset.
    */
  var AssetDetails: typingsJapgolly.awsSdk.clientsDataexchangeMod.AssetDetails
  
  /**
    * The type of asset that is added to a data set.
    */
  var AssetType: typingsJapgolly.awsSdk.clientsDataexchangeMod.AssetType
  
  /**
    * The date and time that the asset was created, in ISO 8601 format.
    */
  var CreatedAt: js.Date
  
  /**
    * The unique identifier for the data set associated with this asset.
    */
  var DataSetId: Id
  
  /**
    * The unique identifier for the asset.
    */
  var Id: typingsJapgolly.awsSdk.clientsDataexchangeMod.Id
  
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key. When importing from Amazon API Gateway API, the API name is used as the asset name. When importing from Amazon Redshift, the datashare name is used as the asset name.
    */
  var Name: AssetName
  
  /**
    * The unique identifier for the revision associated with this asset.
    */
  var RevisionId: Id
  
  /**
    * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when an asset owner is viewing the entitled copy of its owned asset.
    */
  var SourceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The date and time that the asset was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.Date
}
object AssetEntry {
  
  inline def apply(
    Arn: Arn,
    AssetDetails: AssetDetails,
    AssetType: AssetType,
    CreatedAt: js.Date,
    DataSetId: Id,
    Id: Id,
    Name: AssetName,
    RevisionId: Id,
    UpdatedAt: js.Date
  ): AssetEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], AssetDetails = AssetDetails.asInstanceOf[js.Any], AssetType = AssetType.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetEntry]
  }
  
  extension [Self <: AssetEntry](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setAssetDetails(value: AssetDetails): Self = StObject.set(x, "AssetDetails", value.asInstanceOf[js.Any])
    
    inline def setAssetType(value: AssetType): Self = StObject.set(x, "AssetType", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: AssetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: Id): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
