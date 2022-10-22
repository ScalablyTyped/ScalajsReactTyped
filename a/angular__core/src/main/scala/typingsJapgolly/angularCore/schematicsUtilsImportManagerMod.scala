package typingsJapgolly.angularCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.NamedImports
import typingsJapgolly.typescript.mod.Printer
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsImportManagerMod {
  
  @JSImport("@angular/core/schematics/utils/import_manager", "ImportManager")
  @js.native
  open class ImportManager protected () extends StObject {
    def this(
      getUpdateRecorder: js.Function1[/* sf */ SourceFile, ImportManagerUpdateRecorder],
      printer: Printer
    ) = this()
    
    /**
      * Determines the full end of a given node. By default the end position of a node is
      * before all trailing comments. This could mean that generated imports shift comments.
      */
    /* private */ var _getEndPositionOfNode: Any = js.native
    
    /** Gets an unique identifier with a base name for the given source file. */
    /* private */ var _getUniqueIdentifier: Any = js.native
    
    /* private */ var _recordUsedIdentifier: Any = js.native
    
    /**
      * Adds an import to the given source-file and returns the TypeScript
      * identifier that can be used to access the newly imported symbol.
      */
    def addImportToSourceFile(sourceFile: SourceFile, symbolName: String, moduleName: String): Expression = js.native
    def addImportToSourceFile(sourceFile: SourceFile, symbolName: String, moduleName: String, typeImport: Boolean): Expression = js.native
    def addImportToSourceFile(sourceFile: SourceFile, symbolName: Null, moduleName: String): Expression = js.native
    def addImportToSourceFile(sourceFile: SourceFile, symbolName: Null, moduleName: String, typeImport: Boolean): Expression = js.native
    
    /* private */ var getUpdateRecorder: Any = js.native
    
    /**
      * Array of previously resolved symbol imports. Cache can be re-used to return
      * the same identifier without checking the source-file again.
      */
    /* private */ var importCache: Any = js.native
    
    /**
      * Checks whether the specified identifier name is used within the given
      * source file.
      */
    /* private */ var isUniqueIdentifierName: Any = js.native
    
    /* private */ var printer: Any = js.native
    
    /**
      * Stores the collected import changes within the appropriate update recorders. The
      * updated imports can only be updated *once* per source-file because previous updates
      * could otherwise shift the source-file offsets.
      */
    def recordChanges(): Unit = js.native
    
    /** Map of import declarations that need to be updated to include the given symbols. */
    /* private */ var updatedImports: Any = js.native
    
    /** Map of source-files and their previously used identifier names. */
    /* private */ var usedIdentifierNames: Any = js.native
  }
  
  trait ImportManagerUpdateRecorder extends StObject {
    
    def addNewImport(start: Double, importText: String): Unit
    
    def updateExistingImport(namedBindings: NamedImports, newNamedBindings: String): Unit
  }
  object ImportManagerUpdateRecorder {
    
    inline def apply(
      addNewImport: (Double, String) => Callback,
      updateExistingImport: (NamedImports, String) => Callback
    ): ImportManagerUpdateRecorder = {
      val __obj = js.Dynamic.literal(addNewImport = js.Any.fromFunction2((t0: Double, t1: String) => (addNewImport(t0, t1)).runNow()), updateExistingImport = js.Any.fromFunction2((t0: NamedImports, t1: String) => (updateExistingImport(t0, t1)).runNow()))
      __obj.asInstanceOf[ImportManagerUpdateRecorder]
    }
    
    extension [Self <: ImportManagerUpdateRecorder](x: Self) {
      
      inline def setAddNewImport(value: (Double, String) => Callback): Self = StObject.set(x, "addNewImport", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setUpdateExistingImport(value: (NamedImports, String) => Callback): Self = StObject.set(x, "updateExistingImport", js.Any.fromFunction2((t0: NamedImports, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
