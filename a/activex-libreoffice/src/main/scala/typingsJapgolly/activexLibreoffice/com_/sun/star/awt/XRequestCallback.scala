package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an interface which can be used to call back an implementation */
trait XRequestCallback extends StObject {
  
  /**
    * adds a callback request to the implementation
    * @param aData any private data which will be provided to the callback implementation.
    * @param xCallback a reference to the callback which should be called by the implementation of this interface.
    */
  def addCallback(xCallback: XCallback, aData: Any): Unit
}
object XRequestCallback {
  
  inline def apply(addCallback: (XCallback, Any) => Callback): XRequestCallback = {
    val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction2((t0: XCallback, t1: Any) => (addCallback(t0, t1)).runNow()))
    __obj.asInstanceOf[XRequestCallback]
  }
  
  extension [Self <: XRequestCallback](x: Self) {
    
    inline def setAddCallback(value: (XCallback, Any) => Callback): Self = StObject.set(x, "addCallback", js.Any.fromFunction2((t0: XCallback, t1: Any) => (value(t0, t1)).runNow()))
  }
}
