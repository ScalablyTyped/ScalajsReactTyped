package typingsJapgolly.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageRequest extends StObject {
  
  /**
    * Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts from Amazon S3.
    */
  var ForceDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The package's ID.
    */
  var PackageId: NodePackageId
}
object DeletePackageRequest {
  
  inline def apply(PackageId: NodePackageId): DeletePackageRequest = {
    val __obj = js.Dynamic.literal(PackageId = PackageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageRequest]
  }
  
  extension [Self <: DeletePackageRequest](x: Self) {
    
    inline def setForceDelete(value: Boolean): Self = StObject.set(x, "ForceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "ForceDelete", js.undefined)
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
  }
}
