package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notPublished
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.processing
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.published
*/
trait MobileAppPublishingState extends js.Object

object MobileAppPublishingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notPublished: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notPublished = this.cast("notPublished")
  @scala.inline
  def processing: typingsJapgolly.microsoftGraph.microsoftGraphStrings.processing = this.cast("processing")
  @scala.inline
  def published: typingsJapgolly.microsoftGraph.microsoftGraphStrings.published = this.cast("published")
}

