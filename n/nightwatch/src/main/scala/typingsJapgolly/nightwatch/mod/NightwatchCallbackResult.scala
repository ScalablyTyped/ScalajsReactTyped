package typingsJapgolly.nightwatch.mod

import typingsJapgolly.nightwatch.anon.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nightwatch.mod.NightwatchTypedCallbackResult[T]
  - typingsJapgolly.nightwatch.mod.NightwatchCallbackResultError
*/
trait NightwatchCallbackResult[T] extends StObject
object NightwatchCallbackResult {
  
  inline def NightwatchCallbackResultError(state: js.Error | String, value: Class): typingsJapgolly.nightwatch.mod.NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = 1, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nightwatch.mod.NightwatchCallbackResultError]
  }
  
  inline def NightwatchTypedCallbackResult[T](error: js.Error, value: T): typingsJapgolly.nightwatch.mod.NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = 0, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nightwatch.mod.NightwatchTypedCallbackResult[T]]
  }
}
