package typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating code cell model content.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output area.
    */
  def createOutputArea(options: typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions): IOutputAreaModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputArea: typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions => CallbackTo[IOutputAreaModel]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createOutputArea")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions) => createOutputArea(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

