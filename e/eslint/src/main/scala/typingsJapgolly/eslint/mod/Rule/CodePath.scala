package typingsJapgolly.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePath extends js.Object {
  var childCodePaths: js.Array[CodePath]
  var currentSegments: js.Array[CodePathSegment]
  var finalSegments: js.Array[CodePathSegment]
  var id: String
  var initialSegment: CodePathSegment
  var returnedSegments: js.Array[CodePathSegment]
  var thrownSegments: js.Array[CodePathSegment]
  var upper: CodePath | Null
}

object CodePath {
  @scala.inline
  def apply(
    childCodePaths: js.Array[CodePath],
    currentSegments: js.Array[CodePathSegment],
    finalSegments: js.Array[CodePathSegment],
    id: String,
    initialSegment: CodePathSegment,
    returnedSegments: js.Array[CodePathSegment],
    thrownSegments: js.Array[CodePathSegment],
    upper: CodePath = null
  ): CodePath = {
    val __obj = js.Dynamic.literal(childCodePaths = childCodePaths.asInstanceOf[js.Any], currentSegments = currentSegments.asInstanceOf[js.Any], finalSegments = finalSegments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialSegment = initialSegment.asInstanceOf[js.Any], returnedSegments = returnedSegments.asInstanceOf[js.Any], thrownSegments = thrownSegments.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePath]
  }
}

