package typingsJapgolly.jupyterlabSharedModels

import typingsJapgolly.jupyterlabSharedModels.jupyterlabSharedModelsStrings.code
import typingsJapgolly.jupyterlabSharedModels.jupyterlabSharedModelsStrings.markdown
import typingsJapgolly.jupyterlabSharedModels.jupyterlabSharedModelsStrings.raw
import typingsJapgolly.jupyterlabSharedModels.libApiMod.ISharedBaseCellMetadata
import typingsJapgolly.jupyterlabSharedModels.libApiMod.ISharedNotebook
import typingsJapgolly.jupyterlabSharedModels.libApiMod.ISharedNotebook.IOptions
import typingsJapgolly.jupyterlabSharedModels.libApiMod.MapChange
import typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCellType
import typingsJapgolly.yjs.mod.Map
import typingsJapgolly.yjs.mod.YMapEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/shared-models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/shared-models", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.default {
    def this(options: IOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@jupyterlab/shared-models", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YNotebook.
      */
    inline def create(disableDocumentWideUndoRedo: Boolean): ISharedNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disableDocumentWideUndoRedo.asInstanceOf[js.Any]).asInstanceOf[ISharedNotebook]
  }
  
  @JSImport("@jupyterlab/shared-models", "YBaseCell")
  @js.native
  open class YBaseCell[Metadata /* <: ISharedBaseCellMetadata */] protected ()
    extends typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Metadata] {
    def this(ymodel: Map[Any]) = this()
  }
  /* static members */
  object YBaseCell {
    
    @JSImport("@jupyterlab/shared-models", "YBaseCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YRawCell that can be inserted into a YNotebook
      */
    inline def create(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any]]
    inline def create(id: String): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any]]
    
    /**
      * Create a new YRawCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any]]
    inline def createStandalone(id: String): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any]]
  }
  
  @JSImport("@jupyterlab/shared-models", "YCodeCell")
  @js.native
  open class YCodeCell protected ()
    extends typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell {
    def this(ymodel: Map[Any]) = this()
  }
  /* static members */
  object YCodeCell {
    
    @JSImport("@jupyterlab/shared-models", "YCodeCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YCodeCell that can be inserted into a YNotebook
      */
    inline def create(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell]
    inline def create(id: String): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell]
    
    /**
      * Create a new YCodeCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell]
    inline def createStandalone(id: String): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YCodeCell]
  }
  
  @JSImport("@jupyterlab/shared-models", "YDocument")
  @js.native
  open class YDocument[T] ()
    extends typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YDocument[T]
  
  @JSImport("@jupyterlab/shared-models", "YFile")
  @js.native
  open class YFile ()
    extends typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YFile
  /* static members */
  object YFile {
    
    @JSImport("@jupyterlab/shared-models", "YFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YFile]
  }
  
  @JSImport("@jupyterlab/shared-models", "YMarkdownCell")
  @js.native
  open class YMarkdownCell protected ()
    extends typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell {
    def this(ymodel: Map[Any]) = this()
  }
  /* static members */
  object YMarkdownCell {
    
    @JSImport("@jupyterlab/shared-models", "YMarkdownCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YMarkdownCell that can be inserted into a YNotebook
      */
    inline def create(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell]
    inline def create(id: String): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell]
    
    /**
      * Create a new YMarkdownCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell]
    inline def createStandalone(id: String): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell]
  }
  
  @JSImport("@jupyterlab/shared-models", "YNotebook")
  @js.native
  open class YNotebook protected ()
    extends typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YNotebook {
    def this(options: IOptions) = this()
  }
  /* static members */
  object YNotebook {
    
    @JSImport("@jupyterlab/shared-models", "YNotebook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YNotebook.
      */
    inline def create(disableDocumentWideUndoRedo: Boolean): ISharedNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disableDocumentWideUndoRedo.asInstanceOf[js.Any]).asInstanceOf[ISharedNotebook]
  }
  
  @JSImport("@jupyterlab/shared-models", "YRawCell")
  @js.native
  open class YRawCell protected ()
    extends typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell {
    def this(ymodel: Map[Any]) = this()
  }
  /* static members */
  object YRawCell {
    
    @JSImport("@jupyterlab/shared-models", "YRawCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YRawCell that can be inserted into a YNotebook
      */
    inline def create(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell]
    inline def create(id: String): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell]
    
    /**
      * Create a new YRawCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell]
    inline def createStandalone(id: String): typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabSharedModels.libYmodelsMod.YRawCell]
  }
  
  inline def convertYMapEventToMapChange(event: YMapEvent[Any]): MapChange = ^.asInstanceOf[js.Dynamic].applyDynamic("convertYMapEventToMapChange")(event.asInstanceOf[js.Any]).asInstanceOf[MapChange]
  
  inline def createCellFromType(`type`: Map[Any]): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createCellFromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[YCellType]
  
  inline def createMutex(): js.Function1[/* f */ js.Function0[Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMutex")().asInstanceOf[js.Function1[/* f */ js.Function0[Unit], Unit]]
  
  inline def createStandaloneCell(cellType: raw | code | markdown): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandaloneCell")(cellType.asInstanceOf[js.Any]).asInstanceOf[YCellType]
  inline def createStandaloneCell(cellType: raw | code | markdown, id: String): YCellType = (^.asInstanceOf[js.Dynamic].applyDynamic("createStandaloneCell")(cellType.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[YCellType]
}
