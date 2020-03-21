package typingsJapgolly.electronPublish.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.electronPublish.electronPublishStrings.onTag
  - typingsJapgolly.electronPublish.electronPublishStrings.onTagOrDraft
  - typingsJapgolly.electronPublish.electronPublishStrings.always
  - typingsJapgolly.electronPublish.electronPublishStrings.never
*/
trait PublishPolicy extends js.Object

object PublishPolicy {
  @scala.inline
  def always: typingsJapgolly.electronPublish.electronPublishStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typingsJapgolly.electronPublish.electronPublishStrings.never = this.cast("never")
  @scala.inline
  def onTag: typingsJapgolly.electronPublish.electronPublishStrings.onTag = this.cast("onTag")
  @scala.inline
  def onTagOrDraft: typingsJapgolly.electronPublish.electronPublishStrings.onTagOrDraft = this.cast("onTagOrDraft")
}

