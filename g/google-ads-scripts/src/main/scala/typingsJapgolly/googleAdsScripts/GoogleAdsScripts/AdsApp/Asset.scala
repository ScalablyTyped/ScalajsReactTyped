package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads asset. An asset can be an image, text, or video. Assets are deduplicated within a given customer account, so assets may be shared between different ads. */
trait Asset extends StObject {
  
  /** Returns image dimension info if this asset is an image, or null otherwise. */
  def getDimensions(): Dimensions | Null
  
  /** Returns the type of this entity as a String, in this case, "Asset". */
  def getEntityType(): String
  
  /** Returns the ID of the asset. */
  def getId(): Double
  
  /** Returns the image URL if this asset is an image, or null otherwise. */
  def getImageUrl(): String | Null
  
  /** Returns the name of the asset object, or null if the asset was created without a name. */
  def getName(): String | Null
  
  /** Returns asset text if this is a text asset, or null otherwise. */
  def getText(): String | Null
  
  /** Returns the asset object's type. */
  def getType(): String
  
  /** Returns the YouTube video ID if this asset is a YouTube video, or null otherwise. */
  def getYouTubeVideoId(): String | Null
}
object Asset {
  
  inline def apply(
    getDimensions: CallbackTo[Dimensions | Null],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getImageUrl: CallbackTo[String | Null],
    getName: CallbackTo[String | Null],
    getText: CallbackTo[String | Null],
    getType: CallbackTo[String],
    getYouTubeVideoId: CallbackTo[String | Null]
  ): Asset = {
    val __obj = js.Dynamic.literal(getDimensions = getDimensions.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getImageUrl = getImageUrl.toJsFn, getName = getName.toJsFn, getText = getText.toJsFn, getType = getType.toJsFn, getYouTubeVideoId = getYouTubeVideoId.toJsFn)
    __obj.asInstanceOf[Asset]
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setGetDimensions(value: CallbackTo[Dimensions | Null]): Self = StObject.set(x, "getDimensions", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetImageUrl(value: CallbackTo[String | Null]): Self = StObject.set(x, "getImageUrl", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String | Null]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetYouTubeVideoId(value: CallbackTo[String | Null]): Self = StObject.set(x, "getYouTubeVideoId", value.toJsFn)
  }
}
