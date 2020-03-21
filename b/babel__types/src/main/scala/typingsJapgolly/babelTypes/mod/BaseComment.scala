package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComment extends js.Object {
  var end: Double
  var loc: SourceLocation
  var start: Double
  var `type`: typingsJapgolly.babelTypes.babelTypesStrings.CommentBlock | typingsJapgolly.babelTypes.babelTypesStrings.CommentLine
  var value: String
}

object BaseComment {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.CommentBlock | typingsJapgolly.babelTypes.babelTypesStrings.CommentLine,
    value: String
  ): BaseComment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment]
  }
}

