package typingsJapgolly.chunkedDc.jasmine

import typingsJapgolly.chunkedDc.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spy extends StObject {
  
  def apply(params: scala.Any*): scala.Any = js.native
  
  var and: SpyAnd = js.native
  
  var argsForCall: js.Array[scala.Any] = js.native
  
  var calls: Calls = js.native
  
  var identity: String = js.native
  
  var mostRecentCall: Args = js.native
  
  var wasCalled: Boolean = js.native
}
