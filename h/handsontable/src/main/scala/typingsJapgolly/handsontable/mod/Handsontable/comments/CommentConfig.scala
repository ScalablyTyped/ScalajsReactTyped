package typingsJapgolly.handsontable.mod.Handsontable.comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentConfig extends js.Object {
  var col: Double
  var comment: CommentObject
  var row: Double
}

object CommentConfig {
  @scala.inline
  def apply(col: Double, comment: CommentObject, row: Double): CommentConfig = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommentConfig]
  }
}

