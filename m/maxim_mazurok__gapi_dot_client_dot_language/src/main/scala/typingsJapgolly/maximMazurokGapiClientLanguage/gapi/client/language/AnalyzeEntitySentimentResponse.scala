package typingsJapgolly.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeEntitySentimentResponse extends StObject {
  
  /** The recognized entities in the input document with associated sentiments. */
  var entities: js.UndefOr[js.Array[Entity]] = js.undefined
  
  /**
    * The language of the text, which will be the same as the language specified in the request or, if not specified, the automatically-detected language. See Document.language field for
    * more details.
    */
  var language: js.UndefOr[String] = js.undefined
}
object AnalyzeEntitySentimentResponse {
  
  inline def apply(): AnalyzeEntitySentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeEntitySentimentResponse]
  }
  
  extension [Self <: AnalyzeEntitySentimentResponse](x: Self) {
    
    inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
