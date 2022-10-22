package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Generics
trait AdWordsEntity extends StObject {
  
  var getEntityType: js.UndefOr[js.Function0[String]] = js.undefined
}
object AdWordsEntity {
  
  inline def apply(): AdWordsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdWordsEntity]
  }
  
  extension [Self <: AdWordsEntity](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetEntityTypeUndefined: Self = StObject.set(x, "getEntityType", js.undefined)
  }
}
