package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Miscellaneous information about the current script execution. */
trait ExecutionInfo extends StObject {
  
  /** Returns the remaining number of Google Ads entities the script is allowed to create in this execution. */
  def getRemainingCreateQuota(): Double
  
  /** Returns the remaining number of Google Ads entities the script is allowed to fetch in this execution. */
  def getRemainingGetQuota(): Double
  
  /** Returns the remaining time in seconds the script is allowed to execute. */
  def getRemainingTime(): Double
  
  /** Returns true if the script is currently being previewed, or false if it is a live execution. */
  def isPreview(): Boolean
}
object ExecutionInfo {
  
  inline def apply(
    getRemainingCreateQuota: CallbackTo[Double],
    getRemainingGetQuota: CallbackTo[Double],
    getRemainingTime: CallbackTo[Double],
    isPreview: CallbackTo[Boolean]
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(getRemainingCreateQuota = getRemainingCreateQuota.toJsFn, getRemainingGetQuota = getRemainingGetQuota.toJsFn, getRemainingTime = getRemainingTime.toJsFn, isPreview = isPreview.toJsFn)
    __obj.asInstanceOf[ExecutionInfo]
  }
  
  extension [Self <: ExecutionInfo](x: Self) {
    
    inline def setGetRemainingCreateQuota(value: CallbackTo[Double]): Self = StObject.set(x, "getRemainingCreateQuota", value.toJsFn)
    
    inline def setGetRemainingGetQuota(value: CallbackTo[Double]): Self = StObject.set(x, "getRemainingGetQuota", value.toJsFn)
    
    inline def setGetRemainingTime(value: CallbackTo[Double]): Self = StObject.set(x, "getRemainingTime", value.toJsFn)
    
    inline def setIsPreview(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPreview", value.toJsFn)
  }
}
