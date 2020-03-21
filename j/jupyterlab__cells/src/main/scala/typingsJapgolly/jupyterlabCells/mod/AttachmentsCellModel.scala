package typingsJapgolly.jupyterlabCells.mod

import typingsJapgolly.jupyterlabCells.modelMod.AttachmentsCellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "AttachmentsCellModel")
@js.native
class AttachmentsCellModel protected ()
  extends typingsJapgolly.jupyterlabCells.modelMod.AttachmentsCellModel {
  /**
    * Construct a new cell with optional attachments.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "AttachmentsCellModel")
@js.native
object AttachmentsCellModel extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsJapgolly.jupyterlabCells.modelMod.AttachmentsCellModel.ContentFactory
  
  /**
    * The shared `ContentFactory` instance.
    */
  val defaultContentFactory: typingsJapgolly.jupyterlabCells.modelMod.AttachmentsCellModel.ContentFactory = js.native
}

