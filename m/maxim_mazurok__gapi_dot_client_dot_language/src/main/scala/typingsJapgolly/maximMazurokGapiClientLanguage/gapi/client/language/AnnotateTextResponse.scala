package typingsJapgolly.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotateTextResponse extends StObject {
  
  /** Categories identified in the input document. */
  var categories: js.UndefOr[js.Array[ClassificationCategory]] = js.undefined
  
  /** The overall sentiment for the document. Populated if the user enables AnnotateTextRequest.Features.extract_document_sentiment. */
  var documentSentiment: js.UndefOr[Sentiment] = js.undefined
  
  /** Entities, along with their semantic information, in the input document. Populated if the user enables AnnotateTextRequest.Features.extract_entities. */
  var entities: js.UndefOr[js.Array[Entity]] = js.undefined
  
  /**
    * The language of the text, which will be the same as the language specified in the request or, if not specified, the automatically-detected language. See Document.language field for
    * more details.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /** Sentences in the input document. Populated if the user enables AnnotateTextRequest.Features.extract_syntax. */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.undefined
  
  /** Tokens, along with their syntactic information, in the input document. Populated if the user enables AnnotateTextRequest.Features.extract_syntax. */
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
}
object AnnotateTextResponse {
  
  inline def apply(): AnnotateTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateTextResponse]
  }
  
  extension [Self <: AnnotateTextResponse](x: Self) {
    
    inline def setCategories(value: js.Array[ClassificationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: ClassificationCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDocumentSentiment(value: Sentiment): Self = StObject.set(x, "documentSentiment", value.asInstanceOf[js.Any])
    
    inline def setDocumentSentimentUndefined: Self = StObject.set(x, "documentSentiment", js.undefined)
    
    inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSentences(value: js.Array[Sentence]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    inline def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    inline def setSentencesVarargs(value: Sentence*): Self = StObject.set(x, "sentences", js.Array(value*))
    
    inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
