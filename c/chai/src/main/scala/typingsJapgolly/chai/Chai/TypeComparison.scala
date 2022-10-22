package typingsJapgolly.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeComparison extends StObject {
  
  def apply(`type`: String): Assertion = js.native
  def apply(`type`: String, message: String): Assertion = js.native
  
  def instanceOf(constructor: Any): Assertion = js.native
  def instanceOf(constructor: Any, message: String): Assertion = js.native
  @JSName("instanceOf")
  var instanceOf_Original: InstanceOf = js.native
  
  def instanceof(constructor: Any): Assertion = js.native
  def instanceof(constructor: Any, message: String): Assertion = js.native
  @JSName("instanceof")
  var instanceof_Original: InstanceOf = js.native
}
