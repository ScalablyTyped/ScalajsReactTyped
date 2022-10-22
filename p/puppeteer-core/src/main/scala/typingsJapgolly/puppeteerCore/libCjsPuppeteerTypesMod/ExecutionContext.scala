package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ExecutionContext")
@js.native
open class ExecutionContext protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonExecutionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonIsolatedWorldMod.IsolatedWorld
  ) = this()
}
