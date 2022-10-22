package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FrequencyCaps provides access to each of the frequency cap. */
trait FrequencyCaps extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "FrequencyCaps". */
  def getEntityType(): String
  
  /** Get frequency cap for the chosen event type. */
  def getFrequencyCapFor(): FrequencyCap
  
  /** Returns a new frequency cap builder for the campaign that the frequency caps belong to. */
  def newFrequencyCapBuilder(): FrequencyCapBuilder
  
  /** Remove frequency cap for the chosen event type. */
  def removeFrequencyCapFor(eventType: String): Unit
}
object FrequencyCaps {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getFrequencyCapFor: CallbackTo[FrequencyCap],
    newFrequencyCapBuilder: CallbackTo[FrequencyCapBuilder],
    removeFrequencyCapFor: String => Callback
  ): FrequencyCaps = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getFrequencyCapFor = getFrequencyCapFor.toJsFn, newFrequencyCapBuilder = newFrequencyCapBuilder.toJsFn, removeFrequencyCapFor = js.Any.fromFunction1((t0: String) => removeFrequencyCapFor(t0).runNow()))
    __obj.asInstanceOf[FrequencyCaps]
  }
  
  extension [Self <: FrequencyCaps](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetFrequencyCapFor(value: CallbackTo[FrequencyCap]): Self = StObject.set(x, "getFrequencyCapFor", value.toJsFn)
    
    inline def setNewFrequencyCapBuilder(value: CallbackTo[FrequencyCapBuilder]): Self = StObject.set(x, "newFrequencyCapBuilder", value.toJsFn)
    
    inline def setRemoveFrequencyCapFor(value: String => Callback): Self = StObject.set(x, "removeFrequencyCapFor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
