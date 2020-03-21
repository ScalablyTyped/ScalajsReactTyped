package typingsJapgolly.twit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twit.twitStrings.statusesSlashfilter
  - typingsJapgolly.twit.twitStrings.statusesSlashsample
  - typingsJapgolly.twit.twitStrings.statusesSlashfirehose
  - typingsJapgolly.twit.twitStrings.user
  - typingsJapgolly.twit.twitStrings.site
*/
trait StreamEndpoint extends js.Object

object StreamEndpoint {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def site: typingsJapgolly.twit.twitStrings.site = this.cast("site")
  @scala.inline
  def statusesSlashfilter: typingsJapgolly.twit.twitStrings.statusesSlashfilter = this.cast("statuses/filter")
  @scala.inline
  def statusesSlashfirehose: typingsJapgolly.twit.twitStrings.statusesSlashfirehose = this.cast("statuses/firehose")
  @scala.inline
  def statusesSlashsample: typingsJapgolly.twit.twitStrings.statusesSlashsample = this.cast("statuses/sample")
  @scala.inline
  def user: typingsJapgolly.twit.twitStrings.user = this.cast("user")
}

