package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.IsPageTargetCallback
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPuppeteerViewportMod.Viewport
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "Target")
@js.native
open class Target protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target {
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    browserContext: typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    session: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    browserContext: typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
}
