package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Set
import typingsJapgolly.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractLibraryPlugin[T] extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  def chunkHash(chunk: Chunk, hash: Hash, chunkHashContext: ChunkHashContext, libraryContext: LibraryContext[T]): Unit
  
  def embedInRuntimeBailout(module: Module, renderContext: RenderContext, libraryContext: LibraryContext[T]): js.UndefOr[String]
  
  def finishEntryModule(module: Module, entryName: String, libraryContext: LibraryContext[T]): Unit
  
  def parseOptions(library: LibraryOptions): `false` | T
  
  def render(source: Source, renderContext: RenderContext, libraryContext: LibraryContext[T]): Source
  
  def renderStartup(
    source: Source,
    module: Module,
    renderContext: StartupRenderContext,
    libraryContext: LibraryContext[T]
  ): Source
  
  def runtimeRequirements(chunk: Chunk, set: Set[String], libraryContext: LibraryContext[T]): Unit
  
  def strictRuntimeBailout(renderContext: RenderContext, libraryContext: LibraryContext[T]): js.UndefOr[String]
}
object AbstractLibraryPlugin {
  
  inline def apply[T](
    apply: Compiler => Callback,
    chunkHash: (Chunk, Hash, ChunkHashContext, LibraryContext[T]) => Callback,
    embedInRuntimeBailout: (Module, RenderContext, LibraryContext[T]) => js.UndefOr[String],
    finishEntryModule: (Module, String, LibraryContext[T]) => Callback,
    parseOptions: LibraryOptions => `false` | T,
    render: (Source, RenderContext, LibraryContext[T]) => Source,
    renderStartup: (Source, Module, StartupRenderContext, LibraryContext[T]) => Source,
    runtimeRequirements: (Chunk, Set[String], LibraryContext[T]) => Callback,
    strictRuntimeBailout: (RenderContext, LibraryContext[T]) => js.UndefOr[String]
  ): AbstractLibraryPlugin[T] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), chunkHash = js.Any.fromFunction4((t0: Chunk, t1: Hash, t2: ChunkHashContext, t3: LibraryContext[T]) => (chunkHash(t0, t1, t2, t3)).runNow()), embedInRuntimeBailout = js.Any.fromFunction3(embedInRuntimeBailout), finishEntryModule = js.Any.fromFunction3((t0: Module, t1: String, t2: LibraryContext[T]) => (finishEntryModule(t0, t1, t2)).runNow()), parseOptions = js.Any.fromFunction1(parseOptions), render = js.Any.fromFunction3(render), renderStartup = js.Any.fromFunction4(renderStartup), runtimeRequirements = js.Any.fromFunction3((t0: Chunk, t1: Set[String], t2: LibraryContext[T]) => (runtimeRequirements(t0, t1, t2)).runNow()), strictRuntimeBailout = js.Any.fromFunction2(strictRuntimeBailout))
    __obj.asInstanceOf[AbstractLibraryPlugin[T]]
  }
  
  extension [Self <: AbstractLibraryPlugin[?], T](x: Self & AbstractLibraryPlugin[T]) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    
    inline def setChunkHash(value: (Chunk, Hash, ChunkHashContext, LibraryContext[T]) => Callback): Self = StObject.set(x, "chunkHash", js.Any.fromFunction4((t0: Chunk, t1: Hash, t2: ChunkHashContext, t3: LibraryContext[T]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setEmbedInRuntimeBailout(value: (Module, RenderContext, LibraryContext[T]) => js.UndefOr[String]): Self = StObject.set(x, "embedInRuntimeBailout", js.Any.fromFunction3(value))
    
    inline def setFinishEntryModule(value: (Module, String, LibraryContext[T]) => Callback): Self = StObject.set(x, "finishEntryModule", js.Any.fromFunction3((t0: Module, t1: String, t2: LibraryContext[T]) => (value(t0, t1, t2)).runNow()))
    
    inline def setParseOptions(value: LibraryOptions => `false` | T): Self = StObject.set(x, "parseOptions", js.Any.fromFunction1(value))
    
    inline def setRender(value: (Source, RenderContext, LibraryContext[T]) => Source): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setRenderStartup(value: (Source, Module, StartupRenderContext, LibraryContext[T]) => Source): Self = StObject.set(x, "renderStartup", js.Any.fromFunction4(value))
    
    inline def setRuntimeRequirements(value: (Chunk, Set[String], LibraryContext[T]) => Callback): Self = StObject.set(x, "runtimeRequirements", js.Any.fromFunction3((t0: Chunk, t1: Set[String], t2: LibraryContext[T]) => (value(t0, t1, t2)).runNow()))
    
    inline def setStrictRuntimeBailout(value: (RenderContext, LibraryContext[T]) => js.UndefOr[String]): Self = StObject.set(x, "strictRuntimeBailout", js.Any.fromFunction2(value))
  }
}
