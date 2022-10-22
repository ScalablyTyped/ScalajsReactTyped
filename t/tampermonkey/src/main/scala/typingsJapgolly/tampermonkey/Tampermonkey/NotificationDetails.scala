package typingsJapgolly.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tampermonkey.Tampermonkey.TextNotification
  - typingsJapgolly.tampermonkey.Tampermonkey.HighlightNotification
*/
trait NotificationDetails extends StObject
object NotificationDetails {
  
  inline def HighlightNotification(text: Unit): typingsJapgolly.tampermonkey.Tampermonkey.HighlightNotification = {
    val __obj = js.Dynamic.literal(highlight = true, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tampermonkey.Tampermonkey.HighlightNotification]
  }
  
  inline def TextNotification(text: String): typingsJapgolly.tampermonkey.Tampermonkey.TextNotification = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tampermonkey.Tampermonkey.TextNotification]
  }
}
