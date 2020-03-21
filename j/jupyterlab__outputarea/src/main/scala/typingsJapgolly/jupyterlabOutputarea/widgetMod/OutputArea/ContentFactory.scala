package typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea

import typingsJapgolly.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.ContentFactory")
@js.native
class ContentFactory () extends IContentFactory {
  /**
    * Create an output prompt.
    */
  /* CompleteClass */
  override def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  override def createStdin(options: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
}

