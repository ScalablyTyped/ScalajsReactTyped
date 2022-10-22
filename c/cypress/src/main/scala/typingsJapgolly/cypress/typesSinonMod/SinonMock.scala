package typingsJapgolly.cypress.typesSinonMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonMock extends StObject {
  
  /**
    * Overrides obj.method with a mock function and returns it.
    */
  def expects(method: String): SinonExpectation
  
  /**
    * Restores all mocked methods.
    */
  def restore(): Unit
  
  /**
    * Verifies all expectations on the mock.
    * If any expectation is not satisfied, an exception is thrown.
    * Also restores the mocked methods.
    */
  def verify(): Unit
}
object SinonMock {
  
  inline def apply(expects: String => SinonExpectation, restore: Callback, verify: Callback): SinonMock = {
    val __obj = js.Dynamic.literal(expects = js.Any.fromFunction1(expects), restore = restore.toJsFn, verify = verify.toJsFn)
    __obj.asInstanceOf[SinonMock]
  }
  
  extension [Self <: SinonMock](x: Self) {
    
    inline def setExpects(value: String => SinonExpectation): Self = StObject.set(x, "expects", js.Any.fromFunction1(value))
    
    inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
    
    inline def setVerify(value: Callback): Self = StObject.set(x, "verify", value.toJsFn)
  }
}
