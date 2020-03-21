package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typingsJapgolly.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typingsJapgolly.firebaseFirestore.coreTypesMod.ProtoByteString
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings._empty
import typingsJapgolly.firebaseFirestore.platformPlatformMod.Platform
import typingsJapgolly.firebaseFirestore.remoteConnectionMod.Connection
import typingsJapgolly.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitor
import typingsJapgolly.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_browser/browser_platform", JSImport.Namespace)
@js.native
object platformBrowserBrowserPlatformMod extends js.Object {
  @js.native
  class BrowserPlatform () extends Platform {
    /** True if and only if the Base64 conversion functions are available. */
    /* CompleteClass */
    override val base64Available: Boolean = js.native
    /** The Platform's 'document' implementation or null if not available. */
    /* CompleteClass */
    override val document: Document_ | Null = js.native
    /* CompleteClass */
    override val emptyByteString: ProtoByteString = js.native
    @JSName("emptyByteString")
    val emptyByteString_BrowserPlatform: _empty = js.native
    /** The Platform's 'window' implementation or null if not available. */
    /* CompleteClass */
    override val window: Window_ | Null = js.native
    /** Converts a Base64 encoded string to a binary string. */
    /* CompleteClass */
    override def atob(encoded: String): String = js.native
    /** Converts a binary string to a Base64 encoded string. */
    /* CompleteClass */
    override def btoa(raw: String): String = js.native
    @JSName("document")
    def document_MBrowserPlatform(): Document_ | Null = js.native
    /** Formats an object as a JSON string, suitable for logging. */
    /* CompleteClass */
    override def formatJSON(value: js.Any): String = js.native
    /* CompleteClass */
    override def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection] = js.native
    /* CompleteClass */
    override def newConnectivityMonitor(): ConnectivityMonitor = js.native
    /* CompleteClass */
    override def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
    @JSName("window")
    def window_MBrowserPlatform(): Window_ | Null = js.native
  }
  
}

