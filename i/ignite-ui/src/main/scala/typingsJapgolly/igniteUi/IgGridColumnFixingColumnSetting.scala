package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridColumnFixingColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Specifies whether the column can be fixed or not. If allow fixing is false, then the fixing pin will not be rendered for the column.
    *
    */
  var allowFixing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the grid column by index. Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the grid column by key. Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the column is initially fixed or not. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#initial-state) out for more information.
    *
    */
  var isFixed: js.UndefOr[Boolean] = js.undefined
}
object IgGridColumnFixingColumnSetting {
  
  inline def apply(): IgGridColumnFixingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixingColumnSetting]
  }
  
  extension [Self <: IgGridColumnFixingColumnSetting](x: Self) {
    
    inline def setAllowFixing(value: Boolean): Self = StObject.set(x, "allowFixing", value.asInstanceOf[js.Any])
    
    inline def setAllowFixingUndefined: Self = StObject.set(x, "allowFixing", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
  }
}
