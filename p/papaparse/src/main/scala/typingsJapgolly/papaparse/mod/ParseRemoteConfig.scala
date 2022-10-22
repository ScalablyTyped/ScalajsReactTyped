package typingsJapgolly.papaparse.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.papaparse.mod.ParseRemoteConfigStep[T]
  - typingsJapgolly.papaparse.mod.ParseRemoteConfigNoStep[T]
*/
trait ParseRemoteConfig[T] extends StObject
object ParseRemoteConfig {
  
  inline def ParseRemoteConfigNoStep[T](complete: (ParseResult[T], String) => Callback): typingsJapgolly.papaparse.mod.ParseRemoteConfigNoStep[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2((t0: ParseResult[T], t1: String) => (complete(t0, t1)).runNow()), download = true)
    __obj.asInstanceOf[typingsJapgolly.papaparse.mod.ParseRemoteConfigNoStep[T]]
  }
  
  inline def ParseRemoteConfigStep[T](step: (ParseStepResult[T], Parser) => Callback): typingsJapgolly.papaparse.mod.ParseRemoteConfigStep[T] = {
    val __obj = js.Dynamic.literal(download = true, step = js.Any.fromFunction2((t0: ParseStepResult[T], t1: Parser) => (step(t0, t1)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.papaparse.mod.ParseRemoteConfigStep[T]]
  }
}
