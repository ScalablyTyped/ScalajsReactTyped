package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Google Ads media object. */
trait Media extends StObject {
  
  /** Returns a MediaDimensions instance for the media object if it is an image or video. */
  def getDimensions(): MediaDimensions
  
  /** Returns the type of this entity as a String, in this case, "Media". */
  def getEntityType(): String
  
  /** Returns the size of the media file in bytes. */
  def getFileSize(): Double
  
  /** Returns the ID of the media object. */
  def getId(): Double
  
  /** Returns a MIME type identifier for the media object. */
  def getMimeType(): String
  
  /** Returns the name of the media object, or null if the media was created without a name. */
  def getName(): String
  
  /** Returns the media object's reference ID key. */
  def getReferenceId(): String
  
  /** Returns the URL where the original media was downloaded from, or null if the media was not obtained via download. */
  def getSourceUrl(): String
  
  /** Returns the media object's type. */
  def getType(): String
  
  /** Returns a MediaUrls instance for the media object if it is an image. */
  def getUrls(): MediaUrls
  
  /** Returns the YouTube video ID if this media is a YouTube video, or null otherwise. */
  def getYouTubeVideoId(): String | Null
}
object Media {
  
  inline def apply(
    getDimensions: CallbackTo[MediaDimensions],
    getEntityType: CallbackTo[String],
    getFileSize: CallbackTo[Double],
    getId: CallbackTo[Double],
    getMimeType: CallbackTo[String],
    getName: CallbackTo[String],
    getReferenceId: CallbackTo[String],
    getSourceUrl: CallbackTo[String],
    getType: CallbackTo[String],
    getUrls: CallbackTo[MediaUrls],
    getYouTubeVideoId: CallbackTo[String | Null]
  ): Media = {
    val __obj = js.Dynamic.literal(getDimensions = getDimensions.toJsFn, getEntityType = getEntityType.toJsFn, getFileSize = getFileSize.toJsFn, getId = getId.toJsFn, getMimeType = getMimeType.toJsFn, getName = getName.toJsFn, getReferenceId = getReferenceId.toJsFn, getSourceUrl = getSourceUrl.toJsFn, getType = getType.toJsFn, getUrls = getUrls.toJsFn, getYouTubeVideoId = getYouTubeVideoId.toJsFn)
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setGetDimensions(value: CallbackTo[MediaDimensions]): Self = StObject.set(x, "getDimensions", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetFileSize(value: CallbackTo[Double]): Self = StObject.set(x, "getFileSize", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetMimeType(value: CallbackTo[String]): Self = StObject.set(x, "getMimeType", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetReferenceId(value: CallbackTo[String]): Self = StObject.set(x, "getReferenceId", value.toJsFn)
    
    inline def setGetSourceUrl(value: CallbackTo[String]): Self = StObject.set(x, "getSourceUrl", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetUrls(value: CallbackTo[MediaUrls]): Self = StObject.set(x, "getUrls", value.toJsFn)
    
    inline def setGetYouTubeVideoId(value: CallbackTo[String | Null]): Self = StObject.set(x, "getYouTubeVideoId", value.toJsFn)
  }
}
