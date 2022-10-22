package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineAndCharacter extends StObject {
  
  /* private */ var _character: Any
  
  /* private */ var _line: Any
  
  def character(): Double
  
  def line(): Double
}
object LineAndCharacter {
  
  inline def apply(_character: Any, _line: Any, character: CallbackTo[Double], line: CallbackTo[Double]): LineAndCharacter = {
    val __obj = js.Dynamic.literal(_character = _character.asInstanceOf[js.Any], _line = _line.asInstanceOf[js.Any], character = character.toJsFn, line = line.toJsFn)
    __obj.asInstanceOf[LineAndCharacter]
  }
  
  extension [Self <: LineAndCharacter](x: Self) {
    
    inline def setCharacter(value: CallbackTo[Double]): Self = StObject.set(x, "character", value.toJsFn)
    
    inline def setLine(value: CallbackTo[Double]): Self = StObject.set(x, "line", value.toJsFn)
    
    inline def set_character(value: Any): Self = StObject.set(x, "_character", value.asInstanceOf[js.Any])
    
    inline def set_line(value: Any): Self = StObject.set(x, "_line", value.asInstanceOf[js.Any])
  }
}
