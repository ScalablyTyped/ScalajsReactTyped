package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Gender criterion in a Video Campaign. */
trait ExcludedVideoGender extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoGender". */
  def getEntityType(): String
  
  /** Returns the gender type. */
  def getGenderType(): String
  
  /** Returns the ID of the excluded video gender. */
  def getId(): Double
  
  /** Returns the ad group to which this excluded video gender belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video gender belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Enable this excluded video gender in the ad group. */
  def include(): Unit
}
object ExcludedVideoGender {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getGenderType: CallbackTo[String],
    getId: CallbackTo[Double],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    include: Callback
  ): ExcludedVideoGender = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getGenderType = getGenderType.toJsFn, getId = getId.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, include = include.toJsFn)
    __obj.asInstanceOf[ExcludedVideoGender]
  }
  
  extension [Self <: ExcludedVideoGender](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetGenderType(value: CallbackTo[String]): Self = StObject.set(x, "getGenderType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setInclude(value: Callback): Self = StObject.set(x, "include", value.toJsFn)
  }
}
