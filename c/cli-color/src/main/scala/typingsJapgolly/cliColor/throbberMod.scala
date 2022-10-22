package typingsJapgolly.cliColor

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throbberMod {
  
  /**
    * Writes throbber string to *write* function at given *interval*. Optionally throbber output can be formatted with given *format* function
    */
  inline def apply(write: js.Function1[/* str */ String, Unit], interval: Double): Throbber = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Throbber]
  inline def apply(
    write: js.Function1[/* str */ String, Unit],
    interval: Double,
    format: js.Function1[/* throbber */ String, String]
  ): Throbber = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Throbber]
  
  @JSImport("cli-color/throbber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cli-color/throbber", "Iterator")
  @js.native
  open class Iterator () extends StObject {
    
    val index: Double = js.native
    
    def next(): String = js.native
    
    def reset(): String = js.native
    
    val running: Boolean = js.native
  }
  
  trait Throbber extends StObject {
    
    def restart(): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object Throbber {
    
    inline def apply(restart: Callback, start: Callback, stop: Callback): Throbber = {
      val __obj = js.Dynamic.literal(restart = restart.toJsFn, start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[Throbber]
    }
    
    extension [Self <: Throbber](x: Self) {
      
      inline def setRestart(value: Callback): Self = StObject.set(x, "restart", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
