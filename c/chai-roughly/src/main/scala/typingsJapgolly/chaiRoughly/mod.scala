package typingsJapgolly.chaiRoughly

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chai.Chai.LanguageChains
import typingsJapgolly.chai.Chai.NumericComparison
import typingsJapgolly.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-roughly", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      // For Assert APIs
      trait Assert extends StObject {
        
        def roughly(): Assertion
        def roughly(tolerance: Double): Assertion
        def roughly(`type`: String): typingsJapgolly.chai.Chai.Assertion
        def roughly(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion
        @JSName("roughly")
        var roughly_Original: Roughly
      }
      object Assert {
        
        inline def apply(roughly: Roughly): Assert = {
          val __obj = js.Dynamic.literal(roughly = roughly.asInstanceOf[js.Any])
          __obj.asInstanceOf[Assert]
        }
        
        extension [Self <: Assert](x: Self) {
          
          inline def setRoughly(value: Roughly): Self = StObject.set(x, "roughly", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Assertion
        extends StObject
           with LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def roughly(): Assertion = js.native
        def roughly(tolerance: Double): Assertion = js.native
        def roughly(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
        def roughly(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
        @JSName("roughly")
        var roughly_Original: Roughly = js.native
      }
      
      // For BDD APIs
      @js.native
      trait Roughly
        extends StObject
           with Assertion {
        
        def apply(): Assertion = js.native
        def apply(tolerance: Double): Assertion = js.native
      }
    }
  }
}
