package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileNotification
  extends StObject
     with ITileNotification
object TileNotification {
  
  inline def apply(content: XmlDocument, expirationTime: js.Date, tag: String): TileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileNotification]
  }
}
