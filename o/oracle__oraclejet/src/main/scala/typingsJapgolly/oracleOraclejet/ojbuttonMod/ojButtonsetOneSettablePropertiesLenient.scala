package typingsJapgolly.oracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.full
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.half
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icons
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.oneTabstop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetOneSettableProperties> */
trait ojButtonsetOneSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var chroming: js.UndefOr[full | half | outlined] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var display: js.UndefOr[all | icons] = js.undefined
  
  var focusManagement: js.UndefOr[oneTabstop | none] = js.undefined
  
  var translations: js.UndefOr[js.Object | Null] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object ojButtonsetOneSettablePropertiesLenient {
  
  inline def apply(): ojButtonsetOneSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojButtonsetOneSettablePropertiesLenient]
  }
  
  extension [Self <: ojButtonsetOneSettablePropertiesLenient](x: Self) {
    
    inline def setChroming(value: full | half | outlined): Self = StObject.set(x, "chroming", value.asInstanceOf[js.Any])
    
    inline def setChromingUndefined: Self = StObject.set(x, "chroming", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplay(value: all | icons): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFocusManagement(value: oneTabstop | none): Self = StObject.set(x, "focusManagement", value.asInstanceOf[js.Any])
    
    inline def setFocusManagementUndefined: Self = StObject.set(x, "focusManagement", js.undefined)
    
    inline def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsNull: Self = StObject.set(x, "translations", null)
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
