package typingsJapgolly.jupyterlabCells.modelMod.AttachmentsCellModel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel
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
  def createAttachmentsModel(options: typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions): IAttachmentsModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentsModel: typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => CallbackTo[IAttachmentsModel]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAttachmentsModel")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions) => createAttachmentsModel(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

