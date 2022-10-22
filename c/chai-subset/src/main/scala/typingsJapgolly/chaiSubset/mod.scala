package typingsJapgolly.chaiSubset

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-subset", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def containSubset(`val`: Any, exp: Any): Unit = js.native
        def containSubset(`val`: Any, exp: Any, msg: String): Unit = js.native
      }
      
      trait Assertion extends StObject {
        
        def containSubset(expected: Any): Assertion
      }
      object Assertion {
        
        inline def apply(containSubset: Any => Assertion): Assertion = {
          val __obj = js.Dynamic.literal(containSubset = js.Any.fromFunction1(containSubset))
          __obj.asInstanceOf[Assertion]
        }
        
        extension [Self <: Assertion](x: Self) {
          
          inline def setContainSubset(value: Any => Assertion): Self = StObject.set(x, "containSubset", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
