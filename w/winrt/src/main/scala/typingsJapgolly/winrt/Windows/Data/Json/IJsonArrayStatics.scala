package typingsJapgolly.winrt.Windows.Data.Json

import typingsJapgolly.winrt.anon.ResultSucceeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonArrayStatics extends StObject {
  
  def parse(input: String): JsonArray
  
  def tryParse(input: String): ResultSucceeded
}
object IJsonArrayStatics {
  
  inline def apply(parse: String => JsonArray, tryParse: String => ResultSucceeded): IJsonArrayStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonArrayStatics]
  }
  
  extension [Self <: IJsonArrayStatics](x: Self) {
    
    inline def setParse(value: String => JsonArray): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setTryParse(value: String => ResultSucceeded): Self = StObject.set(x, "tryParse", js.Any.fromFunction1(value))
  }
}
