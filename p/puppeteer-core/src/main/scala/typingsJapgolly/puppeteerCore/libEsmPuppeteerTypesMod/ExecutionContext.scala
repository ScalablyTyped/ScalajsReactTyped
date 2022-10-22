package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ExecutionContext")
@js.native
open class ExecutionContext protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonExecutionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonIsolatedWorldMod.IsolatedWorld
  ) = this()
}
