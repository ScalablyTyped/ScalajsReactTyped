package typingsJapgolly.promiseAllsettled

import typingsJapgolly.promiseAllsettled.implementationMod.PromiseResultTuple
import typingsJapgolly.promiseAllsettled.implementationMod.PromiseTuple
import typingsJapgolly.promiseAllsettled.typesMod.PromiseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Promise[js.Array[Any]] = js.native
    def apply[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, Any]]] = js.native
    def apply[T /* <: Array[Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  }
}
