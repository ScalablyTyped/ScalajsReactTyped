package typingsJapgolly.webgme.Gme

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferenceHelper extends StObject {
  
  def getPreferences(): PreferenceHelper
}
object PreferenceHelper {
  
  inline def apply(getPreferences: CallbackTo[PreferenceHelper]): PreferenceHelper = {
    val __obj = js.Dynamic.literal(getPreferences = getPreferences.toJsFn)
    __obj.asInstanceOf[PreferenceHelper]
  }
  
  extension [Self <: PreferenceHelper](x: Self) {
    
    inline def setGetPreferences(value: CallbackTo[PreferenceHelper]): Self = StObject.set(x, "getPreferences", value.toJsFn)
  }
}
