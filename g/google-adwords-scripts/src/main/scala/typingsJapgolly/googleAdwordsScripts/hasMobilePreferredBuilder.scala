package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasMobilePreferredBuilder[B] extends StObject {
  
  def withMobilePreferred(): B
}
object hasMobilePreferredBuilder {
  
  inline def apply[B](withMobilePreferred: CallbackTo[B]): hasMobilePreferredBuilder[B] = {
    val __obj = js.Dynamic.literal(withMobilePreferred = withMobilePreferred.toJsFn)
    __obj.asInstanceOf[hasMobilePreferredBuilder[B]]
  }
  
  extension [Self <: hasMobilePreferredBuilder[?], B](x: Self & hasMobilePreferredBuilder[B]) {
    
    inline def setWithMobilePreferred(value: CallbackTo[B]): Self = StObject.set(x, "withMobilePreferred", value.toJsFn)
  }
}
