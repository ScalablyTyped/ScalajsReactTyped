package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIColorPalette extends StObject {
  
  /**
    * This color is that applies to selected states and buttons.
    */
  var Accent: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the accent color.
    */
  var AccentForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color that applies to error messages.
    */
  var Danger: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the error color.
    */
  var DangerForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color that applies to the names of fields that are identified as dimensions.
    */
  var Dimension: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the dimension color.
    */
  var DimensionForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color that applies to the names of fields that are identified as measures.
    */
  var Measure: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the measure color.
    */
  var MeasureForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The background color that applies to visuals and other high emphasis UI.
    */
  var PrimaryBackground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color of text and other foreground elements that appear over the primary background regions, such as grid lines, borders, table banding, icons, and so on.
    */
  var PrimaryForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The background color that applies to the sheet background and sheet controls.
    */
  var SecondaryBackground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any sheet title, sheet control text, or UI that appears over the secondary background.
    */
  var SecondaryForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color that applies to success messages, for example the check mark for a successful download.
    */
  var Success: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the success color.
    */
  var SuccessForeground: js.UndefOr[HexColor] = js.undefined
  
  /**
    * This color that applies to warning and informational messages.
    */
  var Warning: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The foreground color that applies to any text or other elements that appear over the warning color.
    */
  var WarningForeground: js.UndefOr[HexColor] = js.undefined
}
object UIColorPalette {
  
  inline def apply(): UIColorPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIColorPalette]
  }
  
  extension [Self <: UIColorPalette](x: Self) {
    
    inline def setAccent(value: HexColor): Self = StObject.set(x, "Accent", value.asInstanceOf[js.Any])
    
    inline def setAccentForeground(value: HexColor): Self = StObject.set(x, "AccentForeground", value.asInstanceOf[js.Any])
    
    inline def setAccentForegroundUndefined: Self = StObject.set(x, "AccentForeground", js.undefined)
    
    inline def setAccentUndefined: Self = StObject.set(x, "Accent", js.undefined)
    
    inline def setDanger(value: HexColor): Self = StObject.set(x, "Danger", value.asInstanceOf[js.Any])
    
    inline def setDangerForeground(value: HexColor): Self = StObject.set(x, "DangerForeground", value.asInstanceOf[js.Any])
    
    inline def setDangerForegroundUndefined: Self = StObject.set(x, "DangerForeground", js.undefined)
    
    inline def setDangerUndefined: Self = StObject.set(x, "Danger", js.undefined)
    
    inline def setDimension(value: HexColor): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionForeground(value: HexColor): Self = StObject.set(x, "DimensionForeground", value.asInstanceOf[js.Any])
    
    inline def setDimensionForegroundUndefined: Self = StObject.set(x, "DimensionForeground", js.undefined)
    
    inline def setDimensionUndefined: Self = StObject.set(x, "Dimension", js.undefined)
    
    inline def setMeasure(value: HexColor): Self = StObject.set(x, "Measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureForeground(value: HexColor): Self = StObject.set(x, "MeasureForeground", value.asInstanceOf[js.Any])
    
    inline def setMeasureForegroundUndefined: Self = StObject.set(x, "MeasureForeground", js.undefined)
    
    inline def setMeasureUndefined: Self = StObject.set(x, "Measure", js.undefined)
    
    inline def setPrimaryBackground(value: HexColor): Self = StObject.set(x, "PrimaryBackground", value.asInstanceOf[js.Any])
    
    inline def setPrimaryBackgroundUndefined: Self = StObject.set(x, "PrimaryBackground", js.undefined)
    
    inline def setPrimaryForeground(value: HexColor): Self = StObject.set(x, "PrimaryForeground", value.asInstanceOf[js.Any])
    
    inline def setPrimaryForegroundUndefined: Self = StObject.set(x, "PrimaryForeground", js.undefined)
    
    inline def setSecondaryBackground(value: HexColor): Self = StObject.set(x, "SecondaryBackground", value.asInstanceOf[js.Any])
    
    inline def setSecondaryBackgroundUndefined: Self = StObject.set(x, "SecondaryBackground", js.undefined)
    
    inline def setSecondaryForeground(value: HexColor): Self = StObject.set(x, "SecondaryForeground", value.asInstanceOf[js.Any])
    
    inline def setSecondaryForegroundUndefined: Self = StObject.set(x, "SecondaryForeground", js.undefined)
    
    inline def setSuccess(value: HexColor): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setSuccessForeground(value: HexColor): Self = StObject.set(x, "SuccessForeground", value.asInstanceOf[js.Any])
    
    inline def setSuccessForegroundUndefined: Self = StObject.set(x, "SuccessForeground", js.undefined)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
    
    inline def setWarning(value: HexColor): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    inline def setWarningForeground(value: HexColor): Self = StObject.set(x, "WarningForeground", value.asInstanceOf[js.Any])
    
    inline def setWarningForegroundUndefined: Self = StObject.set(x, "WarningForeground", js.undefined)
    
    inline def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
