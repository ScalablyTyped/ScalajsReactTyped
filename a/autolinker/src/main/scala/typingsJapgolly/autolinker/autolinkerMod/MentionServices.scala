package typingsJapgolly.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.autolinker.autolinkerStrings.twitter
  - typingsJapgolly.autolinker.autolinkerStrings.instagram
  - typingsJapgolly.autolinker.autolinkerStrings.soundcloud
*/
trait MentionServices extends js.Object

object MentionServices {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def instagram: typingsJapgolly.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def soundcloud: typingsJapgolly.autolinker.autolinkerStrings.soundcloud = this.cast("soundcloud")
  @scala.inline
  def twitter: typingsJapgolly.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

