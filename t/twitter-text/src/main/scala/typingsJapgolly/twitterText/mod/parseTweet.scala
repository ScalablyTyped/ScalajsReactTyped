package typingsJapgolly.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twitter-text", "parseTweet")
@js.native
object parseTweet extends js.Object {
  def apply(text: String): ParsedTweet = js.native
  def apply(text: String, options: ParseTweetOptions): ParsedTweet = js.native
}

