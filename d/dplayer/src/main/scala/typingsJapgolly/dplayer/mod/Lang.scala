package typingsJapgolly.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dplayer.dplayerStrings.en
  - typingsJapgolly.dplayer.dplayerStrings.`zh-cn`
  - typingsJapgolly.dplayer.dplayerStrings.`zh-tw`
*/
trait Lang extends js.Object

object Lang {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def en: typingsJapgolly.dplayer.dplayerStrings.en = this.cast("en")
  @scala.inline
  def `zh-cn`: typingsJapgolly.dplayer.dplayerStrings.`zh-cn` = this.cast("zh-cn")
  @scala.inline
  def `zh-tw`: typingsJapgolly.dplayer.dplayerStrings.`zh-tw` = this.cast("zh-tw")
}

