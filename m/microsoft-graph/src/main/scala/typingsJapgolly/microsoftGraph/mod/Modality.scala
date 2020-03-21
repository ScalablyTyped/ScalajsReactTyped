package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.audio
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.video
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.videoBasedScreenSharing
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.data
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait Modality extends js.Object

object Modality {
  @scala.inline
  def audio: typingsJapgolly.microsoftGraph.microsoftGraphStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsJapgolly.microsoftGraph.microsoftGraphStrings.data = this.cast("data")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def video: typingsJapgolly.microsoftGraph.microsoftGraphStrings.video = this.cast("video")
  @scala.inline
  def videoBasedScreenSharing: typingsJapgolly.microsoftGraph.microsoftGraphStrings.videoBasedScreenSharing = this.cast("videoBasedScreenSharing")
}

