package typingsJapgolly.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webStreamsPolyfill.anon.DoneValue[T]
  - typingsJapgolly.webStreamsPolyfill.anon.ValueUndefined
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  inline def DoneValue[T](value: T): typingsJapgolly.webStreamsPolyfill.anon.DoneValue[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webStreamsPolyfill.anon.DoneValue[T]]
  }
  
  inline def ValueUndefined(value: Unit): typingsJapgolly.webStreamsPolyfill.anon.ValueUndefined = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webStreamsPolyfill.anon.ValueUndefined]
  }
}
