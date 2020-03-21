package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an <img>, <audio>, <video>, <style> or <link>). */
@js.native
trait ProgressEvent[T /* <: org.scalajs.dom.raw.EventTarget */] extends Event_ {
  val lengthComputable: scala.Boolean = js.native
  val loaded: Double = js.native
  @JSName("target")
  val target_ProgressEvent: T | Null = js.native
  val total: Double = js.native
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends Instantiable1[/* type */ java.lang.String, ProgressEvent[EventTarget]]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ProgressEventInit, 
      ProgressEvent[EventTarget]
    ]

