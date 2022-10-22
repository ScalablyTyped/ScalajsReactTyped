package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompilerCli.anon.FileName
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalApiMod {
  
  trait DependencyTracker[T /* <: FileName */] extends StObject {
    
    /**
      * Record that the file `from` depends on the file `on`.
      */
    def addDependency(from: T, on: T): Unit
    
    /**
      * Record that the file `from` depends on the resource file `on`.
      */
    def addResourceDependency(from: T, on: AbsoluteFsPath): Unit
    
    /**
      * Record that the given file contains unresolvable dependencies.
      *
      * In practice, this means that the dependency graph cannot provide insight into the effects of
      * future changes on that file.
      */
    def recordDependencyAnalysisFailure(file: T): Unit
  }
  object DependencyTracker {
    
    inline def apply[T /* <: FileName */](
      addDependency: (T, T) => Callback,
      addResourceDependency: (T, AbsoluteFsPath) => Callback,
      recordDependencyAnalysisFailure: T => Callback
    ): DependencyTracker[T] = {
      val __obj = js.Dynamic.literal(addDependency = js.Any.fromFunction2((t0: T, t1: T) => (addDependency(t0, t1)).runNow()), addResourceDependency = js.Any.fromFunction2((t0: T, t1: AbsoluteFsPath) => (addResourceDependency(t0, t1)).runNow()), recordDependencyAnalysisFailure = js.Any.fromFunction1((t0: T) => recordDependencyAnalysisFailure(t0).runNow()))
      __obj.asInstanceOf[DependencyTracker[T]]
    }
    
    extension [Self <: DependencyTracker[?], T /* <: FileName */](x: Self & DependencyTracker[T]) {
      
      inline def setAddDependency(value: (T, T) => Callback): Self = StObject.set(x, "addDependency", js.Any.fromFunction2((t0: T, t1: T) => (value(t0, t1)).runNow()))
      
      inline def setAddResourceDependency(value: (T, AbsoluteFsPath) => Callback): Self = StObject.set(x, "addResourceDependency", js.Any.fromFunction2((t0: T, t1: AbsoluteFsPath) => (value(t0, t1)).runNow()))
      
      inline def setRecordDependencyAnalysisFailure(value: T => Callback): Self = StObject.set(x, "recordDependencyAnalysisFailure", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  trait IncrementalBuild[AnalysisT, FileTypeCheckDataT] extends StObject {
    
    /**
      * Retrieve the prior analysis work, if any, done for the given source file.
      */
    def priorAnalysisFor(sf: SourceFile): js.Array[AnalysisT] | Null
    
    /**
      * Retrieve the prior type-checking work, if any, that's been done for the given source file.
      */
    def priorTypeCheckingResultsFor(fileSf: SourceFile): FileTypeCheckDataT | Null
    
    /**
      * Reports that template type-checking has completed successfully, with a map of type-checking
      * data for each user file which can be reused in a future incremental iteration.
      */
    def recordSuccessfulTypeCheck(results: Map[AbsoluteFsPath, FileTypeCheckDataT]): Unit
  }
  object IncrementalBuild {
    
    inline def apply[AnalysisT, FileTypeCheckDataT](
      priorAnalysisFor: SourceFile => js.Array[AnalysisT] | Null,
      priorTypeCheckingResultsFor: SourceFile => FileTypeCheckDataT | Null,
      recordSuccessfulTypeCheck: Map[AbsoluteFsPath, FileTypeCheckDataT] => Callback
    ): IncrementalBuild[AnalysisT, FileTypeCheckDataT] = {
      val __obj = js.Dynamic.literal(priorAnalysisFor = js.Any.fromFunction1(priorAnalysisFor), priorTypeCheckingResultsFor = js.Any.fromFunction1(priorTypeCheckingResultsFor), recordSuccessfulTypeCheck = js.Any.fromFunction1((t0: Map[AbsoluteFsPath, FileTypeCheckDataT]) => recordSuccessfulTypeCheck(t0).runNow()))
      __obj.asInstanceOf[IncrementalBuild[AnalysisT, FileTypeCheckDataT]]
    }
    
    extension [Self <: IncrementalBuild[?, ?], AnalysisT, FileTypeCheckDataT](x: Self & (IncrementalBuild[AnalysisT, FileTypeCheckDataT])) {
      
      inline def setPriorAnalysisFor(value: SourceFile => js.Array[AnalysisT] | Null): Self = StObject.set(x, "priorAnalysisFor", js.Any.fromFunction1(value))
      
      inline def setPriorTypeCheckingResultsFor(value: SourceFile => FileTypeCheckDataT | Null): Self = StObject.set(x, "priorTypeCheckingResultsFor", js.Any.fromFunction1(value))
      
      inline def setRecordSuccessfulTypeCheck(value: Map[AbsoluteFsPath, FileTypeCheckDataT] => Callback): Self = StObject.set(x, "recordSuccessfulTypeCheck", js.Any.fromFunction1((t0: Map[AbsoluteFsPath, FileTypeCheckDataT]) => value(t0).runNow()))
    }
  }
}
