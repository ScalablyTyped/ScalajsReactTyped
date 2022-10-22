package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastNotificationManagerStatics extends StObject {
  
  def createToastNotifier(): ToastNotifier = js.native
  def createToastNotifier(applicationId: String): ToastNotifier = js.native
  
  def getTemplateContent(`type`: ToastTemplateType): XmlDocument = js.native
}
