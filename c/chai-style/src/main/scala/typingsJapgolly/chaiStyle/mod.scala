package typingsJapgolly.chaiStyle

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chai.Chai.LanguageChains
import typingsJapgolly.chai.Chai.NumericComparison
import typingsJapgolly.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-style", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion
        extends StObject
           with LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def style(styleName: String): Assertion = js.native
        def style(styleName: String, styleValue: String): Assertion = js.native
      }
    }
  }
}
