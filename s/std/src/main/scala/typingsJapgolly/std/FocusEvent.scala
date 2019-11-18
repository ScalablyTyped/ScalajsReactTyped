package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Focus-related events like focus, blur, focusin, or focusout. */
@js.native
trait FocusEvent extends UIEvent {
  val relatedTarget: org.scalajs.dom.raw.EventTarget | Null = js.native
}

@JSGlobal("FocusEvent")
@js.native
object FocusEvent
  extends Instantiable1[/* type */ java.lang.String, FocusEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ FocusEventInit, FocusEvent]

