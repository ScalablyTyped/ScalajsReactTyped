package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsCaptionLanguageMapping extends StObject {
  
  /**
    * Caption channel.
    */
  var CaptionChannel: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * Specify the language for this captions channel, using the ISO 639-2 or ISO 639-3 three-letter language code
    */
  var CustomLanguageCode: js.UndefOr[stringMin3Max3PatternAZaZ3] = js.undefined
  
  /**
    * Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
    */
  var LanguageCode: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.LanguageCode] = js.undefined
  
  /**
    * Caption language description.
    */
  var LanguageDescription: js.UndefOr[string] = js.undefined
}
object HlsCaptionLanguageMapping {
  
  inline def apply(): HlsCaptionLanguageMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsCaptionLanguageMapping]
  }
  
  extension [Self <: HlsCaptionLanguageMapping](x: Self) {
    
    inline def setCaptionChannel(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "CaptionChannel", value.asInstanceOf[js.Any])
    
    inline def setCaptionChannelUndefined: Self = StObject.set(x, "CaptionChannel", js.undefined)
    
    inline def setCustomLanguageCode(value: stringMin3Max3PatternAZaZ3): Self = StObject.set(x, "CustomLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCustomLanguageCodeUndefined: Self = StObject.set(x, "CustomLanguageCode", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLanguageDescription(value: string): Self = StObject.set(x, "LanguageDescription", value.asInstanceOf[js.Any])
    
    inline def setLanguageDescriptionUndefined: Self = StObject.set(x, "LanguageDescription", js.undefined)
  }
}
