package typingsJapgolly.chai.Chai

import typingsJapgolly.chai.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Include extends StObject {
  
  def apply(value: Any): Assertion = js.native
  def apply(value: Any, message: String): Assertion = js.native
  
  var all: KeyFilter = js.native
  
  var any: KeyFilter = js.native
  
  var deep: Deep = js.native
  
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[Any]): Assertion = js.native
  def keys(keys: Object): Assertion = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  
  def members(set: js.Array[Any]): Assertion = js.native
  def members(set: js.Array[Any], message: String): Assertion = js.native
  @JSName("members")
  var members_Original: Members = js.native
  
  def oneOf(list: js.Array[Any]): Assertion = js.native
  def oneOf(list: js.Array[Any], message: String): Assertion = js.native
  @JSName("oneOf")
  var oneOf_Original: OneOf = js.native
  
  var ordered: Ordered = js.native
}
