package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionDescription extends StObject {
  
  /**
    * Indicates whether the caption track implements accessibility features such as written descriptions of spoken dialog, music, and sounds.
    */
  var Accessibility: js.UndefOr[AccessibilityType] = js.undefined
  
  /**
    * Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
    */
  var CaptionSelectorName: string
  
  /**
    * Additional settings for captions destination that depend on the destination type.
    */
  var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined
  
  /**
    * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
    */
  var LanguageCode: js.UndefOr[string] = js.undefined
  
  /**
    * Human readable information to indicate captions available for players (eg. English, or Spanish).
    */
  var LanguageDescription: js.UndefOr[string] = js.undefined
  
  /**
    * Name of the caption description.  Used to associate a caption description with an output.  Names must be unique within an event.
    */
  var Name: string
}
object CaptionDescription {
  
  inline def apply(CaptionSelectorName: string, Name: string): CaptionDescription = {
    val __obj = js.Dynamic.literal(CaptionSelectorName = CaptionSelectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionDescription]
  }
  
  extension [Self <: CaptionDescription](x: Self) {
    
    inline def setAccessibility(value: AccessibilityType): Self = StObject.set(x, "Accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "Accessibility", js.undefined)
    
    inline def setCaptionSelectorName(value: string): Self = StObject.set(x, "CaptionSelectorName", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettings(value: CaptionDestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    inline def setLanguageCode(value: string): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLanguageDescription(value: string): Self = StObject.set(x, "LanguageDescription", value.asInstanceOf[js.Any])
    
    inline def setLanguageDescriptionUndefined: Self = StObject.set(x, "LanguageDescription", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
