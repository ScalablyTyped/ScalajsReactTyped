package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayKeywordBuilder[DisplayKeyword]
  extends StObject
     with DisplayBuilder[DisplayKeywordBuilder[DisplayKeyword]] {
  
  def withText(text: String): DisplayKeywordBuilder[DisplayKeyword]
}
object DisplayKeywordBuilder {
  
  inline def apply[DisplayKeyword](
    build: CallbackTo[AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]]],
    exclude: CallbackTo[AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]]],
    withCpc: Double => DisplayKeywordBuilder[DisplayKeyword],
    withCpm: Double => DisplayKeywordBuilder[DisplayKeyword],
    withText: String => DisplayKeywordBuilder[DisplayKeyword]
  ): DisplayKeywordBuilder[DisplayKeyword] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withText = js.Any.fromFunction1(withText))
    __obj.asInstanceOf[DisplayKeywordBuilder[DisplayKeyword]]
  }
  
  extension [Self <: DisplayKeywordBuilder[?], DisplayKeyword](x: Self & DisplayKeywordBuilder[DisplayKeyword]) {
    
    inline def setWithText(value: String => DisplayKeywordBuilder[DisplayKeyword]): Self = StObject.set(x, "withText", js.Any.fromFunction1(value))
  }
}
