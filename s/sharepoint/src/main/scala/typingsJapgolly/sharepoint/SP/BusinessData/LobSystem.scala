package typingsJapgolly.sharepoint.SP.BusinessData

import typingsJapgolly.sharepoint.SP.BusinessData.Collections.LobSystemInstanceCollection
import typingsJapgolly.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.LobSystem")
@js.native
class LobSystem () extends ClientObject {
  def getLobSystemInstances(): LobSystemInstanceCollection = js.native
  def get_name(): String = js.native
}

