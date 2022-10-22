package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionTransportMod.ConnectionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Connection")
@js.native
open class Connection protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection {
  def this(url: String, transport: ConnectionTransport) = this()
  def this(url: String, transport: ConnectionTransport, delay: Double) = this()
}
/* static members */
object Connection {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Connection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSession(session: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession): js.UndefOr[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSession")(session.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection]]
}
