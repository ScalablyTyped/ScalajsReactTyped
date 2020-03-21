package typingsJapgolly.jupyterlabCells.mod

import typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCellModel")
@js.native
class CodeCellModel protected ()
  extends typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel {
  /**
    * Construct a new code cell with optional original cell content.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "CodeCellModel")
@js.native
object CodeCellModel extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.ContentFactory
  
  /**
    * The shared `ContentFactory` instance.
    */
  val defaultContentFactory: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.ContentFactory = js.native
}

