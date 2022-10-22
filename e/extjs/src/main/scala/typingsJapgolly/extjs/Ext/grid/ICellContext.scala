package typingsJapgolly.extjs.Ext.grid

import typingsJapgolly.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellContext
  extends StObject
     with IBase {
  
  /** [Property] (Boolean) */
  var isCellContext: js.UndefOr[Boolean] = js.undefined
}
object ICellContext {
  
  inline def apply(): ICellContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellContext]
  }
  
  extension [Self <: ICellContext](x: Self) {
    
    inline def setIsCellContext(value: Boolean): Self = StObject.set(x, "isCellContext", value.asInstanceOf[js.Any])
    
    inline def setIsCellContextUndefined: Self = StObject.set(x, "isCellContext", js.undefined)
  }
}
