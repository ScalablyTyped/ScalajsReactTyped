package typingsJapgolly.qunitDom

import org.scalajs.dom.Element
import typingsJapgolly.qunitDom.distAssertionsMod.AssertionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersTestAssertionsMod {
  
  @JSImport("qunit-dom/dist/helpers/test-assertions", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TestAssertions
  
  @js.native
  trait TestAssertions extends StObject {
    
    def dom(): typingsJapgolly.qunitDom.distAssertionsMod.default = js.native
    def dom(target: String): typingsJapgolly.qunitDom.distAssertionsMod.default = js.native
    def dom(target: String, rootElement: Element): typingsJapgolly.qunitDom.distAssertionsMod.default = js.native
    def dom(target: Element): typingsJapgolly.qunitDom.distAssertionsMod.default = js.native
    def dom(target: Element, rootElement: Element): typingsJapgolly.qunitDom.distAssertionsMod.default = js.native
    def dom(target: Null, rootElement: Element): typingsJapgolly.qunitDom.distAssertionsMod.default = js.native
    
    def pushResult(result: AssertionResult): Unit = js.native
    
    var results: js.Array[AssertionResult] = js.native
  }
}
