package typingsJapgolly.jupyterlabDocmanager

import typingsJapgolly.jupyterlabDocmanager.managerMod.DocumentManager.IOptions
import typingsJapgolly.jupyterlabServices.contentsMod.Contents.IModel
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DocumentManager protected ()
    extends typingsJapgolly.jupyterlabDocmanager.managerMod.DocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class DocumentWidgetManager protected ()
    extends typingsJapgolly.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager {
    /**
      * Construct a new document widget manager.
      */
    def this(options: typingsJapgolly.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager.IOptions) = this()
  }
  
  @js.native
  class PathStatus protected ()
    extends typingsJapgolly.jupyterlabDocmanager.pathstatusMod.PathStatus {
    /**
      * Construct a new PathStatus status item.
      */
    def this(opts: typingsJapgolly.jupyterlabDocmanager.pathstatusMod.PathStatus.IOptions) = this()
  }
  
  @js.native
  class SaveHandler protected ()
    extends typingsJapgolly.jupyterlabDocmanager.savehandlerMod.SaveHandler {
    /**
      * Construct a new save handler.
      */
    def this(options: typingsJapgolly.jupyterlabDocmanager.savehandlerMod.SaveHandler.IOptions) = this()
  }
  
  @js.native
  class SavingStatus protected ()
    extends typingsJapgolly.jupyterlabDocmanager.savingstatusMod.SavingStatus {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: typingsJapgolly.jupyterlabDocmanager.savingstatusMod.SavingStatus.IOptions) = this()
  }
  
  val IDocumentManager: Token[typingsJapgolly.jupyterlabDocmanager.tokensMod.IDocumentManager] = js.native
  def isValidFileName(name: String): Boolean = js.native
  def renameDialog(manager: typingsJapgolly.jupyterlabDocmanager.tokensMod.IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
  def renameFile(
    manager: typingsJapgolly.jupyterlabDocmanager.tokensMod.IDocumentManager,
    oldPath: String,
    newPath: String
  ): js.Promise[IModel | Null] = js.native
  def shouldOverwrite(path: String): js.Promise[Boolean] = js.native
  @js.native
  object PathStatus extends js.Object {
    /**
      * A VDomModel for rendering the PathStatus status item.
      */
    @js.native
    class Model protected ()
      extends typingsJapgolly.jupyterlabDocmanager.pathstatusMod.PathStatus.Model {
      /**
        * Construct a new model.
        *
        * @param docManager: the application document manager. Used to check
        *   whether the current widget is a document.
        */
      def this(docManager: typingsJapgolly.jupyterlabDocmanager.tokensMod.IDocumentManager) = this()
    }
    
  }
  
  @js.native
  object SavingStatus extends js.Object {
    /**
      * A VDomModel for the SavingStatus item.
      */
    @js.native
    class Model protected ()
      extends typingsJapgolly.jupyterlabDocmanager.savingstatusMod.SavingStatus.Model {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: typingsJapgolly.jupyterlabDocmanager.tokensMod.IDocumentManager) = this()
    }
    
  }
  
}

