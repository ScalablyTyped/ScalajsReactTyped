package typingsJapgolly.jupyterlabMarkdownviewer

import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabMarkdownviewer.widgetMod.MarkdownDocument
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val IMarkdownViewerTracker: Token[typingsJapgolly.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker] = js.native
  type IMarkdownViewerTracker = IWidgetTracker[MarkdownDocument]
}

