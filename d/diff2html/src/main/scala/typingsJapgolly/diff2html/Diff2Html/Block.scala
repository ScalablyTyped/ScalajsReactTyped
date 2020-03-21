package typingsJapgolly.diff2html.Diff2Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var header: String
  var lines: js.Array[Line]
  var newStartLine: Double
  var oldStartLine: Double
  var oldStartLine2: js.UndefOr[Double] = js.undefined
}

object Block {
  @scala.inline
  def apply(
    header: String,
    lines: js.Array[Line],
    newStartLine: Double,
    oldStartLine: Double,
    oldStartLine2: Int | Double = null
  ): Block = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], newStartLine = newStartLine.asInstanceOf[js.Any], oldStartLine = oldStartLine.asInstanceOf[js.Any])
    if (oldStartLine2 != null) __obj.updateDynamic("oldStartLine2")(oldStartLine2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

