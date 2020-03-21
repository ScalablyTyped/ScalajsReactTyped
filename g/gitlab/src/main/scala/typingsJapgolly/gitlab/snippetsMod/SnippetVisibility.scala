package typingsJapgolly.gitlab.snippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gitlab.gitlabStrings.`private`
  - typingsJapgolly.gitlab.gitlabStrings.public
  - typingsJapgolly.gitlab.gitlabStrings.internal
*/
trait SnippetVisibility extends js.Object

object SnippetVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def internal: typingsJapgolly.gitlab.gitlabStrings.internal = this.cast("internal")
  @scala.inline
  def `private`: typingsJapgolly.gitlab.gitlabStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsJapgolly.gitlab.gitlabStrings.public = this.cast("public")
}

