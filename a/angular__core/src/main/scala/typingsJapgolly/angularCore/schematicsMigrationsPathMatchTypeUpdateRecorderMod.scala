package typingsJapgolly.angularCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCore.schematicsUtilsImportManagerMod.ImportManagerUpdateRecorder
import typingsJapgolly.typescript.mod.NamedImports
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsMigrationsPathMatchTypeUpdateRecorderMod {
  
  trait UpdateRecorder
    extends StObject
       with ImportManagerUpdateRecorder {
    
    def commitUpdate(): Unit
    
    def updateNode(oldNode: VariableDeclaration, newNode: VariableDeclaration, sourceFile: SourceFile): Unit
  }
  object UpdateRecorder {
    
    inline def apply(
      addNewImport: (Double, String) => Callback,
      commitUpdate: Callback,
      updateExistingImport: (NamedImports, String) => Callback,
      updateNode: (VariableDeclaration, VariableDeclaration, SourceFile) => Callback
    ): UpdateRecorder = {
      val __obj = js.Dynamic.literal(addNewImport = js.Any.fromFunction2((t0: Double, t1: String) => (addNewImport(t0, t1)).runNow()), commitUpdate = commitUpdate.toJsFn, updateExistingImport = js.Any.fromFunction2((t0: NamedImports, t1: String) => (updateExistingImport(t0, t1)).runNow()), updateNode = js.Any.fromFunction3((t0: VariableDeclaration, t1: VariableDeclaration, t2: SourceFile) => (updateNode(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[UpdateRecorder]
    }
    
    extension [Self <: UpdateRecorder](x: Self) {
      
      inline def setCommitUpdate(value: Callback): Self = StObject.set(x, "commitUpdate", value.toJsFn)
      
      inline def setUpdateNode(value: (VariableDeclaration, VariableDeclaration, SourceFile) => Callback): Self = StObject.set(x, "updateNode", js.Any.fromFunction3((t0: VariableDeclaration, t1: VariableDeclaration, t2: SourceFile) => (value(t0, t1, t2)).runNow()))
    }
  }
}
