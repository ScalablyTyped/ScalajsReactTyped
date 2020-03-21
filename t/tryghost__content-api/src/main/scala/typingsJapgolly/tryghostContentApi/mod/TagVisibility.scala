package typingsJapgolly.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.public
  - typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.draft
  - typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.scheduled
*/
trait TagVisibility extends js.Object

object TagVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def draft: typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.draft = this.cast("draft")
  @scala.inline
  def public: typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.public = this.cast("public")
  @scala.inline
  def scheduled: typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.scheduled = this.cast("scheduled")
}

