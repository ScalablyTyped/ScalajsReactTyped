package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextLine extends StObject {
  
  def end(): Double
  
  def endIncludingLineBreak(): Double
  
  def extent(): TextSpan
  
  def extentIncludingLineBreak(): TextSpan
  
  def lineNumber(): Double
  
  def start(): Double
}
object ITextLine {
  
  inline def apply(
    end: CallbackTo[Double],
    endIncludingLineBreak: CallbackTo[Double],
    extent: CallbackTo[TextSpan],
    extentIncludingLineBreak: CallbackTo[TextSpan],
    lineNumber: CallbackTo[Double],
    start: CallbackTo[Double]
  ): ITextLine = {
    val __obj = js.Dynamic.literal(end = end.toJsFn, endIncludingLineBreak = endIncludingLineBreak.toJsFn, extent = extent.toJsFn, extentIncludingLineBreak = extentIncludingLineBreak.toJsFn, lineNumber = lineNumber.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[ITextLine]
  }
  
  extension [Self <: ITextLine](x: Self) {
    
    inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setEndIncludingLineBreak(value: CallbackTo[Double]): Self = StObject.set(x, "endIncludingLineBreak", value.toJsFn)
    
    inline def setExtent(value: CallbackTo[TextSpan]): Self = StObject.set(x, "extent", value.toJsFn)
    
    inline def setExtentIncludingLineBreak(value: CallbackTo[TextSpan]): Self = StObject.set(x, "extentIncludingLineBreak", value.toJsFn)
    
    inline def setLineNumber(value: CallbackTo[Double]): Self = StObject.set(x, "lineNumber", value.toJsFn)
    
    inline def setStart(value: CallbackTo[Double]): Self = StObject.set(x, "start", value.toJsFn)
  }
}
