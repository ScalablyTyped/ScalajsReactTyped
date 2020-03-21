package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.clientContextMod.ClientContext
import typingsJapgolly.sipJs.coreMod.URI
import typingsJapgolly.sipJs.uAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/PublishContext", JSImport.Namespace)
@js.native
object publishContextMod extends js.Object {
  @js.native
  class PublishContext protected () extends ClientContext {
    def this(ua: UA, target: String, event: String) = this()
    def this(ua: UA, target: URI, event: String) = this()
    def this(ua: UA, target: String, event: String, options: js.Any) = this()
    def this(ua: UA, target: URI, event: String, options: js.Any) = this()
    var event: js.Any = js.native
    var options: js.Any = js.native
    var pubRequestBody: js.Any = js.native
    var pubRequestEtag: js.Any = js.native
    var pubRequestExpires: js.Any = js.native
    var publishRefreshTimer: js.Any = js.native
    var refreshRequest: js.Any = js.native
    var sendPublishRequest: js.Any = js.native
    var target: js.Any = js.native
    /**
      * Close
      */
    def close(): Unit = js.native
    /**
      * Publish
      * @param {string} Event body to publish, optional
      */
    def publish(body: String): Unit = js.native
    /**
      * Unpublish
      */
    def unpublish(): Unit = js.native
  }
  
}

