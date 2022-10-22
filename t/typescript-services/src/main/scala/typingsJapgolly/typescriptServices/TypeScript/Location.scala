package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /* private */ var _fileName: Any
  
  /* private */ var _length: Any
  
  /* private */ var _lineMap: Any
  
  /* private */ var _start: Any
  
  def character(): Double
  
  def fileName(): String
  
  def length(): Double
  
  def line(): Double
  
  def lineMap(): LineMap
  
  def start(): Double
}
object Location {
  
  inline def apply(
    _fileName: Any,
    _length: Any,
    _lineMap: Any,
    _start: Any,
    character: CallbackTo[Double],
    fileName: CallbackTo[String],
    length: CallbackTo[Double],
    line: CallbackTo[Double],
    lineMap: CallbackTo[LineMap],
    start: CallbackTo[Double]
  ): Location = {
    val __obj = js.Dynamic.literal(_fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], character = character.toJsFn, fileName = fileName.toJsFn, length = length.toJsFn, line = line.toJsFn, lineMap = lineMap.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setCharacter(value: CallbackTo[Double]): Self = StObject.set(x, "character", value.toJsFn)
    
    inline def setFileName(value: CallbackTo[String]): Self = StObject.set(x, "fileName", value.toJsFn)
    
    inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
    
    inline def setLine(value: CallbackTo[Double]): Self = StObject.set(x, "line", value.toJsFn)
    
    inline def setLineMap(value: CallbackTo[LineMap]): Self = StObject.set(x, "lineMap", value.toJsFn)
    
    inline def setStart(value: CallbackTo[Double]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    inline def set_length(value: Any): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
    
    inline def set_lineMap(value: Any): Self = StObject.set(x, "_lineMap", value.asInstanceOf[js.Any])
    
    inline def set_start(value: Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
