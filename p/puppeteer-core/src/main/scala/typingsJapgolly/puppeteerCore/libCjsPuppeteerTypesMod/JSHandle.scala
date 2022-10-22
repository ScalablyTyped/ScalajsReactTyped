package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "JSHandle")
@js.native
open class JSHandle[T] protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonJshandleMod.JSHandle[T] {
  /**
    * @internal
    */
  def this(
    context: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonExecutionContextMod.ExecutionContext,
    remoteObject: RemoteObject
  ) = this()
}
