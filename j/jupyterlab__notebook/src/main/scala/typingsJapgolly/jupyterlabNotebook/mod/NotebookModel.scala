package typingsJapgolly.jupyterlabNotebook.mod

import typingsJapgolly.jupyterlabNotebook.modelMod.NotebookModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookModel")
@js.native
/**
  * Construct a new notebook model.
  */
class NotebookModel ()
  extends typingsJapgolly.jupyterlabNotebook.modelMod.NotebookModel {
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/notebook", "NotebookModel")
@js.native
object NotebookModel extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory protected ()
    extends typingsJapgolly.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory {
    /**
      * Create a new cell model factory.
      */
    def this(options: typingsJapgolly.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory.IOptions) = this()
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: typingsJapgolly.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory = js.native
  /**
    * A namespace for the notebook model content factory.
    */
  @js.native
  object ContentFactory extends js.Object
  
}

