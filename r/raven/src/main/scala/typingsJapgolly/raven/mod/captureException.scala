package typingsJapgolly.raven.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "captureException")
@js.native
object captureException extends js.Object {
  def apply(e: js.Error): String = js.native
  def apply(e: js.Error, cb: CaptureCallback): String = js.native
  def apply(e: js.Error, options: CaptureOptions): String = js.native
  def apply(e: js.Error, options: CaptureOptions, cb: CaptureCallback): String = js.native
}

