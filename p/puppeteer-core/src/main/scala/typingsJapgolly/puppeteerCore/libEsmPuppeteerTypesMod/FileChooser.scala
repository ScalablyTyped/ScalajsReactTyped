package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "FileChooser")
@js.native
open class FileChooser protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFileChooserMod.FileChooser {
  /**
    * @internal
    */
  def this(
    element: typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonElementHandleMod.ElementHandle[HTMLInputElement],
    event: FileChooserOpenedEvent
  ) = this()
}
