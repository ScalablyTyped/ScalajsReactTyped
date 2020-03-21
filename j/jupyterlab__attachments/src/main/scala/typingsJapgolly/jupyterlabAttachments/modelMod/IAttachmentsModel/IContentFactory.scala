package typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an attachment content factory.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an attachment model.
    */
  def createAttachmentModel(options: typingsJapgolly.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentModel: typingsJapgolly.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions => CallbackTo[IAttachmentModel]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAttachmentModel")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions) => createAttachmentModel(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

