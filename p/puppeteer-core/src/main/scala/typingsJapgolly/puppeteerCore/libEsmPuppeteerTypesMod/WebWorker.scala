package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonWebWorkerMod.ConsoleAPICalledCallback
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonWebWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "WebWorker")
@js.native
open class WebWorker protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonWebWorkerMod.WebWorker {
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
