package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITileNotification extends StObject {
  
  var content: XmlDocument
  
  var expirationTime: js.Date
  
  var tag: String
}
object ITileNotification {
  
  inline def apply(content: XmlDocument, expirationTime: js.Date, tag: String): ITileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITileNotification]
  }
  
  extension [Self <: ITileNotification](x: Self) {
    
    inline def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
