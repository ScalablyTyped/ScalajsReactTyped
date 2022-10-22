package typingsJapgolly.jestTypes.anon

import typingsJapgolly.jestTypes.jestTypesStrings.test_fn_success
import typingsJapgolly.jestTypes.mod.AsyncEvent
import typingsJapgolly.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameTest
  extends StObject
     with AsyncEvent {
  
  var name: test_fn_success
  
  var test: TestEntry
}
object NameTest {
  
  inline def apply(test: TestEntry): NameTest = {
    val __obj = js.Dynamic.literal(name = "test_fn_success", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTest]
  }
  
  extension [Self <: NameTest](x: Self) {
    
    inline def setName(value: test_fn_success): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
