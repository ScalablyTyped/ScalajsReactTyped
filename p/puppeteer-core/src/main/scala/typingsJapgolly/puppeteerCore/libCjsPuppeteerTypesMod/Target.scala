package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.IsPageTargetCallback
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonPuppeteerViewportMod.Viewport
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTargetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Target")
@js.native
open class Target protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target {
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    browserContext: typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    session: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    browserContext: typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
}
