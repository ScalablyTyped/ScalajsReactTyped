package typingsJapgolly.highlightWordsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  var end: Double
  var highlight: Boolean
  var start: Double
}

object Chunk {
  @scala.inline
  def apply(end: Double, highlight: Boolean, start: Double): Chunk = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Chunk]
  }
}

