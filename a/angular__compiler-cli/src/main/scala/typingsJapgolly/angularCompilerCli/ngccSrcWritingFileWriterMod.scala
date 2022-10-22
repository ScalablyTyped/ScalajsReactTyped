package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointBundleMod.EntryPointBundle
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPoint
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPointJsonProperty
import typingsJapgolly.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcWritingFileWriterMod {
  
  trait FileWriter extends StObject {
    
    /**
      * Revert the changes to an entry-point processed for the specified format-properties by the same
      * `FileWriter` implementation.
      *
      * @param entryPoint The entry-point to revert.
      * @param transformedFilePaths The original paths of the transformed files. (The transformed files
      *     may be written at the same or a different location, depending on the `FileWriter`
      *     implementation.)
      * @param formatProperties The format-properties pointing to the entry-point.
      */
    def revertBundle(
      entryPoint: EntryPoint,
      transformedFilePaths: js.Array[AbsoluteFsPath],
      formatProperties: js.Array[EntryPointJsonProperty]
    ): Unit
    
    def writeBundle(
      bundle: EntryPointBundle,
      transformedFiles: js.Array[FileToWrite],
      formatProperties: js.Array[EntryPointJsonProperty]
    ): Unit
  }
  object FileWriter {
    
    inline def apply(
      revertBundle: (EntryPoint, js.Array[AbsoluteFsPath], js.Array[EntryPointJsonProperty]) => Callback,
      writeBundle: (EntryPointBundle, js.Array[FileToWrite], js.Array[EntryPointJsonProperty]) => Callback
    ): FileWriter = {
      val __obj = js.Dynamic.literal(revertBundle = js.Any.fromFunction3((t0: EntryPoint, t1: js.Array[AbsoluteFsPath], t2: js.Array[EntryPointJsonProperty]) => (revertBundle(t0, t1, t2)).runNow()), writeBundle = js.Any.fromFunction3((t0: EntryPointBundle, t1: js.Array[FileToWrite], t2: js.Array[EntryPointJsonProperty]) => (writeBundle(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[FileWriter]
    }
    
    extension [Self <: FileWriter](x: Self) {
      
      inline def setRevertBundle(value: (EntryPoint, js.Array[AbsoluteFsPath], js.Array[EntryPointJsonProperty]) => Callback): Self = StObject.set(x, "revertBundle", js.Any.fromFunction3((t0: EntryPoint, t1: js.Array[AbsoluteFsPath], t2: js.Array[EntryPointJsonProperty]) => (value(t0, t1, t2)).runNow()))
      
      inline def setWriteBundle(value: (EntryPointBundle, js.Array[FileToWrite], js.Array[EntryPointJsonProperty]) => Callback): Self = StObject.set(x, "writeBundle", js.Any.fromFunction3((t0: EntryPointBundle, t1: js.Array[FileToWrite], t2: js.Array[EntryPointJsonProperty]) => (value(t0, t1, t2)).runNow()))
    }
  }
}
