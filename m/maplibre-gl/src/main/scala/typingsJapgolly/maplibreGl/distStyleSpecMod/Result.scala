package typingsJapgolly.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.anon.Result[T]
  - typingsJapgolly.maplibreGl.anon.ResultValue[E]
*/
trait Result[T, E] extends StObject
object Result {
  
  inline def Result[T](value: T): typingsJapgolly.maplibreGl.anon.Result[T] = {
    val __obj = js.Dynamic.literal(result = "success", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Result[T]]
  }
  
  inline def ResultValue[E](value: E): typingsJapgolly.maplibreGl.anon.ResultValue[E] = {
    val __obj = js.Dynamic.literal(result = "error", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.ResultValue[E]]
  }
}
