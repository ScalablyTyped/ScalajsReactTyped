package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Simple user interface events. */
@js.native
trait UIEvent extends Event {
  val detail: Double = js.native
  val view: org.scalajs.dom.raw.Window | Null = js.native
  /** @deprecated */
  val which: Double = js.native
}

@JSGlobal("UIEvent")
@js.native
object UIEvent
  extends Instantiable1[/* type */ java.lang.String, UIEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ UIEventInit, UIEvent]

