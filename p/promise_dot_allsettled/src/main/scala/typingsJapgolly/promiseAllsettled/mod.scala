package typingsJapgolly.promiseAllsettled

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.promiseAllsettled.anon.FnCall
import typingsJapgolly.promiseAllsettled.implementationMod.PromiseTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("promise.allsettled", JSImport.Namespace)
  @js.native
  val ^ : ExportedImplementationType = js.native
  
  @js.native
  trait ExportedImplementationType extends StObject {
    
    def apply(): js.Promise[js.Array[Any]] = js.native
    def apply[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[typingsJapgolly.promiseAllsettled.typesMod.PromiseResult[T, Any]]] = js.native
    def apply[T /* <: Array[Any] */](iterable: PromiseTuple[T]): js.Promise[typingsJapgolly.promiseAllsettled.implementationMod.PromiseResultTuple[T]] = js.native
    
    def getPolyfill(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
    @JSName("getPolyfill")
    var getPolyfill_Original: js.Function0[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
      ] = js.native
    
    def implementation(): js.Promise[js.Array[Any]] = js.native
    def implementation[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[typingsJapgolly.promiseAllsettled.typesMod.PromiseResult[T, Any]]] = js.native
    def implementation[T /* <: Array[Any] */](iterable: PromiseTuple[T]): js.Promise[typingsJapgolly.promiseAllsettled.implementationMod.PromiseResultTuple[T]] = js.native
    @JSName("implementation")
    var implementation_Original: FnCall = js.native
    
    def shim(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
    @JSName("shim")
    var shim_Original: js.Function0[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
      ] = js.native
  }
  
  type PromiseRejection[E] = typingsJapgolly.promiseAllsettled.typesMod.PromiseRejection[E]
  
  type PromiseResolution[T] = typingsJapgolly.promiseAllsettled.typesMod.PromiseResolution[T]
  
  type PromiseResult[T, E] = typingsJapgolly.promiseAllsettled.typesMod.PromiseResult[T, E]
  
  type PromiseResultTuple[T /* <: Array[Any] */] = typingsJapgolly.promiseAllsettled.typesMod.PromiseResultTuple[T]
  
  type _To = ExportedImplementationType
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ExportedImplementationType = ^
}
