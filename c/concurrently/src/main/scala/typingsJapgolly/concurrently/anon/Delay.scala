package typingsJapgolly.concurrently.anon

import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var logger: typingsJapgolly.concurrently.distSrcLoggerMod.Logger
  
  var scheduler: js.UndefOr[SchedulerLike] = js.undefined
  
  var tries: js.UndefOr[Double] = js.undefined
}
object Delay {
  
  inline def apply(logger: typingsJapgolly.concurrently.distSrcLoggerMod.Logger): Delay = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  extension [Self <: Delay](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setLogger(value: typingsJapgolly.concurrently.distSrcLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setScheduler(value: SchedulerLike): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    
    inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
    
    inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
  }
}
