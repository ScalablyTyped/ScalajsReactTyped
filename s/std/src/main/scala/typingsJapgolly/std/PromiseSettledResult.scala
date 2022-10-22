package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.PromiseFulfilledResult[T]
  - typingsJapgolly.std.PromiseRejectedResult
*/
trait PromiseSettledResult[T] extends StObject
object PromiseSettledResult {
  
  inline def PromiseFulfilledResult[T](value: T): typingsJapgolly.std.PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.std.PromiseFulfilledResult[T]]
  }
  
  inline def PromiseRejectedResult(reason: Any): typingsJapgolly.std.PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[typingsJapgolly.std.PromiseRejectedResult]
  }
}
