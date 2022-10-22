package typingsJapgolly.timerMachine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timer-machine", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Timer {
    def this(started: Boolean) = this()
  }
  @JSImport("timer-machine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def destroy(reference: String): Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(reference.asInstanceOf[js.Any]).asInstanceOf[Timer]
  
  /* static member */
  inline def get(reference: String): Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(reference.asInstanceOf[js.Any]).asInstanceOf[Timer]
  
  @js.native
  trait Timer extends StObject {
    
    def emitTime(): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    def isStopped(): Boolean = js.native
    
    def on(event: TimerEvent): Unit = js.native
    def on(event: TimerEvent, callback: js.Function0[Unit]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def time(): Double = js.native
    
    def timeFromStart(): Double = js.native
    
    def toggle(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.timerMachine.timerMachineStrings.start
    - typingsJapgolly.timerMachine.timerMachineStrings.stop
    - typingsJapgolly.timerMachine.timerMachineStrings.time
  */
  trait TimerEvent extends StObject
  object TimerEvent {
    
    inline def start: typingsJapgolly.timerMachine.timerMachineStrings.start = "start".asInstanceOf[typingsJapgolly.timerMachine.timerMachineStrings.start]
    
    inline def stop: typingsJapgolly.timerMachine.timerMachineStrings.stop = "stop".asInstanceOf[typingsJapgolly.timerMachine.timerMachineStrings.stop]
    
    inline def time: typingsJapgolly.timerMachine.timerMachineStrings.time = "time".asInstanceOf[typingsJapgolly.timerMachine.timerMachineStrings.time]
  }
}
