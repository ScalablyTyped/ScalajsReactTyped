package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFileDetails extends StObject {
  
  /** A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream. */
  var audioStreams: js.UndefOr[js.Array[VideoFileDetailsAudioStream]] = js.undefined
  
  /** The uploaded video file's combined (video and audio) bitrate in bits per second. */
  var bitrateBps: js.UndefOr[String] = js.undefined
  
  /** The uploaded video file's container format. */
  var container: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are supported: - Date only:
    * YYYY-MM-DD - Naive time: YYYY-MM-DDTHH:MM:SS - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM
    */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** The length of the uploaded video in milliseconds. */
  var durationMs: js.UndefOr[String] = js.undefined
  
  /** The uploaded file's name. This field is present whether a video file or another type of file was uploaded. */
  var fileName: js.UndefOr[String] = js.undefined
  
  /** The uploaded file's size in bytes. This field is present whether a video file or another type of file was uploaded. */
  var fileSize: js.UndefOr[String] = js.undefined
  
  /**
    * The uploaded file's type as detected by YouTube's video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another
    * type of file was uploaded.
    */
  var fileType: js.UndefOr[String] = js.undefined
  
  /** A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream. */
  var videoStreams: js.UndefOr[js.Array[VideoFileDetailsVideoStream]] = js.undefined
}
object VideoFileDetails {
  
  inline def apply(): VideoFileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFileDetails]
  }
  
  extension [Self <: VideoFileDetails](x: Self) {
    
    inline def setAudioStreams(value: js.Array[VideoFileDetailsAudioStream]): Self = StObject.set(x, "audioStreams", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamsUndefined: Self = StObject.set(x, "audioStreams", js.undefined)
    
    inline def setAudioStreamsVarargs(value: VideoFileDetailsAudioStream*): Self = StObject.set(x, "audioStreams", js.Array(value*))
    
    inline def setBitrateBps(value: String): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setVideoStreams(value: js.Array[VideoFileDetailsVideoStream]): Self = StObject.set(x, "videoStreams", value.asInstanceOf[js.Any])
    
    inline def setVideoStreamsUndefined: Self = StObject.set(x, "videoStreams", js.undefined)
    
    inline def setVideoStreamsVarargs(value: VideoFileDetailsVideoStream*): Self = StObject.set(x, "videoStreams", js.Array(value*))
  }
}
