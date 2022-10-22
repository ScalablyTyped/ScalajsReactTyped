package typingsJapgolly.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetBasicProperties extends StObject {
  
  /**
    * @description
    * when volatile functions should be recalculated
    */
  var autoRecalc: js.UndefOr[RecalculationInterval] = js.undefined
  
  /**
    * @description
    * default format for all cells in all worksheets of the document
    */
  var defaultFormat: js.UndefOr[CellFormat] = js.undefined
  
  /**
    * @description
    * how circular dependencies are resolved with iterative calculations
    */
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSetting] = js.undefined
  
  /**
    * @description
    * document locale/language
    * - ISO code format
    * - ex: "en", "en_US"
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * @description
    * theme applied to all worksheets of the document
    */
  var spreadsheetTheme: js.UndefOr[SpreadsheetTheme] = js.undefined
  
  /**
    * @description
    * document timezone
    * - CLDR format
    * - ex: "America/New_York", "GMT-07:00"
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  // #region BASIC PROPERTIES
  /* separates basic (editable) properties as they are used as inputs to various methods
    * non-basic properties should be added to the extending interface below
    */
  /**
    * @description
    * document title
    */
  var title: js.UndefOr[String] = js.undefined
}
object SpreadsheetBasicProperties {
  
  inline def apply(): SpreadsheetBasicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetBasicProperties]
  }
  
  extension [Self <: SpreadsheetBasicProperties](x: Self) {
    
    inline def setAutoRecalc(value: RecalculationInterval): Self = StObject.set(x, "autoRecalc", value.asInstanceOf[js.Any])
    
    inline def setAutoRecalcUndefined: Self = StObject.set(x, "autoRecalc", js.undefined)
    
    inline def setDefaultFormat(value: CellFormat): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormatUndefined: Self = StObject.set(x, "defaultFormat", js.undefined)
    
    inline def setIterativeCalculationSettings(value: IterativeCalculationSetting): Self = StObject.set(x, "iterativeCalculationSettings", value.asInstanceOf[js.Any])
    
    inline def setIterativeCalculationSettingsUndefined: Self = StObject.set(x, "iterativeCalculationSettings", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setSpreadsheetTheme(value: SpreadsheetTheme): Self = StObject.set(x, "spreadsheetTheme", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetThemeUndefined: Self = StObject.set(x, "spreadsheetTheme", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
