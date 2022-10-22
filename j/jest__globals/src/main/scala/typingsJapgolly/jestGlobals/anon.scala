package typingsJapgolly.jestGlobals

import typingsJapgolly.jestTypes.mod.HookFn
import typingsJapgolly.jestTypes.mod.TestFn
import typingsJapgolly.jestTypes.mod.TestNameLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(fn: HookFn): Unit = js.native
    def apply(fn: HookFn, timeout: Double): Unit = js.native
  }
  
  @js.native
  trait FnCallTestNameFnTimeout extends StObject {
    
    def apply(testName: TestNameLike, fn: TestFn): Unit = js.native
    def apply(testName: TestNameLike, fn: TestFn, timeout: Double): Unit = js.native
  }
}
