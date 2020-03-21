package typingsJapgolly.sharepoint.SP.Publishing

import typingsJapgolly.sharepoint.SP.ClientContext
import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.ClientObjectList
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Variations")
@js.native
class Variations () extends ClientObject

/* static members */
@JSGlobal("SP.Publishing.Variations")
@js.native
object Variations extends js.Object {
  def getLabels(context: ClientContext): ClientObjectList[VariationLabel] = js.native
  def getPeerUrl(context: ClientContext, currentUrl: String, labelTitle: String): StringResult = js.native
  def updateListItems(context: ClientContext, listId: Guid, itemIds: js.Array[Double]): Unit = js.native
}

