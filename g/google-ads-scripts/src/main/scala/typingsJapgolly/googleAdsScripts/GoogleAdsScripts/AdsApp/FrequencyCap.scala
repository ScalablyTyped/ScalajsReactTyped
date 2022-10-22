package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads frequency cap. */
trait FrequencyCap extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "FrequencyCap". */
  def getEntityType(): String
  
  /** Returns type of event that the cap applies to. */
  def getEventType(): String
  
  /** Returns the level on which the cap is to be applied. */
  def getLevel(): String
  
  /** Returns the cap number for the frequency cap. */
  def getLimit(): Double
  
  /** Returns the unit of time the cap is defined at. */
  def getTimeUnit(): String
}
object FrequencyCap {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getEventType: CallbackTo[String],
    getLevel: CallbackTo[String],
    getLimit: CallbackTo[Double],
    getTimeUnit: CallbackTo[String]
  ): FrequencyCap = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getEventType = getEventType.toJsFn, getLevel = getLevel.toJsFn, getLimit = getLimit.toJsFn, getTimeUnit = getTimeUnit.toJsFn)
    __obj.asInstanceOf[FrequencyCap]
  }
  
  extension [Self <: FrequencyCap](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetEventType(value: CallbackTo[String]): Self = StObject.set(x, "getEventType", value.toJsFn)
    
    inline def setGetLevel(value: CallbackTo[String]): Self = StObject.set(x, "getLevel", value.toJsFn)
    
    inline def setGetLimit(value: CallbackTo[Double]): Self = StObject.set(x, "getLimit", value.toJsFn)
    
    inline def setGetTimeUnit(value: CallbackTo[String]): Self = StObject.set(x, "getTimeUnit", value.toJsFn)
  }
}
