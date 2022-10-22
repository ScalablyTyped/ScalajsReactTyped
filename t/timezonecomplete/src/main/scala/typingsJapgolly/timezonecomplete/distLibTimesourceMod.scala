package typingsJapgolly.timezonecomplete

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTimesourceMod {
  
  @JSImport("timezonecomplete/dist/lib/timesource", "RealTimeSource")
  @js.native
  open class RealTimeSource ()
    extends StObject
       with TimeSource {
    
    /**
      * Return the current date+time as a javascript Date object
      * @throws nothing
      */
    /* CompleteClass */
    override def now(): js.Date = js.native
  }
  
  trait TimeSource extends StObject {
    
    /**
      * Return the current date+time as a javascript Date object
      * @throws nothing
      */
    def now(): js.Date
  }
  object TimeSource {
    
    inline def apply(now: CallbackTo[js.Date]): TimeSource = {
      val __obj = js.Dynamic.literal(now = now.toJsFn)
      __obj.asInstanceOf[TimeSource]
    }
    
    extension [Self <: TimeSource](x: Self) {
      
      inline def setNow(value: CallbackTo[js.Date]): Self = StObject.set(x, "now", value.toJsFn)
    }
  }
}
