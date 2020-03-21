package typingsJapgolly.domMediacaptureRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.inactive
  - typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.recording
  - typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.paused
*/
trait RecordingState extends js.Object

object RecordingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.inactive = this.cast("inactive")
  @scala.inline
  def paused: typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.paused = this.cast("paused")
  @scala.inline
  def recording: typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.recording = this.cast("recording")
}

