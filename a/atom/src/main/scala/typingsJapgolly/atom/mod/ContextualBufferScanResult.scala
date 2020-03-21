package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualBufferScanResult extends BufferScanResult {
  var leadingContextLines: js.Array[String]
  var trailingContextLines: js.Array[String]
}

object ContextualBufferScanResult {
  @scala.inline
  def apply(
    buffer: TextBuffer,
    leadingContextLines: js.Array[String],
    lineText: String,
    `match`: RegExpExecArray,
    matchText: String,
    range: Range,
    replace: String => Callback,
    stop: Callback,
    stopped: Boolean,
    trailingContextLines: js.Array[String]
  ): ContextualBufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: java.lang.String) => replace(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[ContextualBufferScanResult]
  }
}

