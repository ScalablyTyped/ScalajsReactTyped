package typingsJapgolly.jqueryAjaxfile

import typingsJapgolly.jqueryAjaxfile.Chai.Assertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object extends StObject {
  
  def should(`type`: String): Assertion
  def should(`type`: String, message: String): Assertion
  @JSName("should")
  var should_Original: Assertion
}
object Object {
  
  inline def apply(should: Assertion): Object = {
    val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  
  extension [Self <: Object](x: Self) {
    
    inline def setShould(value: Assertion): Self = StObject.set(x, "should", value.asInstanceOf[js.Any])
  }
}
