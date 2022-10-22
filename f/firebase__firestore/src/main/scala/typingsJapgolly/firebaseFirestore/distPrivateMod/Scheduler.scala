package typingsJapgolly.firebaseFirestore.distPrivateMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to schedule periodic tasks within SDK.
  */
trait Scheduler extends StObject {
  
  def start(): Unit
  
  val started: Boolean
  
  def stop(): Unit
}
object Scheduler {
  
  inline def apply(start: Callback, started: Boolean, stop: Callback): Scheduler = {
    val __obj = js.Dynamic.literal(start = start.toJsFn, started = started.asInstanceOf[js.Any], stop = stop.toJsFn)
    __obj.asInstanceOf[Scheduler]
  }
  
  extension [Self <: Scheduler](x: Self) {
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
