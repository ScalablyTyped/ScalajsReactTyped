package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Window")
@js.native
class WindowCls () extends Window_ {
  /* CompleteClass */
  override val console: Console_ = js.native
  /* CompleteClass */
  override val localStorage: org.scalajs.dom.raw.Storage = js.native
  /* CompleteClass */
  override val sessionStorage: org.scalajs.dom.raw.Storage = js.native
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}

