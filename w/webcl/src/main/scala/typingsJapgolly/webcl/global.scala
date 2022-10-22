package typingsJapgolly.webcl

import typingsJapgolly.webcl.WEBCL.CommandExecutionStatus
import typingsJapgolly.webcl.WEBCL.EventInfo
import typingsJapgolly.webcl.WEBCL.ProfilingInfo
import typingsJapgolly.webcl.WEBCL.WebCLCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WebCLEvent")
  @js.native
  open class WebCLEvent ()
    extends StObject
       with typingsJapgolly.webcl.WEBCL.WebCLEvent {
    
    /* CompleteClass */
    override def getInfo(name: EventInfo): Any = js.native
    
    /* CompleteClass */
    override def getProfilingInfo(name: ProfilingInfo): Double = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
    
    /* CompleteClass */
    override def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit = js.native
  }
}
