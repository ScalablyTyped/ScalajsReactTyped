package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSnapshotLine
  extends StObject
     with ITextSnapshotLine {
  
  /* private */ var _end: Any
  
  /* private */ var _lineBreak: Any
  
  /* private */ var _lineNumber: Any
  
  /* private */ var _snapshot: Any
  
  /* private */ var _start: Any
}
object TextSnapshotLine {
  
  inline def apply(
    _end: Any,
    _lineBreak: Any,
    _lineNumber: Any,
    _snapshot: Any,
    _start: Any,
    end: CallbackTo[SnapshotPoint],
    endIncludingLineBreak: CallbackTo[SnapshotPoint],
    endIncludingLineBreakPosition: CallbackTo[Double],
    endPosition: CallbackTo[Double],
    getText: CallbackTo[String],
    length: CallbackTo[Double],
    lineNumber: CallbackTo[Double],
    snapshot: CallbackTo[ITextSnapshot],
    start: CallbackTo[SnapshotPoint],
    startPosition: CallbackTo[Double]
  ): TextSnapshotLine = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _lineBreak = _lineBreak.asInstanceOf[js.Any], _lineNumber = _lineNumber.asInstanceOf[js.Any], _snapshot = _snapshot.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = end.toJsFn, endIncludingLineBreak = endIncludingLineBreak.toJsFn, endIncludingLineBreakPosition = endIncludingLineBreakPosition.toJsFn, endPosition = endPosition.toJsFn, getText = getText.toJsFn, length = length.toJsFn, lineNumber = lineNumber.toJsFn, snapshot = snapshot.toJsFn, start = start.toJsFn, startPosition = startPosition.toJsFn)
    __obj.asInstanceOf[TextSnapshotLine]
  }
  
  extension [Self <: TextSnapshotLine](x: Self) {
    
    inline def set_end(value: Any): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_lineBreak(value: Any): Self = StObject.set(x, "_lineBreak", value.asInstanceOf[js.Any])
    
    inline def set_lineNumber(value: Any): Self = StObject.set(x, "_lineNumber", value.asInstanceOf[js.Any])
    
    inline def set_snapshot(value: Any): Self = StObject.set(x, "_snapshot", value.asInstanceOf[js.Any])
    
    inline def set_start(value: Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
