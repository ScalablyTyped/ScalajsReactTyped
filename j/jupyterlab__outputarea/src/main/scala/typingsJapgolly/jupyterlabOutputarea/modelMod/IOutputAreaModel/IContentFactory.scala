package typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabRendermime.outputmodelMod.IOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an output content factory.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output model.
    */
  def createOutputModel(options: typingsJapgolly.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions): IOutputModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputModel: typingsJapgolly.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions => CallbackTo[IOutputModel]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createOutputModel")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions) => createOutputModel(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

