package typingsJapgolly.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Answer extends StObject {
  
  var _answer: js.UndefOr[Extract] = js.undefined
}
object Answer {
  
  inline def apply(): Answer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Answer]
  }
  
  extension [Self <: Answer](x: Self) {
    
    inline def set_answer(value: Extract): Self = StObject.set(x, "_answer", value.asInstanceOf[js.Any])
    
    inline def set_answerUndefined: Self = StObject.set(x, "_answer", js.undefined)
  }
}
