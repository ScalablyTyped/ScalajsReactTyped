package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeUpdateManagerStatics extends js.Object {
  def createBadgeUpdaterForApplication(): BadgeUpdater = js.native
  def createBadgeUpdaterForApplication(applicationId: String): BadgeUpdater = js.native
  def createBadgeUpdaterForSecondaryTile(tileId: String): BadgeUpdater = js.native
  def getTemplateContent(`type`: BadgeTemplateType): XmlDocument = js.native
}

