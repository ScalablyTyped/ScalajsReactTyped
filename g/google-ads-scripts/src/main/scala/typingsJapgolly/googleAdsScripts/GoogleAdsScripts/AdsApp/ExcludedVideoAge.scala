package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Age criterion in a Video Campaign. */
trait ExcludedVideoAge extends StObject {
  
  /** Returns the age range. */
  def getAgeRange(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoAge". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video age. */
  def getId(): Double
  
  /** Returns the ad group to which this excluded video age belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video age belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Enable this excluded video age in the ad group. */
  def include(): Unit
}
object ExcludedVideoAge {
  
  inline def apply(
    getAgeRange: CallbackTo[String],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    include: Callback
  ): ExcludedVideoAge = {
    val __obj = js.Dynamic.literal(getAgeRange = getAgeRange.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, include = include.toJsFn)
    __obj.asInstanceOf[ExcludedVideoAge]
  }
  
  extension [Self <: ExcludedVideoAge](x: Self) {
    
    inline def setGetAgeRange(value: CallbackTo[String]): Self = StObject.set(x, "getAgeRange", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setInclude(value: Callback): Self = StObject.set(x, "include", value.toJsFn)
  }
}
