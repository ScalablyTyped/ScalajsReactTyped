package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscProgramDriverSrcApiMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver/src/api", "NgOriginalFile")
  @js.native
  val NgOriginalFile: js.Symbol = js.native
  
  @js.native
  sealed trait UpdateMode extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver/src/api", "UpdateMode")
  @js.native
  object UpdateMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UpdateMode & Double] = js.native
    
    /**
      * A complete update creates a completely new overlay of type-checking code on top of the user's
      * original program, which doesn't include type-checking code from previous calls to
      * `updateFiles`.
      */
    @js.native
    sealed trait Complete
      extends StObject
         with UpdateMode
    /* 0 */ val Complete: typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode.Complete & Double = js.native
    
    /**
      * An incremental update changes the contents of some files in the type-checking program without
      * reverting any prior changes.
      */
    @js.native
    sealed trait Incremental
      extends StObject
         with UpdateMode
    /* 1 */ val Incremental: typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode.Incremental & Double = js.native
  }
  
  trait FileUpdate extends StObject {
    
    /**
      * The source file text.
      */
    var newText: String
    
    /**
      * Represents the source file from the original program that is being updated. If the file update
      * targets a shim file then this is null, as shim files do not have an associated original file.
      */
    var originalFile: SourceFile | Null
  }
  object FileUpdate {
    
    inline def apply(newText: String): FileUpdate = {
      val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], originalFile = null)
      __obj.asInstanceOf[FileUpdate]
    }
    
    extension [Self <: FileUpdate](x: Self) {
      
      inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      inline def setOriginalFile(value: SourceFile): Self = StObject.set(x, "originalFile", value.asInstanceOf[js.Any])
      
      inline def setOriginalFileNull: Self = StObject.set(x, "originalFile", null)
    }
  }
  
  @js.native
  trait MaybeSourceFileWithOriginalFile
    extends StObject
       with SourceFile
  
  trait ProgramDriver extends StObject {
    
    /**
      * Retrieve the latest version of the program, containing all the updates made thus far.
      */
    def getProgram(): Program
    
    /**
      * Retrieve a string version for a given `ts.SourceFile`, which much change when the contents of
      * the file have changed.
      *
      * If this method is present, the compiler will use these versions in addition to object identity
      * for `ts.SourceFile`s to determine what's changed between two incremental programs. This is
      * valuable for some clients (such as the Language Service) that treat `ts.SourceFile`s as mutable
      * objects.
      */
    var getSourceFileVersion: js.UndefOr[js.Function1[/* sf */ SourceFile, String]] = js.undefined
    
    /**
      * Whether this strategy supports modifying user files (inline modifications) in addition to
      * modifying type-checking shims.
      */
    val supportsInlineOperations: Boolean
    
    /**
      * Incorporate a set of changes to either augment or completely replace the type-checking code
      * included in the type-checking program.
      */
    def updateFiles(contents: Map[AbsoluteFsPath, FileUpdate], updateMode: UpdateMode): Unit
  }
  object ProgramDriver {
    
    inline def apply(
      getProgram: CallbackTo[Program],
      supportsInlineOperations: Boolean,
      updateFiles: (Map[AbsoluteFsPath, FileUpdate], UpdateMode) => Callback
    ): ProgramDriver = {
      val __obj = js.Dynamic.literal(getProgram = getProgram.toJsFn, supportsInlineOperations = supportsInlineOperations.asInstanceOf[js.Any], updateFiles = js.Any.fromFunction2((t0: Map[AbsoluteFsPath, FileUpdate], t1: UpdateMode) => (updateFiles(t0, t1)).runNow()))
      __obj.asInstanceOf[ProgramDriver]
    }
    
    extension [Self <: ProgramDriver](x: Self) {
      
      inline def setGetProgram(value: CallbackTo[Program]): Self = StObject.set(x, "getProgram", value.toJsFn)
      
      inline def setGetSourceFileVersion(value: /* sf */ SourceFile => String): Self = StObject.set(x, "getSourceFileVersion", js.Any.fromFunction1(value))
      
      inline def setGetSourceFileVersionUndefined: Self = StObject.set(x, "getSourceFileVersion", js.undefined)
      
      inline def setSupportsInlineOperations(value: Boolean): Self = StObject.set(x, "supportsInlineOperations", value.asInstanceOf[js.Any])
      
      inline def setUpdateFiles(value: (Map[AbsoluteFsPath, FileUpdate], UpdateMode) => Callback): Self = StObject.set(x, "updateFiles", js.Any.fromFunction2((t0: Map[AbsoluteFsPath, FileUpdate], t1: UpdateMode) => (value(t0, t1)).runNow()))
    }
  }
}
