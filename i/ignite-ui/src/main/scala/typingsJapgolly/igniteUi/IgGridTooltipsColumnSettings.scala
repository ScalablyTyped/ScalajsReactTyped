package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridTooltipsColumnSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Enables / disables tooltips on the specified column. By default tooltips are displayed for each column. Note: This option is mandatory.
    *
    */
  var allowTooltips: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the maximum width (in pixels) of the tooltip when shown for the specified column. If unset the width of the column will be used instead.
    *
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
}
object IgGridTooltipsColumnSettings {
  
  inline def apply(): IgGridTooltipsColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridTooltipsColumnSettings]
  }
  
  extension [Self <: IgGridTooltipsColumnSettings](x: Self) {
    
    inline def setAllowTooltips(value: Boolean): Self = StObject.set(x, "allowTooltips", value.asInstanceOf[js.Any])
    
    inline def setAllowTooltipsUndefined: Self = StObject.set(x, "allowTooltips", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
  }
}
