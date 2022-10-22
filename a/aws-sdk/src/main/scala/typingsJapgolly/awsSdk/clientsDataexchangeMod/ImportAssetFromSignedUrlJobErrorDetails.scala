package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssetFromSignedUrlJobErrorDetails extends StObject {
  
  /**
    * Information about the job error.
    */
  var AssetName: typingsJapgolly.awsSdk.clientsDataexchangeMod.AssetName
}
object ImportAssetFromSignedUrlJobErrorDetails {
  
  inline def apply(AssetName: AssetName): ImportAssetFromSignedUrlJobErrorDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlJobErrorDetails]
  }
  
  extension [Self <: ImportAssetFromSignedUrlJobErrorDetails](x: Self) {
    
    inline def setAssetName(value: AssetName): Self = StObject.set(x, "AssetName", value.asInstanceOf[js.Any])
  }
}
