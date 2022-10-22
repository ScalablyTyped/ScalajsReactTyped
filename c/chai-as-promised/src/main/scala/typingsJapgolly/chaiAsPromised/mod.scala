package typingsJapgolly.chaiAsPromised

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chaiAsPromised.Chai.PromisedAssertion
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-as-promised", JSImport.Namespace)
  @js.native
  val ^ : ChaiAsPromised = js.native
  
  @js.native
  trait ChaiAsPromised extends ChaiPlugin {
    
    def transferPromiseness(assertion: PromisedAssertion, promise: PromiseLike[Any]): Unit = js.native
    
    def transformAsserterArgs(values: js.Array[Any]): Any = js.native
  }
  
  type _To = ChaiAsPromised
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiAsPromised = ^
}
