package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.Response
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "HTTPResponse")
@js.native
open class HTTPResponse protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttpresponseMod.HTTPResponse {
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttpresponseMod.CDPSession,
    request: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest,
    responsePayload: Response
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttpresponseMod.CDPSession,
    request: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest,
    responsePayload: Response,
    extraInfo: ResponseReceivedExtraInfoEvent
  ) = this()
}
