package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentBlock extends Comment {
  var `type`: typingsJapgolly.babelTypes.babelTypesStrings.CommentBlock
}

object CommentBlock {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.CommentBlock,
    value: String
  ): CommentBlock = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentBlock]
  }
}

