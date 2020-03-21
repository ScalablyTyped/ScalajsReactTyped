package typingsJapgolly.firebaseFirestore.platformMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.connectionMod.Connection
import typingsJapgolly.firebaseFirestore.connectivityMonitorMod.ConnectivityMonitor
import typingsJapgolly.firebaseFirestore.databaseInfoMod.DatabaseId
import typingsJapgolly.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typingsJapgolly.firebaseFirestore.serializerMod.JsonProtoSerializer
import typingsJapgolly.firebaseFirestore.typesMod.ProtoByteString
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  /** True if and only if the Base64 conversion functions are available. */
  val base64Available: Boolean
  /** The Platform's 'document' implementation or null if not available. */
  val document: Document_ | Null
  val emptyByteString: ProtoByteString
  /** The Platform's 'window' implementation or null if not available. */
  val window: Window_ | Null
  /** Converts a Base64 encoded string to a binary string. */
  def atob(encoded: String): String
  /** Converts a binary string to a Base64 encoded string. */
  def btoa(raw: String): String
  /** Formats an object as a JSON string, suitable for logging. */
  def formatJSON(value: js.Any): String
  def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection]
  def newConnectivityMonitor(): ConnectivityMonitor
  def newSerializer(databaseId: DatabaseId): JsonProtoSerializer
}

object Platform {
  @scala.inline
  def apply(
    atob: String => CallbackTo[String],
    base64Available: Boolean,
    btoa: String => CallbackTo[String],
    emptyByteString: ProtoByteString,
    formatJSON: js.Any => CallbackTo[String],
    loadConnection: DatabaseInfo => CallbackTo[js.Promise[Connection]],
    newConnectivityMonitor: CallbackTo[ConnectivityMonitor],
    newSerializer: DatabaseId => CallbackTo[JsonProtoSerializer],
    document: Document_ = null,
    window: Window_ = null
  ): Platform = {
    val __obj = js.Dynamic.literal(base64Available = base64Available.asInstanceOf[js.Any], emptyByteString = emptyByteString.asInstanceOf[js.Any])
    __obj.updateDynamic("atob")(js.Any.fromFunction1((t0: java.lang.String) => atob(t0).runNow()))
    __obj.updateDynamic("btoa")(js.Any.fromFunction1((t0: java.lang.String) => btoa(t0).runNow()))
    __obj.updateDynamic("formatJSON")(js.Any.fromFunction1((t0: js.Any) => formatJSON(t0).runNow()))
    __obj.updateDynamic("loadConnection")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.databaseInfoMod.DatabaseInfo) => loadConnection(t0).runNow()))
    __obj.updateDynamic("newConnectivityMonitor")(newConnectivityMonitor.toJsFn)
    __obj.updateDynamic("newSerializer")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.databaseInfoMod.DatabaseId) => newSerializer(t0).runNow()))
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform]
  }
}

