package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextSnapshotLine extends StObject {
  
  def end(): SnapshotPoint
  
  def endIncludingLineBreak(): SnapshotPoint
  
  def endIncludingLineBreakPosition(): Double
  
  def endPosition(): Double
  
  def getText(): String
  
  def length(): Double
  
  def lineNumber(): Double
  
  def snapshot(): ITextSnapshot
  
  def start(): SnapshotPoint
  
  def startPosition(): Double
}
object ITextSnapshotLine {
  
  inline def apply(
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
  ): ITextSnapshotLine = {
    val __obj = js.Dynamic.literal(end = end.toJsFn, endIncludingLineBreak = endIncludingLineBreak.toJsFn, endIncludingLineBreakPosition = endIncludingLineBreakPosition.toJsFn, endPosition = endPosition.toJsFn, getText = getText.toJsFn, length = length.toJsFn, lineNumber = lineNumber.toJsFn, snapshot = snapshot.toJsFn, start = start.toJsFn, startPosition = startPosition.toJsFn)
    __obj.asInstanceOf[ITextSnapshotLine]
  }
  
  extension [Self <: ITextSnapshotLine](x: Self) {
    
    inline def setEnd(value: CallbackTo[SnapshotPoint]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setEndIncludingLineBreak(value: CallbackTo[SnapshotPoint]): Self = StObject.set(x, "endIncludingLineBreak", value.toJsFn)
    
    inline def setEndIncludingLineBreakPosition(value: CallbackTo[Double]): Self = StObject.set(x, "endIncludingLineBreakPosition", value.toJsFn)
    
    inline def setEndPosition(value: CallbackTo[Double]): Self = StObject.set(x, "endPosition", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
    
    inline def setLineNumber(value: CallbackTo[Double]): Self = StObject.set(x, "lineNumber", value.toJsFn)
    
    inline def setSnapshot(value: CallbackTo[ITextSnapshot]): Self = StObject.set(x, "snapshot", value.toJsFn)
    
    inline def setStart(value: CallbackTo[SnapshotPoint]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStartPosition(value: CallbackTo[Double]): Self = StObject.set(x, "startPosition", value.toJsFn)
  }
}
