package typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel

import typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/cells/lib/model", "CodeCellModel.ContentFactory")
@js.native
class ContentFactory () extends IContentFactory {
  /**
    * Create an output area.
    */
  /* CompleteClass */
  override def createOutputArea(options: typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions): IOutputAreaModel = js.native
}

