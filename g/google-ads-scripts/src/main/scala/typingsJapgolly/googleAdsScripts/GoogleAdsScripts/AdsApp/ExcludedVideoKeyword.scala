package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Keyword in a Video Campaign. */
trait ExcludedVideoKeyword extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoKeyword". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video keyword. */
  def getId(): Double
  
  /** Returns the text of the excluded video keyword. */
  def getText(): String
  
  /** Returns the ad group to which this excluded video keyword belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video keyword belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video keyword. */
  def remove(): Unit
}
object ExcludedVideoKeyword {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getText: CallbackTo[String],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedVideoKeyword = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getText = getText.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedVideoKeyword]
  }
  
  extension [Self <: ExcludedVideoKeyword](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
