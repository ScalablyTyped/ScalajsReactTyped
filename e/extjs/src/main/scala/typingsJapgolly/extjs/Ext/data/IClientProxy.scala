package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientProxy
  extends StObject
     with typingsJapgolly.extjs.Ext.data.proxy.IProxy {
  
  /** [Method] Abstract function that must be implemented by each ClientProxy subclass  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IClientProxy {
  
  inline def apply(): IClientProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientProxy]
  }
  
  extension [Self <: IClientProxy](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
  }
}
