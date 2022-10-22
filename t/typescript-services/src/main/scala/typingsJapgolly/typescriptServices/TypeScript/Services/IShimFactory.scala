package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShimFactory extends StObject {
  
  def registerShim(shim: IShim): Unit
  
  def unregisterShim(shim: IShim): Unit
}
object IShimFactory {
  
  inline def apply(registerShim: IShim => Callback, unregisterShim: IShim => Callback): IShimFactory = {
    val __obj = js.Dynamic.literal(registerShim = js.Any.fromFunction1((t0: IShim) => registerShim(t0).runNow()), unregisterShim = js.Any.fromFunction1((t0: IShim) => unregisterShim(t0).runNow()))
    __obj.asInstanceOf[IShimFactory]
  }
  
  extension [Self <: IShimFactory](x: Self) {
    
    inline def setRegisterShim(value: IShim => Callback): Self = StObject.set(x, "registerShim", js.Any.fromFunction1((t0: IShim) => value(t0).runNow()))
    
    inline def setUnregisterShim(value: IShim => Callback): Self = StObject.set(x, "unregisterShim", js.Any.fromFunction1((t0: IShim) => value(t0).runNow()))
  }
}
