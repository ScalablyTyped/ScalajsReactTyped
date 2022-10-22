package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the snapshot. 
    */
  var Name: SnapshotName
  
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.Tags] = js.undefined
  
  /**
    * The ID of the volume that you are taking a snapshot of.
    */
  var VolumeId: typingsJapgolly.awsSdk.clientsFsxMod.VolumeId
}
object CreateSnapshotRequest {
  
  inline def apply(Name: SnapshotName, VolumeId: VolumeId): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
  
  extension [Self <: CreateSnapshotRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: SnapshotName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
