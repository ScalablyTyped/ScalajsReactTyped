package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompilerCli.anon.FirstCompileResult
import typingsJapgolly.angularCompilerCli.anon.`0`
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.TsEmitCallback
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPerformWatchMod {
  
  @JSImport("@angular/compiler-cli/src/perform_watch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FileChangeEvent extends StObject
  @JSImport("@angular/compiler-cli/src/perform_watch", "FileChangeEvent")
  @js.native
  object FileChangeEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileChangeEvent & Double] = js.native
    
    @js.native
    sealed trait Change
      extends StObject
         with FileChangeEvent
    /* 0 */ val Change: typingsJapgolly.angularCompilerCli.srcPerformWatchMod.FileChangeEvent.Change & Double = js.native
    
    @js.native
    sealed trait CreateDelete
      extends StObject
         with FileChangeEvent
    /* 1 */ val CreateDelete: typingsJapgolly.angularCompilerCli.srcPerformWatchMod.FileChangeEvent.CreateDelete & Double = js.native
    
    @js.native
    sealed trait CreateDeleteDir
      extends StObject
         with FileChangeEvent
    /* 2 */ val CreateDeleteDir: typingsJapgolly.angularCompilerCli.srcPerformWatchMod.FileChangeEvent.CreateDeleteDir & Double = js.native
  }
  
  inline def createPerformWatchHost(
    configFileName: String,
    reportDiagnostics: js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit]
  ): PerformWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformWatchHost")(configFileName.asInstanceOf[js.Any], reportDiagnostics.asInstanceOf[js.Any])).asInstanceOf[PerformWatchHost]
  inline def createPerformWatchHost(
    configFileName: String,
    reportDiagnostics: js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit],
    existingOptions: Unit,
    createEmitCallback: js.Function1[/* options */ CompilerOptions, js.UndefOr[TsEmitCallback]]
  ): PerformWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformWatchHost")(configFileName.asInstanceOf[js.Any], reportDiagnostics.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], createEmitCallback.asInstanceOf[js.Any])).asInstanceOf[PerformWatchHost]
  inline def createPerformWatchHost(
    configFileName: String,
    reportDiagnostics: js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit],
    existingOptions: typingsJapgolly.typescript.mod.CompilerOptions
  ): PerformWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformWatchHost")(configFileName.asInstanceOf[js.Any], reportDiagnostics.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any])).asInstanceOf[PerformWatchHost]
  inline def createPerformWatchHost(
    configFileName: String,
    reportDiagnostics: js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit],
    existingOptions: typingsJapgolly.typescript.mod.CompilerOptions,
    createEmitCallback: js.Function1[/* options */ CompilerOptions, js.UndefOr[TsEmitCallback]]
  ): PerformWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformWatchHost")(configFileName.asInstanceOf[js.Any], reportDiagnostics.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], createEmitCallback.asInstanceOf[js.Any])).asInstanceOf[PerformWatchHost]
  
  inline def performWatchCompilation(host: PerformWatchHost): FirstCompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("performWatchCompilation")(host.asInstanceOf[js.Any]).asInstanceOf[FirstCompileResult]
  
  trait PerformWatchHost extends StObject {
    
    def clearTimeout(timeoutId: Any): Unit
    
    def createCompilerHost(options: CompilerOptions): CompilerHost
    
    def createEmitCallback(options: CompilerOptions): js.UndefOr[TsEmitCallback]
    
    def onFileChange(
      options: CompilerOptions,
      listener: js.Function2[/* event */ FileChangeEvent, /* fileName */ String, Unit],
      ready: js.Function0[Unit]
    ): `0`
    
    def readConfiguration(): ParsedConfiguration
    
    def reportDiagnostics(diagnostics: js.Array[Diagnostic]): Unit
    
    def setTimeout(callback: js.Function0[Unit], ms: Double): Any
  }
  object PerformWatchHost {
    
    inline def apply(
      clearTimeout: Any => Callback,
      createCompilerHost: CompilerOptions => CompilerHost,
      createEmitCallback: CompilerOptions => js.UndefOr[TsEmitCallback],
      onFileChange: (CompilerOptions, js.Function2[/* event */ FileChangeEvent, /* fileName */ String, Unit], js.Function0[Unit]) => `0`,
      readConfiguration: CallbackTo[ParsedConfiguration],
      reportDiagnostics: js.Array[Diagnostic] => Callback,
      setTimeout: (js.Function0[Unit], Double) => Any
    ): PerformWatchHost = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1((t0: Any) => clearTimeout(t0).runNow()), createCompilerHost = js.Any.fromFunction1(createCompilerHost), createEmitCallback = js.Any.fromFunction1(createEmitCallback), onFileChange = js.Any.fromFunction3(onFileChange), readConfiguration = readConfiguration.toJsFn, reportDiagnostics = js.Any.fromFunction1((t0: js.Array[Diagnostic]) => reportDiagnostics(t0).runNow()), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[PerformWatchHost]
    }
    
    extension [Self <: PerformWatchHost](x: Self) {
      
      inline def setClearTimeout(value: Any => Callback): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setCreateCompilerHost(value: CompilerOptions => CompilerHost): Self = StObject.set(x, "createCompilerHost", js.Any.fromFunction1(value))
      
      inline def setCreateEmitCallback(value: CompilerOptions => js.UndefOr[TsEmitCallback]): Self = StObject.set(x, "createEmitCallback", js.Any.fromFunction1(value))
      
      inline def setOnFileChange(
        value: (CompilerOptions, js.Function2[/* event */ FileChangeEvent, /* fileName */ String, Unit], js.Function0[Unit]) => `0`
      ): Self = StObject.set(x, "onFileChange", js.Any.fromFunction3(value))
      
      inline def setReadConfiguration(value: CallbackTo[ParsedConfiguration]): Self = StObject.set(x, "readConfiguration", value.toJsFn)
      
      inline def setReportDiagnostics(value: js.Array[Diagnostic] => Callback): Self = StObject.set(x, "reportDiagnostics", js.Any.fromFunction1((t0: js.Array[Diagnostic]) => value(t0).runNow()))
      
      inline def setSetTimeout(value: (js.Function0[Unit], Double) => Any): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
    }
  }
}
