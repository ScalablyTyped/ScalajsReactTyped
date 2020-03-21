package typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The console panel renderer.
  */
trait IContentFactory
  extends typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory {
  /**
    * Create a new console panel.
    */
  def createConsole(options: typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.IOptions): CodeConsole
}

/**
  * The console renderer token.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]

