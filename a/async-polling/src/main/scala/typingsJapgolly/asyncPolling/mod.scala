package typingsJapgolly.asyncPolling

import typingsJapgolly.asyncPolling.anon.On
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Result], Any], 
      Any
    ],
    delay: Double
  ): On = (^.asInstanceOf[js.Dynamic].apply(pollingFunc.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[On]
  
  @JSImport("async-polling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.asyncPolling.asyncPollingStrings.run
    - typingsJapgolly.asyncPolling.asyncPollingStrings.start
    - typingsJapgolly.asyncPolling.asyncPollingStrings.error
    - typingsJapgolly.asyncPolling.asyncPollingStrings.result
    - typingsJapgolly.asyncPolling.asyncPollingStrings.end
    - typingsJapgolly.asyncPolling.asyncPollingStrings.schedule
    - typingsJapgolly.asyncPolling.asyncPollingStrings.stop
  */
  trait EventName extends StObject
  object EventName {
    
    inline def end: typingsJapgolly.asyncPolling.asyncPollingStrings.end = "end".asInstanceOf[typingsJapgolly.asyncPolling.asyncPollingStrings.end]
    
    inline def error: typingsJapgolly.asyncPolling.asyncPollingStrings.error = "error".asInstanceOf[typingsJapgolly.asyncPolling.asyncPollingStrings.error]
    
    inline def result: typingsJapgolly.asyncPolling.asyncPollingStrings.result = "result".asInstanceOf[typingsJapgolly.asyncPolling.asyncPollingStrings.result]
    
    inline def run: typingsJapgolly.asyncPolling.asyncPollingStrings.run = "run".asInstanceOf[typingsJapgolly.asyncPolling.asyncPollingStrings.run]
    
    inline def schedule: typingsJapgolly.asyncPolling.asyncPollingStrings.schedule = "schedule".asInstanceOf[typingsJapgolly.asyncPolling.asyncPollingStrings.schedule]
    
    inline def start: typingsJapgolly.asyncPolling.asyncPollingStrings.start = "start".asInstanceOf[typingsJapgolly.asyncPolling.asyncPollingStrings.start]
    
    inline def stop: typingsJapgolly.asyncPolling.asyncPollingStrings.stop = "stop".asInstanceOf[typingsJapgolly.asyncPolling.asyncPollingStrings.stop]
  }
}
