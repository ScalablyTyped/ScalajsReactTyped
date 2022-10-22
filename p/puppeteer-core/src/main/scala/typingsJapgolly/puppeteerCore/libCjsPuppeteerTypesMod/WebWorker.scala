package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonWebWorkerMod.ConsoleAPICalledCallback
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonWebWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "WebWorker")
@js.native
open class WebWorker protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonWebWorkerMod.WebWorker {
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
