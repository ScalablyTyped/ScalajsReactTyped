package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridResponsiveAllowedColumnWidthPerType
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Minimal width in pixels bool columns can take before forcing vertical rendering
    *
    */
  var bool: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimal width in pixels date columns can take before forcing vertical rendering
    *
    */
  var date: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimal width in pixels number columns can take before forcing vertical rendering
    *
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimal width in pixels object columns can take before forcing vertical rendering
    *
    */
  var `object`: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimal width in pixels string columns can take before forcing vertical rendering
    *
    */
  var string: js.UndefOr[Double] = js.undefined
}
object IgGridResponsiveAllowedColumnWidthPerType {
  
  inline def apply(): IgGridResponsiveAllowedColumnWidthPerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResponsiveAllowedColumnWidthPerType]
  }
  
  extension [Self <: IgGridResponsiveAllowedColumnWidthPerType](x: Self) {
    
    inline def setBool(value: Double): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setObject(value: Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setString(value: Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
