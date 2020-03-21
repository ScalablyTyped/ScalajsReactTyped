package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
class TileUpdateManager () extends js.Object

/* static members */
@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
object TileUpdateManager extends js.Object {
  def createTileUpdaterForApplication(): TileUpdater = js.native
  def createTileUpdaterForApplication(applicationId: String): TileUpdater = js.native
  def createTileUpdaterForSecondaryTile(tileId: String): TileUpdater = js.native
  def getTemplateContent(`type`: TileTemplateType): XmlDocument = js.native
}

