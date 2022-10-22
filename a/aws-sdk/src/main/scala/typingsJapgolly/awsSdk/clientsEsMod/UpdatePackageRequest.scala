package typingsJapgolly.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePackageRequest extends StObject {
  
  /**
    * An info message for the new version which will be shown as part of GetPackageVersionHistoryResponse.
    */
  var CommitMessage: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.CommitMessage] = js.undefined
  
  /**
    * New description of the package.
    */
  var PackageDescription: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.PackageDescription] = js.undefined
  
  /**
    * Unique identifier for the package.
    */
  var PackageID: typingsJapgolly.awsSdk.clientsEsMod.PackageID
  
  var PackageSource: typingsJapgolly.awsSdk.clientsEsMod.PackageSource
}
object UpdatePackageRequest {
  
  inline def apply(PackageID: PackageID, PackageSource: PackageSource): UpdatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any], PackageSource = PackageSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackageRequest]
  }
  
  extension [Self <: UpdatePackageRequest](x: Self) {
    
    inline def setCommitMessage(value: CommitMessage): Self = StObject.set(x, "CommitMessage", value.asInstanceOf[js.Any])
    
    inline def setCommitMessageUndefined: Self = StObject.set(x, "CommitMessage", js.undefined)
    
    inline def setPackageDescription(value: PackageDescription): Self = StObject.set(x, "PackageDescription", value.asInstanceOf[js.Any])
    
    inline def setPackageDescriptionUndefined: Self = StObject.set(x, "PackageDescription", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    inline def setPackageSource(value: PackageSource): Self = StObject.set(x, "PackageSource", value.asInstanceOf[js.Any])
  }
}
