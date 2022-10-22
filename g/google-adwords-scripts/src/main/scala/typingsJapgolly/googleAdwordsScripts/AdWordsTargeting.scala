package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsTargeting[A, E] extends StObject {
  
  def audiences(): AdWordsSelector[A]
  
  def exculdedAudiences(): AdWordsSelector[E]
}
object AdWordsTargeting {
  
  inline def apply[A, E](audiences: CallbackTo[AdWordsSelector[A]], exculdedAudiences: CallbackTo[AdWordsSelector[E]]): AdWordsTargeting[A, E] = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, exculdedAudiences = exculdedAudiences.toJsFn)
    __obj.asInstanceOf[AdWordsTargeting[A, E]]
  }
  
  extension [Self <: AdWordsTargeting[?, ?], A, E](x: Self & (AdWordsTargeting[A, E])) {
    
    inline def setAudiences(value: CallbackTo[AdWordsSelector[A]]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setExculdedAudiences(value: CallbackTo[AdWordsSelector[E]]): Self = StObject.set(x, "exculdedAudiences", value.toJsFn)
  }
}
