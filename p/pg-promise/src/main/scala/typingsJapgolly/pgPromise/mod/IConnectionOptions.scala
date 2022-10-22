package typingsJapgolly.pgPromise.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.pgPromise.typescriptPgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnectionOptions[C /* <: IClient */] extends StObject {
  
  var direct: js.UndefOr[Boolean] = js.undefined
  
  var onLost: js.UndefOr[js.Function2[/* err */ Any, /* e */ ILostContext[C], Unit]] = js.undefined
}
object IConnectionOptions {
  
  inline def apply[C /* <: IClient */](): IConnectionOptions[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectionOptions[C]]
  }
  
  extension [Self <: IConnectionOptions[?], C /* <: IClient */](x: Self & IConnectionOptions[C]) {
    
    inline def setDirect(value: Boolean): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
    
    inline def setDirectUndefined: Self = StObject.set(x, "direct", js.undefined)
    
    inline def setOnLost(value: (/* err */ Any, /* e */ ILostContext[C]) => Callback): Self = StObject.set(x, "onLost", js.Any.fromFunction2((t0: /* err */ Any, t1: /* e */ ILostContext[C]) => (value(t0, t1)).runNow()))
    
    inline def setOnLostUndefined: Self = StObject.set(x, "onLost", js.undefined)
  }
}
