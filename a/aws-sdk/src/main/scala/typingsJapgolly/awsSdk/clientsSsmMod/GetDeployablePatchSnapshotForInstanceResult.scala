package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeployablePatchSnapshotForInstanceResult extends StObject {
  
  /**
    * The managed node ID.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.InstanceId] = js.undefined
  
  /**
    * Returns the specific operating system (for example Windows Server 2012 or Amazon Linux 2015.09) on the managed node for the specified patch snapshot.
    */
  var Product: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.Product] = js.undefined
  
  /**
    * A pre-signed Amazon Simple Storage Service (Amazon S3) URL that can be used to download the patch snapshot.
    */
  var SnapshotDownloadUrl: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.SnapshotDownloadUrl] = js.undefined
  
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.SnapshotId] = js.undefined
}
object GetDeployablePatchSnapshotForInstanceResult {
  
  inline def apply(): GetDeployablePatchSnapshotForInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
  }
  
  extension [Self <: GetDeployablePatchSnapshotForInstanceResult](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setProduct(value: Product): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "Product", js.undefined)
    
    inline def setSnapshotDownloadUrl(value: SnapshotDownloadUrl): Self = StObject.set(x, "SnapshotDownloadUrl", value.asInstanceOf[js.Any])
    
    inline def setSnapshotDownloadUrlUndefined: Self = StObject.set(x, "SnapshotDownloadUrl", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
