package typingsJapgolly.jupyterlabDocregistry

import typingsJapgolly.jupyterlabDocregistry.contextMod.Context.IOptions
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends typingsJapgolly.jupyterlabDocregistry.defaultMod.ABCWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
  }
  
  @js.native
  class Base64ModelFactory ()
    extends typingsJapgolly.jupyterlabDocregistry.defaultMod.Base64ModelFactory
  
  @js.native
  class Context[T /* <: IModel */] protected ()
    extends typingsJapgolly.jupyterlabDocregistry.contextMod.Context[T] {
    /**
      * Construct a new document context.
      */
    def this(options: IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new document model.
    */
  class DocumentModel ()
    extends typingsJapgolly.jupyterlabDocregistry.defaultMod.DocumentModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
  }
  
  @js.native
  /**
    * Construct a new document registry.
    */
  class DocumentRegistry ()
    extends typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry {
    def this(options: typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IOptions) = this()
  }
  
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
    extends typingsJapgolly.jupyterlabDocregistry.defaultMod.DocumentWidget[T, U] {
    def this(options: typingsJapgolly.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[T, U]) = this()
  }
  
  @js.native
  class MimeContent protected ()
    extends typingsJapgolly.jupyterlabDocregistry.mimedocumentMod.MimeContent {
    /**
      * Construct a new widget.
      */
    def this(options: typingsJapgolly.jupyterlabDocregistry.mimedocumentMod.MimeContent.IOptions) = this()
  }
  
  @js.native
  class MimeDocument ()
    extends typingsJapgolly.jupyterlabDocregistry.mimedocumentMod.MimeDocument
  
  @js.native
  class MimeDocumentFactory protected ()
    extends typingsJapgolly.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typingsJapgolly.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[typingsJapgolly.jupyterlabDocregistry.mimedocumentMod.MimeDocument]) = this()
  }
  
  @js.native
  class TextModelFactory ()
    extends typingsJapgolly.jupyterlabDocregistry.defaultMod.TextModelFactory
  
  @js.native
  object DocumentRegistry extends js.Object {
    /**
      * The default directory file type used by the document registry.
      */
    val defaultDirectoryFileType: IFileType = js.native
    /**
      * The default file types used by the document registry.
      */
    val defaultFileTypes: js.Array[PartialIFileType] = js.native
    /**
      * The default notebook file type used by the document registry.
      */
    val defaultNotebookFileType: IFileType = js.native
    /**
      * The default text file type used by the document registry.
      */
    val defaultTextFileType: IFileType = js.native
    /**
      * The defaults used for a file type.
      */
    val fileTypeDefaults: IFileType = js.native
  }
  
}

