package typingsJapgolly.grammarkdown

import typingsJapgolly.grammarkdown.binderMod.Binder
import typingsJapgolly.grammarkdown.binderMod.BindingTable
import typingsJapgolly.grammarkdown.checkerMod.Checker
import typingsJapgolly.grammarkdown.checkerMod.Resolver
import typingsJapgolly.grammarkdown.diagnosticsMod.DiagnosticMessages
import typingsJapgolly.grammarkdown.emitterMod.Emitter
import typingsJapgolly.grammarkdown.hostMod.AsyncHost
import typingsJapgolly.grammarkdown.hostMod.Host
import typingsJapgolly.grammarkdown.hostMod.SyncHost
import typingsJapgolly.grammarkdown.nodesMod.SourceFile
import typingsJapgolly.grammarkdown.optionsMod.CompilerOptions
import typingsJapgolly.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/grammar", JSImport.Namespace)
@js.native
object grammarMod extends js.Object {
  @js.native
  class Grammar protected () extends js.Object {
    def this(rootNames: js.Iterable[String]) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions, host: AsyncHost) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions, host: Host) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions, host: SyncHost) = this()
    var beginParsePossiblyAsync: js.Any = js.native
    var bindPossiblyAsync: js.Any = js.native
    val binder: Binder = js.native
    var bindings: js.Any = js.native
    var checkPossiblyAsync: js.Any = js.native
    val checker: Checker = js.native
    var diagnostics: DiagnosticMessages = js.native
    var emitOnePossiblyAsync: js.Any = js.native
    var emitPossiblyAsync: js.Any = js.native
    var emitStringPossiblyAsync: js.Any = js.native
    val emitter: Emitter = js.native
    var endBind: js.Any = js.native
    var endCheck: js.Any = js.native
    var endEmitPossiblyAsync: js.Any = js.native
    var endParse: js.Any = js.native
    var endProcessFilePossiblyAsync: js.Any = js.native
    var endProcessRootFile: js.Any = js.native
    var getSourceFileNoResolve: js.Any = js.native
    val host: Host | SyncHost | AsyncHost = js.native
    var innerBinder: js.Any = js.native
    var innerChecker: js.Any = js.native
    var innerEmitter: js.Any = js.native
    var innerResolver: js.Any = js.native
    val isBound: Boolean = js.native
    val isParsed: Boolean = js.native
    var normalizeFile: js.Any = js.native
    var options: CompilerOptions = js.native
    var parsePossiblyAsync: js.Any = js.native
    var parsePromise: js.Any = js.native
    var parseState: js.Any = js.native
    var processFilePossiblyAsync: js.Any = js.native
    var processImportsPossiblyAsync: js.Any = js.native
    var processRootFilePossiblyAsync: js.Any = js.native
    var resolveFile: js.Any = js.native
    val resolver: Resolver = js.native
    val rootFiles: js.Array[SourceFile] = js.native
    var rootNames: js.Any = js.native
    var setSourceFileNoResolve: js.Any = js.native
    val sourceFiles: js.Array[SourceFile] = js.native
    var writeFileFallback: js.Any = js.native
    var writeFileSyncFallback: js.Any = js.native
    def bind(): js.Promise[Unit] = js.native
    def bind(cancellationToken: CancellationToken): js.Promise[Unit] = js.native
    def bindSync(): Unit = js.native
    def bindSync(cancellationToken: CancellationToken): Unit = js.native
    def check(): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Promise[Unit] = js.native
    def checkSync(): Unit = js.native
    def checkSync(sourceFile: SourceFile): Unit = js.native
    def checkSync(sourceFile: SourceFile, cancellationToken: CancellationToken): Unit = js.native
    /* protected */ def createBinder(options: CompilerOptions): Binder = js.native
    /* protected */ def createChecker(options: CompilerOptions): Checker = js.native
    /* protected */ def createEmitter(options: CompilerOptions): Emitter = js.native
    /* protected */ def createResolver(bindings: BindingTable): Resolver = js.native
    def emit(): js.Promise[Unit] = js.native
    def emit(sourceFile: SourceFile): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Promise[Unit]]
    ): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Promise[Unit]],
      cancellationToken: CancellationToken
    ): js.Promise[Unit] = js.native
    def emitString(sourceFile: SourceFile): js.Promise[String] = js.native
    def emitString(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Promise[String] = js.native
    def emitStringSync(sourceFile: SourceFile): String = js.native
    def emitStringSync(sourceFile: SourceFile, cancellationToken: CancellationToken): String = js.native
    def emitSync(): Unit = js.native
    def emitSync(sourceFile: SourceFile): Unit = js.native
    def emitSync(sourceFile: SourceFile, writeFile: js.Function2[/* file */ String, /* output */ String, Unit]): Unit = js.native
    def emitSync(
      sourceFile: SourceFile,
      writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
      cancellationToken: CancellationToken
    ): Unit = js.native
    def getSourceFile(file: String): js.UndefOr[SourceFile] = js.native
    def parse(): js.Promise[Unit] = js.native
    def parse(cancellationToken: CancellationToken): js.Promise[Unit] = js.native
    def parseSync(): Unit = js.native
    def parseSync(cancellationToken: CancellationToken): Unit = js.native
    /* protected */ def readFile(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    /* protected */ def readFile(file: String, cancellationToken: CancellationToken): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    /* protected */ def readFileSync(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    /* protected */ def writeFile(file: String, content: String): Unit | js.Promise[Unit] = js.native
    /* protected */ def writeFile(file: String, content: String, cancellationToken: CancellationToken): Unit | js.Promise[Unit] = js.native
    /* protected */ def writeFileSync(file: String, content: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Grammar extends js.Object {
    def convert(content: String): String = js.native
    def convert(content: String, options: CompilerOptions): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost): String = js.native
    def convert(
      content: String,
      options: CompilerOptions,
      hostFallback: AsyncHost,
      cancellationToken: CancellationToken
    ): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: Host): String = js.native
    def convert(
      content: String,
      options: CompilerOptions,
      hostFallback: Host,
      cancellationToken: CancellationToken
    ): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: SyncHost): String = js.native
    def convert(
      content: String,
      options: CompilerOptions,
      hostFallback: SyncHost,
      cancellationToken: CancellationToken
    ): String = js.native
  }
  
}

