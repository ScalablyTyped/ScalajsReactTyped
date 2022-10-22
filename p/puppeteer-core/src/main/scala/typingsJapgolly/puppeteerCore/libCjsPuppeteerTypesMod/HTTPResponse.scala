package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.Response
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "HTTPResponse")
@js.native
open class HTTPResponse protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttpresponseMod.HTTPResponse {
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttpresponseMod.CDPSession,
    request: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest,
    responsePayload: Response
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttpresponseMod.CDPSession,
    request: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest,
    responsePayload: Response,
    extraInfo: ResponseReceivedExtraInfoEvent
  ) = this()
}
