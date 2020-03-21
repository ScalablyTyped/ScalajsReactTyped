package typingsJapgolly.jupyterlabRendermime.mod

import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typingsJapgolly.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "AttachmentModel")
@js.native
class AttachmentModel protected ()
  extends typingsJapgolly.jupyterlabRendermime.attachmentmodelMod.AttachmentModel {
  /**
    * Construct a new attachment model.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/rendermime", "AttachmentModel")
@js.native
object AttachmentModel extends js.Object {
  /**
    * Get the data for an attachment.
    *
    * @params bundle - A kernel attachment MIME bundle.
    *
    * @returns - The data for the payload.
    */
  def getData(bundle: IMimeBundle): JSONObject = js.native
}

