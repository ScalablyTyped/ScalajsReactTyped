package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "LifecycleWatcher")
@js.native
open class LifecycleWatcher protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonLifecycleWatcherMod.LifecycleWatcher {
  def this(
    frameManager: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager,
    frame: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame,
    waitUntil: js.Array[PuppeteerLifeCycleEvent],
    timeout: Double
  ) = this()
  def this(
    frameManager: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager,
    frame: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame,
    waitUntil: PuppeteerLifeCycleEvent,
    timeout: Double
  ) = this()
}
