package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAssetsToS3ResponseDetails extends StObject {
  
  /**
    * The destination in Amazon S3 where the asset is exported.
    */
  var AssetDestinations: ListOfAssetDestinationEntry
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id
  
  /**
    * Encryption configuration of the export job.
    */
  var Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined
  
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id
}
object ExportAssetsToS3ResponseDetails {
  
  inline def apply(AssetDestinations: ListOfAssetDestinationEntry, DataSetId: Id, RevisionId: Id): ExportAssetsToS3ResponseDetails = {
    val __obj = js.Dynamic.literal(AssetDestinations = AssetDestinations.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetsToS3ResponseDetails]
  }
  
  extension [Self <: ExportAssetsToS3ResponseDetails](x: Self) {
    
    inline def setAssetDestinations(value: ListOfAssetDestinationEntry): Self = StObject.set(x, "AssetDestinations", value.asInstanceOf[js.Any])
    
    inline def setAssetDestinationsVarargs(value: AssetDestinationEntry*): Self = StObject.set(x, "AssetDestinations", js.Array(value*))
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: ExportServerSideEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
