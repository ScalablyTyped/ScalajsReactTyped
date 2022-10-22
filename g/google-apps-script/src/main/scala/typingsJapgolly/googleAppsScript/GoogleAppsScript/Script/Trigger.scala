package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A script trigger.
  */
trait Trigger extends StObject {
  
  def getEventType(): EventType
  
  def getHandlerFunction(): String
  
  def getTriggerSource(): TriggerSource
  
  def getTriggerSourceId(): String
  
  def getUniqueId(): String
}
object Trigger {
  
  inline def apply(
    getEventType: CallbackTo[EventType],
    getHandlerFunction: CallbackTo[String],
    getTriggerSource: CallbackTo[TriggerSource],
    getTriggerSourceId: CallbackTo[String],
    getUniqueId: CallbackTo[String]
  ): Trigger = {
    val __obj = js.Dynamic.literal(getEventType = getEventType.toJsFn, getHandlerFunction = getHandlerFunction.toJsFn, getTriggerSource = getTriggerSource.toJsFn, getTriggerSourceId = getTriggerSourceId.toJsFn, getUniqueId = getUniqueId.toJsFn)
    __obj.asInstanceOf[Trigger]
  }
  
  extension [Self <: Trigger](x: Self) {
    
    inline def setGetEventType(value: CallbackTo[EventType]): Self = StObject.set(x, "getEventType", value.toJsFn)
    
    inline def setGetHandlerFunction(value: CallbackTo[String]): Self = StObject.set(x, "getHandlerFunction", value.toJsFn)
    
    inline def setGetTriggerSource(value: CallbackTo[TriggerSource]): Self = StObject.set(x, "getTriggerSource", value.toJsFn)
    
    inline def setGetTriggerSourceId(value: CallbackTo[String]): Self = StObject.set(x, "getTriggerSourceId", value.toJsFn)
    
    inline def setGetUniqueId(value: CallbackTo[String]): Self = StObject.set(x, "getUniqueId", value.toJsFn)
  }
}
