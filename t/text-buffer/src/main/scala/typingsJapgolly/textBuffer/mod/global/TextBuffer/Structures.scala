package typingsJapgolly.textBuffer.mod.global.TextBuffer

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The structures that are passed to the user by Atom following specific API calls. */
object Structures {
  
  trait BufferScanResult extends StObject {
    
    var buffer: typingsJapgolly.textBuffer.mod.global.TextBuffer.TextBuffer
    
    var lineText: String
    
    var `match`: RegExpExecArray
    
    var matchText: String
    
    var range: Range
    
    def replace(replacementText: String): Unit
    
    def stop(): Unit
    
    var stopped: Boolean
  }
  object BufferScanResult {
    
    inline def apply(
      buffer: typingsJapgolly.textBuffer.mod.global.TextBuffer.TextBuffer,
      lineText: String,
      `match`: RegExpExecArray,
      matchText: String,
      range: Range,
      replace: String => Callback,
      stop: Callback,
      stopped: Boolean
    ): BufferScanResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1((t0: String) => replace(t0).runNow()), stop = stop.toJsFn, stopped = stopped.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferScanResult]
    }
    
    extension [Self <: BufferScanResult](x: Self) {
      
      inline def setBuffer(value: typingsJapgolly.textBuffer.mod.global.TextBuffer.TextBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchText(value: String): Self = StObject.set(x, "matchText", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: String => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextualBufferScanResult
    extends StObject
       with BufferScanResult {
    
    var leadingContextLines: js.Array[String]
    
    var trailingContextLines: js.Array[String]
  }
  object ContextualBufferScanResult {
    
    inline def apply(
      buffer: typingsJapgolly.textBuffer.mod.global.TextBuffer.TextBuffer,
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
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1((t0: String) => replace(t0).runNow()), stop = stop.toJsFn, stopped = stopped.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextualBufferScanResult]
    }
    
    extension [Self <: ContextualBufferScanResult](x: Self) {
      
      inline def setLeadingContextLines(value: js.Array[String]): Self = StObject.set(x, "leadingContextLines", value.asInstanceOf[js.Any])
      
      inline def setLeadingContextLinesVarargs(value: String*): Self = StObject.set(x, "leadingContextLines", js.Array(value*))
      
      inline def setTrailingContextLines(value: js.Array[String]): Self = StObject.set(x, "trailingContextLines", value.asInstanceOf[js.Any])
      
      inline def setTrailingContextLinesVarargs(value: String*): Self = StObject.set(x, "trailingContextLines", js.Array(value*))
    }
  }
  
  trait TextChange extends StObject {
    
    var newExtent: Point
    
    var newRange: Range
    
    var newText: String
    
    var oldExtent: Point
    
    var oldRange: Range
    
    var oldText: String
    
    var start: Point
  }
  object TextChange {
    
    inline def apply(
      newExtent: Point,
      newRange: Range,
      newText: String,
      oldExtent: Point,
      oldRange: Range,
      oldText: String,
      start: Point
    ): TextChange = {
      val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextChange]
    }
    
    extension [Self <: TextChange](x: Self) {
      
      inline def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
      
      inline def setNewRange(value: Range): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
      
      inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      inline def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
      
      inline def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
      
      inline def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
