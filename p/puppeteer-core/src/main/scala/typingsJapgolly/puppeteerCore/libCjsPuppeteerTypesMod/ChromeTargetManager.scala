package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.TargetFilterCallback
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ChromeTargetManager")
@js.native
open class ChromeTargetManager protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonChromeTargetManagerMod.ChromeTargetManager {
  def this(
    connection: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory
  ) = this()
  def this(
    connection: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory,
    targetFilterCallback: TargetFilterCallback
  ) = this()
}
