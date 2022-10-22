package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.angularCompilerCliInts.`0`
import typingsJapgolly.angularCompilerCli.angularCompilerCliInts.`1`
import typingsJapgolly.angularCompilerCli.srcNgtscCyclesSrcImportsMod.ImportGraph
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscCyclesSrcAnalyzerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles/src/analyzer", "Cycle")
  @js.native
  open class Cycle protected () extends StObject {
    def this(importGraph: ImportGraph, from: SourceFile, to: SourceFile) = this()
    
    val from: SourceFile = js.native
    
    /**
      * Compute an array of source-files that illustrates the cyclic path between `from` and `to`.
      *
      * Note that a `Cycle` will not be created unless a path is available between `to` and `from`,
      * so `findPath()` will never return `null`.
      */
    def getPath(): js.Array[SourceFile] = js.native
    
    /* private */ var importGraph: Any = js.native
    
    val to: SourceFile = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles/src/analyzer", "CycleAnalyzer")
  @js.native
  open class CycleAnalyzer protected () extends StObject {
    def this(importGraph: ImportGraph) = this()
    
    /**
      * Cycle detection is requested with the same `from` source file for all used directives and pipes
      * within a component, which makes it beneficial to cache the results as long as the `from` source
      * file has not changed. This avoids visiting the import graph that is reachable from multiple
      * directives/pipes more than once.
      */
    /* private */ var cachedResults: Any = js.native
    
    /* private */ var importGraph: Any = js.native
    
    /**
      * Record a synthetic import from `from` to `to`.
      *
      * This is an import that doesn't exist in the `ts.Program` but will be considered as part of the
      * import graph for cycle creation.
      */
    def recordSyntheticImport(from: SourceFile, to: SourceFile): Unit = js.native
    
    /**
      * Check for a cycle to be created in the `ts.Program` by adding an import between `from` and
      * `to`.
      *
      * @returns a `Cycle` object if an import between `from` and `to` would create a cycle; `null`
      *     otherwise.
      */
    def wouldCreateCycle(from: SourceFile, to: SourceFile): Cycle | Null = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCompilerCli.angularCompilerCliInts.`0`
    - typingsJapgolly.angularCompilerCli.angularCompilerCliInts.`1`
  */
  trait CycleHandlingStrategy extends StObject
  object CycleHandlingStrategy {
    
    /** Fail the compilation with an error. */
    inline def Error: `1` = 1.asInstanceOf[`1`]
    
    /** Add "remote scoping" code to avoid creating a cycle. */
    inline def UseRemoteScoping: `0` = 0.asInstanceOf[`0`]
  }
}
