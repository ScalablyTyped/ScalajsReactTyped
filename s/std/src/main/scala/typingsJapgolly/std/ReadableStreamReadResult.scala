package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.ReadableStreamReadValueResult[T]
  - typingsJapgolly.std.ReadableStreamReadDoneResult
*/
trait ReadableStreamReadResult[T] extends StObject
object ReadableStreamReadResult {
  
  inline def ReadableStreamReadDoneResult(value: Unit): typingsJapgolly.std.ReadableStreamReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.std.ReadableStreamReadDoneResult]
  }
  
  inline def ReadableStreamReadValueResult[T](value: T): typingsJapgolly.std.ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.std.ReadableStreamReadValueResult[T]]
  }
}
