package typingsJapgolly.sharedb

import org.scalajs.dom.raw.WebSocket
import typingsJapgolly.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  @js.native
  class Connection protected () extends js.Object {
    def this(ws: WebSocket) = this()
    def this(ws: ^) = this()
    // This direct reference from connection to agent is not used internal to
    // ShareDB, but it is handy for server-side only user code that may cache
    // state on the agent and read it in middleware
    var agent: typingsJapgolly.sharedb.agentMod.^  | Null = js.native
    def createFetchQuery(
      collectionName: String,
      query: js.Any,
      options: AnonResultsArray,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    def createSubscribeQuery(
      collectionName: String,
      query: js.Any,
      options: AnonResultsArray,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    def get(collectionName: String, documentID: String): Doc = js.native
  }
  
  type AddNumOp = typingsJapgolly.sharedb.sharedbMod.AddNumOp
  type Doc = typingsJapgolly.sharedb.sharedbMod.Doc
  type Error = typingsJapgolly.sharedb.sharedbMod.Error
  type ListDeleteOp = typingsJapgolly.sharedb.sharedbMod.ListDeleteOp
  type ListInsertOp = typingsJapgolly.sharedb.sharedbMod.ListInsertOp
  type ListMoveOp = typingsJapgolly.sharedb.sharedbMod.ListMoveOp
  type ListReplaceOp = typingsJapgolly.sharedb.sharedbMod.ListReplaceOp
  type ObjectDeleteOp = typingsJapgolly.sharedb.sharedbMod.ObjectDeleteOp
  type ObjectInsertOp = typingsJapgolly.sharedb.sharedbMod.ObjectInsertOp
  type ObjectReplaceOp = typingsJapgolly.sharedb.sharedbMod.ObjectReplaceOp
  type Op = typingsJapgolly.sharedb.sharedbMod.Op
  type Path = typingsJapgolly.sharedb.sharedbMod.Path
  type Query = typingsJapgolly.sharedb.sharedbMod.Query
  type ShareDBSourceOptions = typingsJapgolly.sharedb.sharedbMod.ShareDBSourceOptions
  type StringDeleteOp = typingsJapgolly.sharedb.sharedbMod.StringDeleteOp
  type StringInsertOp = typingsJapgolly.sharedb.sharedbMod.StringInsertOp
  type SubtypeOp = typingsJapgolly.sharedb.sharedbMod.SubtypeOp
}

