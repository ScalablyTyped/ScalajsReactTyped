package typingsJapgolly.autolinker

import typingsJapgolly.autolinker.autolinkerMod.HashtagConfig
import typingsJapgolly.autolinker.autolinkerMod.MentionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object autolinkerBooleans {
  @js.native
  sealed trait `false`
    extends HashtagConfig
       with MentionConfig
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
}

