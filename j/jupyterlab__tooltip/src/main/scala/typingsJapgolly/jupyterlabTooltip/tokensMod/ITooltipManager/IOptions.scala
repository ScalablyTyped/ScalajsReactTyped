package typingsJapgolly.jupyterlabTooltip.tokensMod.ITooltipManager

import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for tooltip-compatible objects.
  */
trait IOptions extends js.Object {
  /**
    * The referent anchor the tooltip follows.
    */
  val anchor: Widget
  /**
    * The referent editor for the tooltip.
    */
  val editor: IEditor
  /**
    * The kernel the tooltip communicates with to populate itself.
    */
  val kernel: IKernelConnection
  /**
    * The renderer the tooltip uses to render API responses.
    */
  val rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(anchor: Widget, editor: IEditor, kernel: IKernelConnection, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

