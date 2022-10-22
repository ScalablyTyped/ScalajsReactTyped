package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "Frame")
@js.native
open class Frame protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame {
  /**
    * @internal
    */
  def this(
    frameManager: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: String,
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
  ) = this()
  def this(
    frameManager: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: Unit,
    client: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
  ) = this()
}
