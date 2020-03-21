package typingsJapgolly.azdata.mod.queryeditor

import typingsJapgolly.azdata.mod.ResultSetSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryEventListener extends js.Object {
  def onQueryEvent(`type`: QueryEventType, document: QueryDocument): Unit = js.native
  def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: String): Unit = js.native
  def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: ResultSetSummary): Unit = js.native
}

