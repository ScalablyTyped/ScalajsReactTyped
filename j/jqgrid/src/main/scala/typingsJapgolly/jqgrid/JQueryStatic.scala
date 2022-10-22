package typingsJapgolly.jqgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var jqGrid: js.UndefOr[JQueryJqGridStatic] = js.undefined
}
object JQueryStatic {
  
  inline def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setJqGrid(value: JQueryJqGridStatic): Self = StObject.set(x, "jqGrid", value.asInstanceOf[js.Any])
    
    inline def setJqGridUndefined: Self = StObject.set(x, "jqGrid", js.undefined)
  }
}
