package typingsJapgolly.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamInput extends StObject {
  
  /**
    * The version of the stream whose metadata you want to update.
    */
  var CurrentVersion: Version
  
  /**
    * The name of the device that is writing to the stream.    In the current implementation, Kinesis Video Streams does not use this name.  
    */
  var DeviceName: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoMod.DeviceName] = js.undefined
  
  /**
    * The stream's media type. Use MediaType to specify the type of content that the stream contains to the consumers of the stream. For more information about media types, see Media Types. If you choose to specify the MediaType, see Naming Requirements. To play video on the console, you must specify the correct video type. For example, if the video in the stream is H.264, specify video/h264 as the MediaType.
    */
  var MediaType: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoMod.MediaType] = js.undefined
  
  /**
    * The ARN of the stream whose metadata you want to update.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream whose metadata you want to update. The stream name is an identifier for the stream, and must be unique for each account and region.
    */
  var StreamName: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
}
object UpdateStreamInput {
  
  inline def apply(CurrentVersion: Version): UpdateStreamInput = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamInput]
  }
  
  extension [Self <: UpdateStreamInput](x: Self) {
    
    inline def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "MediaType", js.undefined)
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
