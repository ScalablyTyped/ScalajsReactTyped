package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterError extends StObject {
  
  // constructor(summary: string, detail: string);
  def getMessage(): ^
}
object ConverterError {
  
  inline def apply(getMessage: CallbackTo[^]): ConverterError = {
    val __obj = js.Dynamic.literal(getMessage = getMessage.toJsFn)
    __obj.asInstanceOf[ConverterError]
  }
  
  extension [Self <: ConverterError](x: Self) {
    
    inline def setGetMessage(value: CallbackTo[^]): Self = StObject.set(x, "getMessage", value.toJsFn)
  }
}
