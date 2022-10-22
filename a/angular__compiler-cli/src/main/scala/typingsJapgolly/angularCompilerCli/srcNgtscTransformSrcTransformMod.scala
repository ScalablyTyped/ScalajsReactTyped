package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.DefaultImportTracker
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcCompilationMod.TraitCompiler
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTransformSrcTransformMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ivyTransformFactory(
    compilation: TraitCompiler,
    reflector: ReflectionHost,
    importRewriter: ImportRewriter,
    defaultImportTracker: DefaultImportTracker,
    perf: PerfRecorder,
    isCore: Boolean,
    isClosureCompilerEnabled: Boolean
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("ivyTransformFactory")(compilation.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any], defaultImportTracker.asInstanceOf[js.Any], perf.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], isClosureCompilerEnabled.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
