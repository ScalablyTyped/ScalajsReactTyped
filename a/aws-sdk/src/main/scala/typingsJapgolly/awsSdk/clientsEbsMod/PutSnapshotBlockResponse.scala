package typingsJapgolly.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSnapshotBlockResponse extends StObject {
  
  /**
    * The SHA256 checksum generated for the block data by Amazon EBS.
    */
  var Checksum: js.UndefOr[typingsJapgolly.awsSdk.clientsEbsMod.Checksum] = js.undefined
  
  /**
    * The algorithm used by Amazon EBS to generate the checksum.
    */
  var ChecksumAlgorithm: js.UndefOr[typingsJapgolly.awsSdk.clientsEbsMod.ChecksumAlgorithm] = js.undefined
}
object PutSnapshotBlockResponse {
  
  inline def apply(): PutSnapshotBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSnapshotBlockResponse]
  }
  
  extension [Self <: PutSnapshotBlockResponse](x: Self) {
    
    inline def setChecksum(value: Checksum): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setChecksumUndefined: Self = StObject.set(x, "Checksum", js.undefined)
  }
}
