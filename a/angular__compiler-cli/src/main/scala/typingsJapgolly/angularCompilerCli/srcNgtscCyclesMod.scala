package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscCyclesMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "Cycle")
  @js.native
  open class Cycle protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscCyclesSrcAnalyzerMod.Cycle {
    def this(
      importGraph: typingsJapgolly.angularCompilerCli.srcNgtscCyclesSrcImportsMod.ImportGraph,
      from: SourceFile,
      to: SourceFile
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "CycleAnalyzer")
  @js.native
  open class CycleAnalyzer protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscCyclesSrcAnalyzerMod.CycleAnalyzer {
    def this(importGraph: typingsJapgolly.angularCompilerCli.srcNgtscCyclesSrcImportsMod.ImportGraph) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/cycles", "ImportGraph")
  @js.native
  open class ImportGraph protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscCyclesSrcImportsMod.ImportGraph {
    def this(checker: TypeChecker, perf: PerfRecorder) = this()
  }
}
