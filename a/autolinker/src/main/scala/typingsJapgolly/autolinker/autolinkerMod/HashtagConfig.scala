package typingsJapgolly.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.autolinker.autolinkerBooleans.`false`
  - typingsJapgolly.autolinker.autolinkerStrings.twitter
  - typingsJapgolly.autolinker.autolinkerStrings.facebook
  - typingsJapgolly.autolinker.autolinkerStrings.instagram
*/
trait HashtagConfig extends js.Object

object HashtagConfig {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facebook: typingsJapgolly.autolinker.autolinkerStrings.facebook = this.cast("facebook")
  @scala.inline
  def `false`: typingsJapgolly.autolinker.autolinkerBooleans.`false` = this.cast(false)
  @scala.inline
  def instagram: typingsJapgolly.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def twitter: typingsJapgolly.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

