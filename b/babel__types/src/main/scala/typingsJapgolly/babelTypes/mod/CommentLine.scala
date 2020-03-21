package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentLine
  extends BaseComment
     with Comment {
  @JSName("type")
  var type_CommentLine: typingsJapgolly.babelTypes.babelTypesStrings.CommentLine
}

object CommentLine {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.CommentLine,
    value: String
  ): CommentLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentLine]
  }
}

