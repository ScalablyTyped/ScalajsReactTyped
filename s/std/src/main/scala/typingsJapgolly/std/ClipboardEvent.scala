package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events providing information related to modification of the clipboard, that is cut, copy, and paste events. */
@js.native
trait ClipboardEvent extends Event {
  val clipboardData: org.scalajs.dom.raw.DataTransfer | Null = js.native
}

@JSGlobal("ClipboardEvent")
@js.native
object ClipboardEvent
  extends Instantiable1[/* type */ java.lang.String, ClipboardEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ClipboardEventInit, ClipboardEvent]

