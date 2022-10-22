package typingsJapgolly.extjs.Ext.grid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBooleanColumn
  extends StObject
     with typingsJapgolly.extjs.Ext.grid.column.IColumn {
  
  /** [Config Option] (String) */
  var falseText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var trueText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var undefinedText: js.UndefOr[String] = js.undefined
}
object IBooleanColumn {
  
  inline def apply(): IBooleanColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBooleanColumn]
  }
  
  extension [Self <: IBooleanColumn](x: Self) {
    
    inline def setFalseText(value: String): Self = StObject.set(x, "falseText", value.asInstanceOf[js.Any])
    
    inline def setFalseTextUndefined: Self = StObject.set(x, "falseText", js.undefined)
    
    inline def setTrueText(value: String): Self = StObject.set(x, "trueText", value.asInstanceOf[js.Any])
    
    inline def setTrueTextUndefined: Self = StObject.set(x, "trueText", js.undefined)
    
    inline def setUndefinedText(value: String): Self = StObject.set(x, "undefinedText", value.asInstanceOf[js.Any])
    
    inline def setUndefinedTextUndefined: Self = StObject.set(x, "undefinedText", js.undefined)
  }
}
