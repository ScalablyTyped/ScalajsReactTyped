package typingsJapgolly.zustand.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.zustand.esmReactMod.ExtractState
import typingsJapgolly.zustand.esmVanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServerState[S /* <: StoreApi[Any] */] extends StObject {
  
  var getServerState: js.UndefOr[js.Function0[ExtractState[S]]] = js.undefined
}
object GetServerState {
  
  inline def apply[S /* <: StoreApi[Any] */](): GetServerState[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServerState[S]]
  }
  
  extension [Self <: GetServerState[?], S /* <: StoreApi[Any] */](x: Self & GetServerState[S]) {
    
    inline def setGetServerState(value: CallbackTo[ExtractState[S]]): Self = StObject.set(x, "getServerState", value.toJsFn)
    
    inline def setGetServerStateUndefined: Self = StObject.set(x, "getServerState", js.undefined)
  }
}
