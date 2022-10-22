package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Display
trait DisplayBuilder[T]
  extends StObject
     with AdWordsBuilder[T] {
  
  def exclude(): AdWordsOperation[T]
  
  def withCpc(cpc: Double): T
  
  def withCpm(cpm: Double): T
}
object DisplayBuilder {
  
  inline def apply[T](
    build: CallbackTo[AdWordsOperation[T]],
    exclude: CallbackTo[AdWordsOperation[T]],
    withCpc: Double => T,
    withCpm: Double => T
  ): DisplayBuilder[T] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
    __obj.asInstanceOf[DisplayBuilder[T]]
  }
  
  extension [Self <: DisplayBuilder[?], T](x: Self & DisplayBuilder[T]) {
    
    inline def setExclude(value: CallbackTo[AdWordsOperation[T]]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithCpc(value: Double => T): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => T): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
  }
}
