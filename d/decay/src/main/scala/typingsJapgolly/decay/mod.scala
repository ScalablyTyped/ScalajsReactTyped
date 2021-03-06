package typingsJapgolly.decay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decay", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def hackerHot(): HackerNewsHotFunction = js.native
  def hackerHot(gravity: Double): HackerNewsHotFunction = js.native
  def redditHot(): RedditHotFunction = js.native
  def redditHot(decay: Double): RedditHotFunction = js.native
  def wilsonScore(): WilsonScoreFunction = js.native
  def wilsonScore(confidence: Double): WilsonScoreFunction = js.native
  type HackerNewsHotFunction = js.Function2[/* votes */ Double, /* date */ js.Date, Double]
  type RedditHotFunction = js.Function3[/* upvotes */ Double, /* downvotes */ Double, /* date */ js.Date, Double]
  type WilsonScoreFunction = js.Function2[/* upvotes */ Double, /* downvotes */ Double, Double]
}

