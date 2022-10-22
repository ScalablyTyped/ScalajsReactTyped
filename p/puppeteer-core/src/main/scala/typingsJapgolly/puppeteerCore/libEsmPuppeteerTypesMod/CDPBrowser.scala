package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserCloseCallback
import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.IsPageTargetCallback
import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.TargetFilterCallback
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPuppeteerViewportMod.Viewport
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.chrome
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.firefox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPBrowser")
@js.native
open class CDPBrowser protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonBrowserMod.CDPBrowser {
  /**
    * @internal
    */
  def this(
    product: js.UndefOr[chrome | firefox],
    connection: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: js.UndefOr[Viewport | Null],
    process: js.UndefOr[ChildProcess],
    closeCallback: js.UndefOr[BrowserCloseCallback],
    targetFilterCallback: js.UndefOr[TargetFilterCallback],
    isPageTargetCallback: js.UndefOr[IsPageTargetCallback]
  ) = this()
}
/* static members */
object CDPBrowser {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPBrowser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _create(
    product: js.UndefOr[firefox | chrome],
    connection: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: js.UndefOr[Viewport | Null],
    process: js.UndefOr[ChildProcess],
    closeCallback: js.UndefOr[BrowserCloseCallback],
    targetFilterCallback: js.UndefOr[TargetFilterCallback],
    isPageTargetCallback: js.UndefOr[IsPageTargetCallback]
  ): js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonBrowserMod.CDPBrowser] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(product.asInstanceOf[js.Any], connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], targetFilterCallback.asInstanceOf[js.Any], isPageTargetCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonBrowserMod.CDPBrowser]]
}
