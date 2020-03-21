package typingsJapgolly.webcl

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.webcl.WEBCL.CommandExecutionStatus
import typingsJapgolly.webcl.WEBCL.EventInfo
import typingsJapgolly.webcl.WEBCL.ProfilingInfo
import typingsJapgolly.webcl.WEBCL.WebCLCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebCLEvent")
@js.native
class WebCLEvent ()
  extends typingsJapgolly.webcl.WEBCL.WebCLEvent {
  /* CompleteClass */
  override def getInfo(name: EventInfo): js.Any = js.native
  /* CompleteClass */
  override def getProfilingInfo(name: ProfilingInfo): Double = js.native
  /* CompleteClass */
  override def release(): Unit = js.native
  /* CompleteClass */
  override def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit = js.native
}

@JSGlobal("WebCLEvent")
@js.native
object WebCLEvent
  extends Instantiable0[typingsJapgolly.webcl.WEBCL.WebCLEvent]

