package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
trait PerformanceMeasure
  extends StObject
     with PerformanceEntry {
  
  /* standard dom */
  val detail: Any
}
object PerformanceMeasure {
  
  inline def apply(
    detail: Any,
    duration: DOMHighResTimeStamp,
    entryType: java.lang.String,
    name: java.lang.String,
    startTime: DOMHighResTimeStamp,
    toJSON: CallbackTo[Any]
  ): PerformanceMeasure = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[PerformanceMeasure]
  }
  
  extension [Self <: PerformanceMeasure](x: Self) {
    
    inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
  }
}
