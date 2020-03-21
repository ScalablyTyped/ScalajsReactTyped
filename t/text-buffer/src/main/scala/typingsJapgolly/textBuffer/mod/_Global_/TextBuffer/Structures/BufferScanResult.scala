package typingsJapgolly.textBuffer.mod._Global_.TextBuffer.Structures

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.RegExpExecArray
import typingsJapgolly.textBuffer.mod._Global_.TextBuffer.Range
import typingsJapgolly.textBuffer.mod._Global_.TextBuffer.TextBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferScanResult extends js.Object {
  var buffer: TextBuffer
  var lineText: String
  var `match`: RegExpExecArray
  var matchText: String
  var range: Range
  var stopped: Boolean
  def replace(replacementText: String): Unit
  def stop(): Unit
}

object BufferScanResult {
  @scala.inline
  def apply(
    buffer: TextBuffer,
    lineText: String,
    `match`: RegExpExecArray,
    matchText: String,
    range: Range,
    replace: String => Callback,
    stop: Callback,
    stopped: Boolean
  ): BufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: java.lang.String) => replace(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[BufferScanResult]
  }
}

