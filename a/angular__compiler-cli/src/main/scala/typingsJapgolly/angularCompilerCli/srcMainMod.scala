package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.Close
import typingsJapgolly.angularCompilerCli.anon.ExitCode
import typingsJapgolly.angularCompilerCli.anon.Program
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CustomTransformers
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.EmitFlags
import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMainMod {
  
  @JSImport("@angular/compiler-cli/src/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def main(
    args: js.Array[String],
    consoleError: js.UndefOr[js.Function1[/* s */ String, Unit]],
    config: js.UndefOr[NgcParsedConfiguration],
    customTransformers: js.UndefOr[CustomTransformers],
    programReuse: js.UndefOr[Program],
    modifiedResourceFiles: js.UndefOr[Set[String] | Null],
    tsickle: js.UndefOr[TsickleModule]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any], consoleError.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customTransformers.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mainDiagnosticsForTest(args: js.Array[String]): ExitCode = ^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any]).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: Unit,
    programReuse: Unit,
    modifiedResourceFiles: Null,
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: Unit,
    programReuse: Unit,
    modifiedResourceFiles: Unit,
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(args: js.Array[String], config: Unit, programReuse: Unit, modifiedResourceFiles: Set[String]): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: Unit,
    programReuse: Unit,
    modifiedResourceFiles: Set[String],
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(args: js.Array[String], config: Unit, programReuse: Program): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: Unit,
    programReuse: Program,
    modifiedResourceFiles: Null,
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: Unit,
    programReuse: Program,
    modifiedResourceFiles: Unit,
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(args: js.Array[String], config: Unit, programReuse: Program, modifiedResourceFiles: Set[String]): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: Unit,
    programReuse: Program,
    modifiedResourceFiles: Set[String],
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(args: js.Array[String], config: NgcParsedConfiguration): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: NgcParsedConfiguration,
    programReuse: Unit,
    modifiedResourceFiles: Null,
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: NgcParsedConfiguration,
    programReuse: Unit,
    modifiedResourceFiles: Unit,
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: NgcParsedConfiguration,
    programReuse: Unit,
    modifiedResourceFiles: Set[String]
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: NgcParsedConfiguration,
    programReuse: Unit,
    modifiedResourceFiles: Set[String],
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(args: js.Array[String], config: NgcParsedConfiguration, programReuse: Program): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: NgcParsedConfiguration,
    programReuse: Program,
    modifiedResourceFiles: Null,
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: NgcParsedConfiguration,
    programReuse: Program,
    modifiedResourceFiles: Unit,
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: NgcParsedConfiguration,
    programReuse: Program,
    modifiedResourceFiles: Set[String]
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  inline def mainDiagnosticsForTest(
    args: js.Array[String],
    config: NgcParsedConfiguration,
    programReuse: Program,
    modifiedResourceFiles: Set[String],
    tsickle: TsickleModule
  ): ExitCode = (^.asInstanceOf[js.Dynamic].applyDynamic("mainDiagnosticsForTest")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], programReuse.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], tsickle.asInstanceOf[js.Any])).asInstanceOf[ExitCode]
  
  inline def readCommandLineAndConfiguration(args: js.Array[String]): ParsedConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("readCommandLineAndConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[ParsedConfiguration]
  inline def readCommandLineAndConfiguration(args: js.Array[String], existingOptions: Unit, ngCmdLineOptions: js.Array[String]): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readCommandLineAndConfiguration")(args.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], ngCmdLineOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  inline def readCommandLineAndConfiguration(args: js.Array[String], existingOptions: CompilerOptions): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readCommandLineAndConfiguration")(args.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  inline def readCommandLineAndConfiguration(args: js.Array[String], existingOptions: CompilerOptions, ngCmdLineOptions: js.Array[String]): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readCommandLineAndConfiguration")(args.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], ngCmdLineOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  
  inline def readNgcCommandLineAndConfiguration(args: js.Array[String]): NgcParsedConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("readNgcCommandLineAndConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[NgcParsedConfiguration]
  
  inline def watchMode(project: String, options: CompilerOptions, consoleError: js.Function1[/* s */ String, Unit]): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("watchMode")(project.asInstanceOf[js.Any], options.asInstanceOf[js.Any], consoleError.asInstanceOf[js.Any])).asInstanceOf[Close]
  
  trait NgcParsedConfiguration
    extends StObject
       with ParsedConfiguration {
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object NgcParsedConfiguration {
    
    inline def apply(
      emitFlags: EmitFlags,
      errors: js.Array[Diagnostic],
      options: CompilerOptions,
      project: String,
      rootNames: js.Array[String]
    ): NgcParsedConfiguration = {
      val __obj = js.Dynamic.literal(emitFlags = emitFlags.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgcParsedConfiguration]
    }
    
    extension [Self <: NgcParsedConfiguration](x: Self) {
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type TsickleModule = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_tsickle */ Any
}
