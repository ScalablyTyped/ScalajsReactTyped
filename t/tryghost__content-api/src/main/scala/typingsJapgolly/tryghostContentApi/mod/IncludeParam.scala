package typingsJapgolly.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.authors
  - typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.tags
  - typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.countDotposts
*/
trait IncludeParam extends js.Object

object IncludeParam {
  @scala.inline
  def authors: typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.authors = this.cast("authors")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def countDotposts: typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.countDotposts = this.cast("count.posts")
  @scala.inline
  def tags: typingsJapgolly.tryghostContentApi.tryghostContentApiStrings.tags = this.cast("tags")
}

