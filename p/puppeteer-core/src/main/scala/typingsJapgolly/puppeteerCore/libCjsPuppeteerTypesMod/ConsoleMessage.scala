package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConsoleMessageMod.ConsoleMessageLocation
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConsoleMessageMod.ConsoleMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ConsoleMessage")
@js.native
open class ConsoleMessage protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConsoleMessageMod.ConsoleMessage {
  /**
    * @public
    */
  def this(
    `type`: ConsoleMessageType,
    text: String,
    args: js.Array[typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonJshandleMod.JSHandle[Any]],
    stackTraceLocations: js.Array[ConsoleMessageLocation]
  ) = this()
}
