package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsBuilder[E] extends StObject {
  
  def build(): AdWordsOperation[E]
}
object AdWordsBuilder {
  
  inline def apply[E](build: CallbackTo[AdWordsOperation[E]]): AdWordsBuilder[E] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn)
    __obj.asInstanceOf[AdWordsBuilder[E]]
  }
  
  extension [Self <: AdWordsBuilder[?], E](x: Self & AdWordsBuilder[E]) {
    
    inline def setBuild(value: CallbackTo[AdWordsOperation[E]]): Self = StObject.set(x, "build", value.toJsFn)
  }
}
