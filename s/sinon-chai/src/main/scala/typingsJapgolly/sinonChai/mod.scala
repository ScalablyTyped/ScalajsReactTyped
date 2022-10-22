package typingsJapgolly.sinonChai

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.sinon.mod.SinonSpy
import typingsJapgolly.sinon.mod.SinonSpyCall
import typingsJapgolly.sinon.mod.SinonStub
import typingsJapgolly.std.ErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sinon-chai", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        /**
          * @param count The number of recorded calls.
          */
        def callCount(count: Double): Assertion = js.native
        
        /**
          * true if the spy was called at least once.
          */
        var called: Assertion = js.native
        
        /**
          * Returns true if the spy was called after anotherSpy.
          */
        def calledAfter(anotherSpy: SinonSpy[js.Array[Any], Any]): Assertion = js.native
        def calledAfter(anotherSpy: SinonSpyCall[js.Array[Any], Any]): Assertion = js.native
        def calledAfter(anotherSpy: SinonStub[js.Array[Any], Any]): Assertion = js.native
        
        /**
          * Returns true if the spy was called before anotherSpy.
          */
        def calledBefore(anotherSpy: SinonSpy[js.Array[Any], Any]): Assertion = js.native
        def calledBefore(anotherSpy: SinonSpyCall[js.Array[Any], Any]): Assertion = js.native
        def calledBefore(anotherSpy: SinonStub[js.Array[Any], Any]): Assertion = js.native
        
        /**
          * Returns true if spy was called after anotherSpy, and no spy calls occurred
          * between anotherSpy and spy.
          */
        def calledImmediatelyAfter(anotherSpy: SinonSpy[js.Array[Any], Any]): Assertion = js.native
        def calledImmediatelyAfter(anotherSpy: SinonStub[js.Array[Any], Any]): Assertion = js.native
        
        /**
          * Returns true if spy was called before anotherSpy, and no spy calls occurred
          * between spy and anotherSpy.
          */
        def calledImmediatelyBefore(anotherSpy: SinonSpy[js.Array[Any], Any]): Assertion = js.native
        def calledImmediatelyBefore(anotherSpy: SinonStub[js.Array[Any], Any]): Assertion = js.native
        
        /**
          * Returns true if context was this for this call.
          */
        def calledOn(context: Any): Assertion = js.native
        
        /**
          * true if the spy was called exactly once.
          */
        var calledOnce: Assertion = js.native
        
        /**
          * Returns true if spy was called at exactly once with the provided arguments.
          */
        def calledOnceWith(args: Any*): Assertion = js.native
        
        /**
          * Returns true if spy was called exactly once with the provided arguments and no others.
          */
        def calledOnceWithExactly(args: Any*): Assertion = js.native
        
        /**
          * true if the spy was called exactly thrice.
          */
        var calledThrice: Assertion = js.native
        
        /**
          * true if the spy was called exactly twice.
          */
        var calledTwice: Assertion = js.native
        
        /**
          * Returns true if call received provided arguments (and possibly others).
          */
        def calledWith(args: Any*): Assertion = js.native
        
        /**
          * Returns true if call received provided arguments and no others.
          */
        def calledWithExactly(args: Any*): Assertion = js.native
        
        /**
          * Returns true if call received matching arguments (and possibly others).
          * This behaves the same as spyCall.calledWith(sinon.match(arg1), sinon.match(arg2), ...).
          */
        def calledWithMatch(args: Any*): Assertion = js.native
        
        /**
          * Returns true if spy/stub was called with the new operator. Beware that
          * this is inferred based on the value of the this object and the spy
          * function's prototype, so it may give false positives if you actively
          * return the right kind of object.
          */
        var calledWithNew: Assertion = js.native
        
        /**
          * Returns true if spy returned the provided value at least once. Uses
          * deep comparison for objects and arrays. Use spy.returned(sinon.match.same(obj))
          * for strict comparison (see matchers).
          */
        def returned(obj: Any): Assertion = js.native
        
        /**
          * Returns true if spy threw the provided exception object at least once.
          */
        def thrown(): Assertion = js.native
        def thrown(obj: String): Assertion = js.native
        def thrown(obj: js.Error): Assertion = js.native
        def thrown(obj: ErrorConstructor): Assertion = js.native
      }
      
      trait LanguageChains extends StObject {
        
        var always: Assertion
      }
      object LanguageChains {
        
        inline def apply(always: Assertion): LanguageChains = {
          val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any])
          __obj.asInstanceOf[LanguageChains]
        }
        
        extension [Self <: LanguageChains](x: Self) {
          
          inline def setAlways(value: Assertion): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
