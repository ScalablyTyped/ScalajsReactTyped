package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConsoleMessageMod.ConsoleMessageLocation
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConsoleMessageMod.ConsoleMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ConsoleMessage")
@js.native
open class ConsoleMessage protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConsoleMessageMod.ConsoleMessage {
  /**
    * @public
    */
  def this(
    `type`: ConsoleMessageType,
    text: String,
    args: js.Array[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonJshandleMod.JSHandle[Any]],
    stackTraceLocations: js.Array[ConsoleMessageLocation]
  ) = this()
}
