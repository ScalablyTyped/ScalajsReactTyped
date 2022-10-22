package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.TargetFilterCallback
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "FirefoxTargetManager")
@js.native
open class FirefoxTargetManager protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFirefoxTargetManagerMod.FirefoxTargetManager {
  def this(
    connection: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory
  ) = this()
  def this(
    connection: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory,
    targetFilterCallback: TargetFilterCallback
  ) = this()
}
