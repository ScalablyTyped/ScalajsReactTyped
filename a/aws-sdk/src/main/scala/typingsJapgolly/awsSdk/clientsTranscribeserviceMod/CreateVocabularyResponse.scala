package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVocabularyResponse extends StObject {
  
  /**
    * If VocabularyState is FAILED, FailureReason contains information about why the vocabulary request failed. See also: Common Errors.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The language code you selected for your custom vocabulary.
    */
  var LanguageCode: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The date and time you created your custom vocabulary. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents 12:32 PM UTC-7 on May 4, 2022.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name you chose for your custom vocabulary.
    */
  var VocabularyName: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.VocabularyName] = js.undefined
  
  /**
    * The processing state of your custom vocabulary. If the state is READY, you can use the vocabulary in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.VocabularyState] = js.undefined
}
object CreateVocabularyResponse {
  
  inline def apply(): CreateVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVocabularyResponse]
  }
  
  extension [Self <: CreateVocabularyResponse](x: Self) {
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
    
    inline def setVocabularyState(value: VocabularyState): Self = StObject.set(x, "VocabularyState", value.asInstanceOf[js.Any])
    
    inline def setVocabularyStateUndefined: Self = StObject.set(x, "VocabularyState", js.undefined)
  }
}
