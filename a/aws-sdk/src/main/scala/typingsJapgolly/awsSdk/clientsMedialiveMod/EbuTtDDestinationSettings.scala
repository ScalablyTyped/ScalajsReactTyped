package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbuTtDDestinationSettings extends StObject {
  
  /**
    * Complete this field if you want to include the name of the copyright holder in the copyright tag in the captions metadata.
    */
  var CopyrightHolder: js.UndefOr[stringMax1000] = js.undefined
  
  /**
    * Specifies how to handle the gap between the lines (in multi-line captions).
  - enabled: Fill with the captions background color (as specified in the input captions).
  - disabled: Leave the gap unfilled.
    */
  var FillLineGap: js.UndefOr[EbuTtDFillLineGapControl] = js.undefined
  
  /**
    * Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl is set to include. If you leave this field empty, the font family is set to "monospaced". (If styleControl is set to exclude, the font family is always set to "monospaced".)
  You specify only the font family. All other style information (color, bold, position and so on) is copied from the input captions. The size is always set to 100% to allow the downstream player to choose the size.
  - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream player choose the font).
  - Leave blank to set the family to “monospace”.
    */
  var FontFamily: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies the style information (font color, font position, and so on) to include in the font data that is attached to the EBU-TT captions.
  - include: Take the style information (font color, font position, and so on) from the source captions and include that information in the font data attached to the EBU-TT captions. This option is valid only if the source captions are Embedded or Teletext.
  - exclude: In the font data attached to the EBU-TT captions, set the font family to "monospaced". Do not include any other style information.
    */
  var StyleControl: js.UndefOr[EbuTtDDestinationStyleControl] = js.undefined
}
object EbuTtDDestinationSettings {
  
  inline def apply(): EbuTtDDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbuTtDDestinationSettings]
  }
  
  extension [Self <: EbuTtDDestinationSettings](x: Self) {
    
    inline def setCopyrightHolder(value: stringMax1000): Self = StObject.set(x, "CopyrightHolder", value.asInstanceOf[js.Any])
    
    inline def setCopyrightHolderUndefined: Self = StObject.set(x, "CopyrightHolder", js.undefined)
    
    inline def setFillLineGap(value: EbuTtDFillLineGapControl): Self = StObject.set(x, "FillLineGap", value.asInstanceOf[js.Any])
    
    inline def setFillLineGapUndefined: Self = StObject.set(x, "FillLineGap", js.undefined)
    
    inline def setFontFamily(value: string): Self = StObject.set(x, "FontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "FontFamily", js.undefined)
    
    inline def setStyleControl(value: EbuTtDDestinationStyleControl): Self = StObject.set(x, "StyleControl", value.asInstanceOf[js.Any])
    
    inline def setStyleControlUndefined: Self = StObject.set(x, "StyleControl", js.undefined)
  }
}
