package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiCoreLibraryMod.CSSSize
import typingsJapgolly.openui5.sapUiTableColumnMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  /**
    * resized column.
    */
  var column: js.UndefOr[default] = js.undefined
  
  /**
    * new width of the table column as CSS Size definition.
    */
  var width: js.UndefOr[CSSSize] = js.undefined
}
object Width {
  
  inline def apply(): Width = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Width]
  }
  
  extension [Self <: Width](x: Self) {
    
    inline def setColumn(value: default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setWidth(value: CSSSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
