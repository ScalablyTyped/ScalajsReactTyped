package typingsJapgolly.papaparse.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseRemoteConfigNoStep[T]
  extends StObject
     with ParseRemoteConfigBase[T]
     with ParseRemoteConfig[T] {
  
  /** @inheritdoc */
  @JSName("complete")
  def complete_MParseRemoteConfigNoStep(results: ParseResult[T], file: String): Unit
}
object ParseRemoteConfigNoStep {
  
  inline def apply[T](complete: (ParseResult[T], String) => Callback): ParseRemoteConfigNoStep[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2((t0: ParseResult[T], t1: String) => (complete(t0, t1)).runNow()), download = true)
    __obj.asInstanceOf[ParseRemoteConfigNoStep[T]]
  }
  
  extension [Self <: ParseRemoteConfigNoStep[?], T](x: Self & ParseRemoteConfigNoStep[T]) {
    
    inline def setComplete(value: (ParseResult[T], String) => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction2((t0: ParseResult[T], t1: String) => (value(t0, t1)).runNow()))
  }
}
