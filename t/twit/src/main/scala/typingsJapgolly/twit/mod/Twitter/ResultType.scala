package typingsJapgolly.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twit.twitStrings.mixed
  - typingsJapgolly.twit.twitStrings.popular
  - typingsJapgolly.twit.twitStrings.recent
*/
trait ResultType extends js.Object

object ResultType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mixed: typingsJapgolly.twit.twitStrings.mixed = this.cast("mixed")
  @scala.inline
  def popular: typingsJapgolly.twit.twitStrings.popular = this.cast("popular")
  @scala.inline
  def recent: typingsJapgolly.twit.twitStrings.recent = this.cast("recent")
}

