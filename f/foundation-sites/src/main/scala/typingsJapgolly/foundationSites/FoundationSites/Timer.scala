package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timer extends StObject {
  
  def pause(): Unit
  
  def restart(): Unit
  
  def start(): Unit
}
object Timer {
  
  inline def apply(pause: Callback, restart: Callback, start: Callback): Timer = {
    val __obj = js.Dynamic.literal(pause = pause.toJsFn, restart = restart.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[Timer]
  }
  
  extension [Self <: Timer](x: Self) {
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setRestart(value: Callback): Self = StObject.set(x, "restart", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
  }
}
