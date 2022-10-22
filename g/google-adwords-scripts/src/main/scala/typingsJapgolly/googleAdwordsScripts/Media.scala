package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  def getDimensions(): MediaDimensions
  
  def getFileSize(): Double
  
  def getId(): Double
  
  def getMimeType(): String
  
  def getName(): String
  
  def getReferenceId(): String
  
  def getSourceUrl(): String
  
  def getType(): MediaType
  
  def getUrls(): MediaUrls
  
  def getYouTubeVideoId(): String | Unit
}
object Media {
  
  inline def apply(
    getDimensions: CallbackTo[MediaDimensions],
    getFileSize: CallbackTo[Double],
    getId: CallbackTo[Double],
    getMimeType: CallbackTo[String],
    getName: CallbackTo[String],
    getReferenceId: CallbackTo[String],
    getSourceUrl: CallbackTo[String],
    getType: CallbackTo[MediaType],
    getUrls: CallbackTo[MediaUrls],
    getYouTubeVideoId: CallbackTo[String | Unit]
  ): Media = {
    val __obj = js.Dynamic.literal(getDimensions = getDimensions.toJsFn, getFileSize = getFileSize.toJsFn, getId = getId.toJsFn, getMimeType = getMimeType.toJsFn, getName = getName.toJsFn, getReferenceId = getReferenceId.toJsFn, getSourceUrl = getSourceUrl.toJsFn, getType = getType.toJsFn, getUrls = getUrls.toJsFn, getYouTubeVideoId = getYouTubeVideoId.toJsFn)
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setGetDimensions(value: CallbackTo[MediaDimensions]): Self = StObject.set(x, "getDimensions", value.toJsFn)
    
    inline def setGetFileSize(value: CallbackTo[Double]): Self = StObject.set(x, "getFileSize", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetMimeType(value: CallbackTo[String]): Self = StObject.set(x, "getMimeType", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetReferenceId(value: CallbackTo[String]): Self = StObject.set(x, "getReferenceId", value.toJsFn)
    
    inline def setGetSourceUrl(value: CallbackTo[String]): Self = StObject.set(x, "getSourceUrl", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[MediaType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetUrls(value: CallbackTo[MediaUrls]): Self = StObject.set(x, "getUrls", value.toJsFn)
    
    inline def setGetYouTubeVideoId(value: CallbackTo[String | Unit]): Self = StObject.set(x, "getYouTubeVideoId", value.toJsFn)
  }
}
