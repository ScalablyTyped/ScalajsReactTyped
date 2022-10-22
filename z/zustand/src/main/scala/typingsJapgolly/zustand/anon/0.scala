package typingsJapgolly.zustand.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.zustand.reactMod.ExtractState
import typingsJapgolly.zustand.vanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[S /* <: StoreApi[Any] */] extends StObject {
  
  var getServerState: js.UndefOr[js.Function0[ExtractState[S]]] = js.undefined
}
object `0` {
  
  inline def apply[S /* <: StoreApi[Any] */](): `0`[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[S]]
  }
  
  extension [Self <: `0`[?], S /* <: StoreApi[Any] */](x: Self & `0`[S]) {
    
    inline def setGetServerState(value: CallbackTo[ExtractState[S]]): Self = StObject.set(x, "getServerState", value.toJsFn)
    
    inline def setGetServerStateUndefined: Self = StObject.set(x, "getServerState", js.undefined)
  }
}
