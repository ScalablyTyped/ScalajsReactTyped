package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Frame")
@js.native
open class Frame protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame {
  /**
    * @internal
    */
  def this(
    frameManager: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: String,
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
  ) = this()
  def this(
    frameManager: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: Unit,
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
  ) = this()
}
