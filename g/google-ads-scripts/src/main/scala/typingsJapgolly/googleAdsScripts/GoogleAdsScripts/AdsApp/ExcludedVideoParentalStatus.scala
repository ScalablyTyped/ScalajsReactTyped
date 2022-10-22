package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Parental Status criterion in a Video Campaign. */
trait ExcludedVideoParentalStatus extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoParentalStatus". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video parental status. */
  def getId(): Double
  
  /** Returns the parental status type. */
  def getParentType(): String
  
  /** Returns the ad group to which this excluded video parental status belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video parental status belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Enable this excluded video parental status in the ad group. */
  def include(): Unit
}
object ExcludedVideoParentalStatus {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getParentType: CallbackTo[String],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    include: Callback
  ): ExcludedVideoParentalStatus = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getParentType = getParentType.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, include = include.toJsFn)
    __obj.asInstanceOf[ExcludedVideoParentalStatus]
  }
  
  extension [Self <: ExcludedVideoParentalStatus](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetParentType(value: CallbackTo[String]): Self = StObject.set(x, "getParentType", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setInclude(value: Callback): Self = StObject.set(x, "include", value.toJsFn)
  }
}
