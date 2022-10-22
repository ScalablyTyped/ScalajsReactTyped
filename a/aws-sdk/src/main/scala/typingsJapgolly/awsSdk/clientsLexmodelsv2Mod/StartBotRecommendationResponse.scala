package typingsJapgolly.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBotRecommendationResponse extends StObject {
  
  /**
    * The unique identifier of the bot containing the bot recommendation.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the bot recommendation that you have created.
    */
  var botRecommendationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the bot recommendation. If the status is Failed, then the reasons for the failure are listed in the failureReasons field. 
    */
  var botRecommendationStatus: js.UndefOr[BotRecommendationStatus] = js.undefined
  
  /**
    * The version of the bot containing the bot recommendation.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot recommendation was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The object representing the passwords that were used to encrypt the data related to the bot recommendation results, as well as the KMS key ARN used to encrypt the associated metadata.
    */
  var encryptionSetting: js.UndefOr[EncryptionSetting] = js.undefined
  
  /**
    * The identifier of the language and locale of the bot recommendation to start. The string must match one of the supported locales. For more information, see Supported languages 
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The object representing the Amazon S3 bucket containing the transcript, as well as the associated metadata.
    */
  var transcriptSourceSetting: js.UndefOr[TranscriptSourceSetting] = js.undefined
}
object StartBotRecommendationResponse {
  
  inline def apply(): StartBotRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBotRecommendationResponse]
  }
  
  extension [Self <: StartBotRecommendationResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationIdUndefined: Self = StObject.set(x, "botRecommendationId", js.undefined)
    
    inline def setBotRecommendationStatus(value: BotRecommendationStatus): Self = StObject.set(x, "botRecommendationStatus", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationStatusUndefined: Self = StObject.set(x, "botRecommendationStatus", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setEncryptionSetting(value: EncryptionSetting): Self = StObject.set(x, "encryptionSetting", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSettingUndefined: Self = StObject.set(x, "encryptionSetting", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setTranscriptSourceSetting(value: TranscriptSourceSetting): Self = StObject.set(x, "transcriptSourceSetting", value.asInstanceOf[js.Any])
    
    inline def setTranscriptSourceSettingUndefined: Self = StObject.set(x, "transcriptSourceSetting", js.undefined)
  }
}
