package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "HTTPRequest")
@js.native
open class HTTPRequest protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest {
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.CDPSession,
    frame: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.CDPSession,
    frame: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
}
