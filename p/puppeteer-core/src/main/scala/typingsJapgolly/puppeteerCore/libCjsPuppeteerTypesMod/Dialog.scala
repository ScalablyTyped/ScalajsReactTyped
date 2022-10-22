package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.DialogType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Dialog")
@js.native
open class Dialog protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonDialogMod.Dialog {
  /**
    * @internal
    */
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    `type`: DialogType,
    message: String
  ) = this()
  def this(
    client: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    `type`: DialogType,
    message: String,
    defaultValue: String
  ) = this()
}
