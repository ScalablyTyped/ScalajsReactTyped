package typingsJapgolly.awsSdk.clientsLexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictedIntent extends StObject {
  
  /**
    * The name of the intent that Amazon Lex suggests satisfies the user's intent.
    */
  var intentName: js.UndefOr[IntentName] = js.undefined
  
  /**
    * Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
    */
  var nluIntentConfidence: js.UndefOr[IntentConfidence] = js.undefined
  
  /**
    * The slot and slot values associated with the predicted intent.
    */
  var slots: js.UndefOr[StringMap] = js.undefined
}
object PredictedIntent {
  
  inline def apply(): PredictedIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictedIntent]
  }
  
  extension [Self <: PredictedIntent](x: Self) {
    
    inline def setIntentName(value: IntentName): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    inline def setNluIntentConfidence(value: IntentConfidence): Self = StObject.set(x, "nluIntentConfidence", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceUndefined: Self = StObject.set(x, "nluIntentConfidence", js.undefined)
    
    inline def setSlots(value: StringMap): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
