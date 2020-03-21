package typingsJapgolly.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.autolinker.autolinkerStrings.twitter
  - typingsJapgolly.autolinker.autolinkerStrings.facebook
  - typingsJapgolly.autolinker.autolinkerStrings.instagram
*/
trait HashtagServices extends js.Object

object HashtagServices {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facebook: typingsJapgolly.autolinker.autolinkerStrings.facebook = this.cast("facebook")
  @scala.inline
  def instagram: typingsJapgolly.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def twitter: typingsJapgolly.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

