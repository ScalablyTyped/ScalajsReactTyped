package typingsJapgolly.karmaChai

import typingsJapgolly.chai.Chai.AssertStatic
import typingsJapgolly.chai.Chai.ExpectStatic
import typingsJapgolly.chai.Chai.Should
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("assert")
    @js.native
    def assert: AssertStatic = js.native
    inline def assert_=(x: AssertStatic): Unit = js.Dynamic.global.updateDynamic("assert")(x.asInstanceOf[js.Any])
    
    @JSGlobal("expect")
    @js.native
    def expect: ExpectStatic = js.native
    inline def expect_=(x: ExpectStatic): Unit = js.Dynamic.global.updateDynamic("expect")(x.asInstanceOf[js.Any])
    
    @JSGlobal("should")
    @js.native
    def should: Should = js.native
    inline def should_=(x: Should): Unit = js.Dynamic.global.updateDynamic("should")(x.asInstanceOf[js.Any])
  }
}
