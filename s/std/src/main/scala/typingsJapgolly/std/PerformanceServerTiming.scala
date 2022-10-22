package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceServerTiming extends StObject {
  
  /* standard dom */
  val description: java.lang.String
  
  /* standard dom */
  val duration: DOMHighResTimeStamp
  
  /* standard dom */
  val name: java.lang.String
  
  /* standard dom */
  def toJSON(): Any
}
object PerformanceServerTiming {
  
  inline def apply(
    description: java.lang.String,
    duration: DOMHighResTimeStamp,
    name: java.lang.String,
    toJSON: CallbackTo[Any]
  ): PerformanceServerTiming = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[PerformanceServerTiming]
  }
  
  extension [Self <: PerformanceServerTiming](x: Self) {
    
    inline def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: DOMHighResTimeStamp): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
