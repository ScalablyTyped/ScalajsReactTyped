package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdCustomizerSourceBuilder[AdCustomizerSource]
  extends StObject
     with AdWordsBuilder[AdCustomizerSource] {
  
  def addAttribute(name: String, `type`: String): AdCustomizerSourceBuilder[AdCustomizerSource]
  
  def addAttributes(attributes: js.Object): AdCustomizerSourceBuilder[AdCustomizerSource]
  
  def withName(name: String): AdCustomizerSourceBuilder[AdCustomizerSource]
}
object AdCustomizerSourceBuilder {
  
  inline def apply[AdCustomizerSource](
    addAttribute: (String, String) => AdCustomizerSourceBuilder[AdCustomizerSource],
    addAttributes: js.Object => AdCustomizerSourceBuilder[AdCustomizerSource],
    build: CallbackTo[AdWordsOperation[AdCustomizerSource]],
    withName: String => AdCustomizerSourceBuilder[AdCustomizerSource]
  ): AdCustomizerSourceBuilder[AdCustomizerSource] = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2(addAttribute), addAttributes = js.Any.fromFunction1(addAttributes), build = build.toJsFn, withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[AdCustomizerSourceBuilder[AdCustomizerSource]]
  }
  
  extension [Self <: AdCustomizerSourceBuilder[?], AdCustomizerSource](x: Self & AdCustomizerSourceBuilder[AdCustomizerSource]) {
    
    inline def setAddAttribute(value: (String, String) => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = StObject.set(x, "addAttribute", js.Any.fromFunction2(value))
    
    inline def setAddAttributes(value: js.Object => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = StObject.set(x, "addAttributes", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
