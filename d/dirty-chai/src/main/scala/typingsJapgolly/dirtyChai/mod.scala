package typingsJapgolly.dirtyChai

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chaiAsPromised.Chai.Eventually
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dirty-chai", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        def apply(): Assertion = js.native
        def apply(message: String): Assertion = js.native
        
        def ensure(): Assertion = js.native
        def ensure(message: String): Assertion = js.native
        @JSName("ensure")
        var ensure_Original: Assertion = js.native
      }
      
      trait LanguageChains extends StObject {
        
        def always(): Assertion
        def always(message: String): Assertion
        @JSName("always")
        var always_Original: Assertion
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
      
      @js.native
      trait PromisedAssertion
        extends StObject
           with Eventually
           with PromiseLike[Any] {
        
        def apply(): PromisedAssertion = js.native
        
        def ensure(): PromisedAssertion = js.native
        def ensure(`type`: String): typingsJapgolly.chaiAsPromised.Chai.PromisedAssertion = js.native
        def ensure(`type`: String, message: String): typingsJapgolly.chaiAsPromised.Chai.PromisedAssertion = js.native
        @JSName("ensure")
        var ensure_Original: PromisedAssertion = js.native
        @JSName("ensure")
        def ensure_PromisedAssertion(message: String): PromisedAssertion = js.native
      }
    }
  }
}
