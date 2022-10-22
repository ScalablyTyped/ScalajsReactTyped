package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ad's policy topic.
  * These are policy decisions that have been made about the ad.
  * For more information about policy topics, please see the Google Ads Help Center article.
  */
trait PolicyTopic extends StObject {
  
  /** Returns the ID of the policy topic. */
  def getId(): String
  
  /** Returns the name of the policy topic. */
  def getName(): String
  
  /** Returns the type of the policy topic. */
  def getType(): String
}
object PolicyTopic {
  
  inline def apply(getId: CallbackTo[String], getName: CallbackTo[String], getType: CallbackTo[String]): PolicyTopic = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getName = getName.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[PolicyTopic]
  }
  
  extension [Self <: PolicyTopic](x: Self) {
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
  }
}
