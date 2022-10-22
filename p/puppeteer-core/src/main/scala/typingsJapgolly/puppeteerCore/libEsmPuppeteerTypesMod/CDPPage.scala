package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPPage")
@js.native
open class CDPPage protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage {
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    target: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue
  ) = this()
}
/* static members */
object CDPPage {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPPage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    target: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue
  ): js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage]]
  /**
    * @internal
    */
  inline def _create(
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    target: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue
  ): js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage]]
}
