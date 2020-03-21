package typingsJapgolly.gitlab.notificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gitlab.gitlabStrings.disabled
  - typingsJapgolly.gitlab.gitlabStrings.participating
  - typingsJapgolly.gitlab.gitlabStrings.watch
  - typingsJapgolly.gitlab.gitlabStrings.global
  - typingsJapgolly.gitlab.gitlabStrings.mention
  - typingsJapgolly.gitlab.gitlabStrings.custom
*/
trait NotificationSettingLevel extends js.Object

object NotificationSettingLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typingsJapgolly.gitlab.gitlabStrings.custom = this.cast("custom")
  @scala.inline
  def disabled: typingsJapgolly.gitlab.gitlabStrings.disabled = this.cast("disabled")
  @scala.inline
  def global: typingsJapgolly.gitlab.gitlabStrings.global = this.cast("global")
  @scala.inline
  def mention: typingsJapgolly.gitlab.gitlabStrings.mention = this.cast("mention")
  @scala.inline
  def participating: typingsJapgolly.gitlab.gitlabStrings.participating = this.cast("participating")
  @scala.inline
  def watch: typingsJapgolly.gitlab.gitlabStrings.watch = this.cast("watch")
}

