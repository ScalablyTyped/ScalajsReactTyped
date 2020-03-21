package typingsJapgolly.sharedb.mod

import org.scalajs.dom.raw.WebSocket
import typingsJapgolly.sharedb.AnonResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb", "Connection")
@js.native
class Connection protected () extends js.Object {
  def this(ws: WebSocket) = this()
  def createFetchQuery(
    collectionName: String,
    query: String,
    options: AnonResults,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typingsJapgolly.sharedb.sharedbMod.Query = js.native
  def createSubscribeQuery(
    collectionName: String,
    query: String,
    options: AnonResults,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typingsJapgolly.sharedb.sharedbMod.Query = js.native
  def get(collectionName: String, documentID: String): typingsJapgolly.sharedb.sharedbMod.Doc = js.native
}

