package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotInput extends StObject {
  
  /**
    * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel in the Description field, and in the Storage Gateway snapshot Details pane, Description field.
    */
  var SnapshotDescription: typingsJapgolly.awsSdk.clientsStoragegatewayMod.SnapshotDescription
  
  /**
    * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.Tags] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typingsJapgolly.awsSdk.clientsStoragegatewayMod.VolumeARN
}
object CreateSnapshotInput {
  
  inline def apply(SnapshotDescription: SnapshotDescription, VolumeARN: VolumeARN): CreateSnapshotInput = {
    val __obj = js.Dynamic.literal(SnapshotDescription = SnapshotDescription.asInstanceOf[js.Any], VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotInput]
  }
  
  extension [Self <: CreateSnapshotInput](x: Self) {
    
    inline def setSnapshotDescription(value: SnapshotDescription): Self = StObject.set(x, "SnapshotDescription", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
