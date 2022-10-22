package typingsJapgolly.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSignalingChannelInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel that you want to delete.
    */
  var ChannelARN: ResourceARN
  
  /**
    * The current version of the signaling channel that you want to delete. You can obtain the current version by invoking the DescribeSignalingChannel or ListSignalingChannels API operations.
    */
  var CurrentVersion: js.UndefOr[Version] = js.undefined
}
object DeleteSignalingChannelInput {
  
  inline def apply(ChannelARN: ResourceARN): DeleteSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSignalingChannelInput]
  }
  
  extension [Self <: DeleteSignalingChannelInput](x: Self) {
    
    inline def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
  }
}
