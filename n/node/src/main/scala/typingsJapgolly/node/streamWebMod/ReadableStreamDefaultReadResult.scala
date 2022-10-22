package typingsJapgolly.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.streamWebMod.ReadableStreamDefaultReadValueResult[T]
  - typingsJapgolly.node.streamWebMod.ReadableStreamDefaultReadDoneResult
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  inline def ReadableStreamDefaultReadDoneResult(value: Unit): typingsJapgolly.node.streamWebMod.ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.node.streamWebMod.ReadableStreamDefaultReadDoneResult]
  }
  
  inline def ReadableStreamDefaultReadValueResult[T](value: T): typingsJapgolly.node.streamWebMod.ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.node.streamWebMod.ReadableStreamDefaultReadValueResult[T]]
  }
}
