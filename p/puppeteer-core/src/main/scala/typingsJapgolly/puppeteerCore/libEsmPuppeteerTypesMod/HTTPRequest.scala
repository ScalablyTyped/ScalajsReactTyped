package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "HTTPRequest")
@js.native
open class HTTPRequest protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest {
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.CDPSession,
    frame: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.CDPSession,
    frame: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
}
