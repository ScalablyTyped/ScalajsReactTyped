package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssetRequest extends StObject {
  
  /**
    * The unique identifier for an asset.
    */
  var AssetId: string
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string
  
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key. When importing from Amazon API Gateway API, the API name is used as the asset name. When importing from Amazon Redshift, the datashare name is used as the asset name.
    */
  var Name: AssetName
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string
}
object UpdateAssetRequest {
  
  inline def apply(AssetId: string, DataSetId: string, Name: AssetName, RevisionId: string): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
  
  extension [Self <: UpdateAssetRequest](x: Self) {
    
    inline def setAssetId(value: string): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AssetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
