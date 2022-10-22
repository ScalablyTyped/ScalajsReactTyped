package typingsJapgolly.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyBackupToRegionResponse extends StObject {
  
  /**
    * Information on the backup that will be copied to the destination region, including CreateTimestamp, SourceBackup, SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same as that of the source backup. You will need to use the sourceBackupID returned in this operation to use the DescribeBackups operation on the backup that will be copied to the destination region.
    */
  var DestinationBackup: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmv2Mod.DestinationBackup] = js.undefined
}
object CopyBackupToRegionResponse {
  
  inline def apply(): CopyBackupToRegionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyBackupToRegionResponse]
  }
  
  extension [Self <: CopyBackupToRegionResponse](x: Self) {
    
    inline def setDestinationBackup(value: DestinationBackup): Self = StObject.set(x, "DestinationBackup", value.asInstanceOf[js.Any])
    
    inline def setDestinationBackupUndefined: Self = StObject.set(x, "DestinationBackup", js.undefined)
  }
}
