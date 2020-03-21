package typingsJapgolly.linkifyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.linkifyjs.linkifyjsStrings.url
  - typingsJapgolly.linkifyjs.linkifyjsStrings.email
  - typingsJapgolly.linkifyjs.linkifyjsStrings.hashtag
  - typingsJapgolly.linkifyjs.linkifyjsStrings.mention
*/
trait LinkEntityType extends js.Object

object LinkEntityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsJapgolly.linkifyjs.linkifyjsStrings.email = this.cast("email")
  @scala.inline
  def hashtag: typingsJapgolly.linkifyjs.linkifyjsStrings.hashtag = this.cast("hashtag")
  @scala.inline
  def mention: typingsJapgolly.linkifyjs.linkifyjsStrings.mention = this.cast("mention")
  @scala.inline
  def url: typingsJapgolly.linkifyjs.linkifyjsStrings.url = this.cast("url")
}

