package typingsJapgolly.hyperformula.typingsParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsingError_ extends StObject {
  
  var message: String
  
  var `type`: ParsingErrorType
}
object ParsingError_ {
  
  inline def apply(message: String, `type`: ParsingErrorType): ParsingError_ = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingError_]
  }
  
  extension [Self <: ParsingError_](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParsingErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
