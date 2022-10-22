package typingsJapgolly.esbuildWasm.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.esbuildWasm.esbuildWasmBooleans.`false`
import typingsJapgolly.esbuildWasm.mod.BuildIncremental
import typingsJapgolly.esbuildWasm.mod.BuildInvalidate
import typingsJapgolly.esbuildWasm.mod.Message
import typingsJapgolly.esbuildWasm.mod.Metafile
import typingsJapgolly.esbuildWasm.mod.OutputFile
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined esbuild-wasm.esbuild-wasm.BuildIncremental & {  metafile :esbuild-wasm.esbuild-wasm.Metafile} */
trait BuildIncrementalmetafileMErrors extends StObject {
  
  var errors: js.Array[Message]
  
  /** Only when "mangleCache" is present */
  var mangleCache: js.UndefOr[Record[String, String | `false`]] = js.undefined
  
  /** Only when "metafile: true" */
  var metafile: js.UndefOr[Metafile] & Metafile
  
  /** Only when "write: false" */
  var outputFiles: js.UndefOr[js.Array[OutputFile]] = js.undefined
  
  def rebuild(): js.Promise[BuildIncremental]
  @JSName("rebuild")
  var rebuild_Original: BuildInvalidate
  
  /** Only when "watch: true" */
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var warnings: js.Array[Message]
}
object BuildIncrementalmetafileMErrors {
  
  inline def apply(
    errors: js.Array[Message],
    metafile: js.UndefOr[Metafile] & Metafile,
    rebuild: BuildInvalidate,
    warnings: js.Array[Message]
  ): BuildIncrementalmetafileMErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], metafile = metafile.asInstanceOf[js.Any], rebuild = rebuild.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildIncrementalmetafileMErrors]
  }
  
  extension [Self <: BuildIncrementalmetafileMErrors](x: Self) {
    
    inline def setErrors(value: js.Array[Message]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Message*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMangleCache(value: Record[String, String | `false`]): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMangleCacheUndefined: Self = StObject.set(x, "mangleCache", js.undefined)
    
    inline def setMetafile(value: js.UndefOr[Metafile] & Metafile): Self = StObject.set(x, "metafile", value.asInstanceOf[js.Any])
    
    inline def setOutputFiles(value: js.Array[OutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    inline def setOutputFilesUndefined: Self = StObject.set(x, "outputFiles", js.undefined)
    
    inline def setOutputFilesVarargs(value: OutputFile*): Self = StObject.set(x, "outputFiles", js.Array(value*))
    
    inline def setRebuild(value: BuildInvalidate): Self = StObject.set(x, "rebuild", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
