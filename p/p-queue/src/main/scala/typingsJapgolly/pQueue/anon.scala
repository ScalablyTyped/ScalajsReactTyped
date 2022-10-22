package typingsJapgolly.pQueue

import org.scalajs.dom.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions> */
  trait PartialPriorityQueueOptio extends StObject {
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var throwOnTimeout: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PartialPriorityQueueOptio {
    
    inline def apply(): PartialPriorityQueueOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPriorityQueueOptio]
    }
    
    extension [Self <: PartialPriorityQueueOptio](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setThrowOnTimeout(value: Boolean): Self = StObject.set(x, "throwOnTimeout", value.asInstanceOf[js.Any])
      
      inline def setThrowOnTimeoutUndefined: Self = StObject.set(x, "throwOnTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions>> */
  trait ReadonlyPartialPriorityQu extends StObject {
    
    val priority: js.UndefOr[Double] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val throwOnTimeout: js.UndefOr[Boolean] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyPartialPriorityQu {
    
    inline def apply(): ReadonlyPartialPriorityQu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialPriorityQu]
    }
    
    extension [Self <: ReadonlyPartialPriorityQu](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setThrowOnTimeout(value: Boolean): Self = StObject.set(x, "throwOnTimeout", value.asInstanceOf[js.Any])
      
      inline def setThrowOnTimeoutUndefined: Self = StObject.set(x, "throwOnTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
