package typingsJapgolly.sinonStubPromise

import typingsJapgolly.sinon.mod.SinonStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(sinon: SinonStatic): Unit = ^.asInstanceOf[js.Dynamic].apply(sinon.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("sinon-stub-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object sinonAugmentingMod {
    
    @js.native
    trait SinonStub extends StObject {
      
      def rejects(): SinonStub = js.native
      def rejects(value: Any): SinonStub = js.native
      
      def resolves(): SinonStub = js.native
      def resolves(value: Any): SinonStub = js.native
      
      def returnsPromise(): SinonStub = js.native
      
      var thenable: SinonThenable = js.native
    }
    
    @js.native
    trait SinonThenable extends StObject {
      
      def `catch`(onReject: js.Function1[/* rejectValue */ js.UndefOr[Any], Unit]): SinonThenable = js.native
      
      def `finally`(callback: js.Function0[Unit]): SinonThenable = js.native
      
      var rejectValue: Any = js.native
      
      var rejected: Boolean = js.native
      
      var resolveValue: Any = js.native
      
      var resolved: Boolean = js.native
      
      def `then`(onFulfill: js.Function1[/* resolveValue */ js.UndefOr[Any], Unit]): SinonThenable = js.native
      def `then`(
        onFulfill: js.Function1[/* resolveValue */ js.UndefOr[Any], Unit],
        onReject: js.Function1[/* rejectValue */ js.UndefOr[Any], Unit]
      ): SinonThenable = js.native
    }
  }
}
