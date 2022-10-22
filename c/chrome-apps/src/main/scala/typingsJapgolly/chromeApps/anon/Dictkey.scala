package typingsJapgolly.chromeApps.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chromeApps.chrome.webViewRequest.DeclarativeWebRequestConditionsList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /** Arguments, see original condition docs in chrome.webViewRequest */
/* key */ StringDictionary[Any | js.Array[Any]] {
  
  /** Condition */
  var `type`: DeclarativeWebRequestConditionsList
}
object Dictkey {
  
  inline def apply(`type`: DeclarativeWebRequestConditionsList): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setType(value: DeclarativeWebRequestConditionsList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
