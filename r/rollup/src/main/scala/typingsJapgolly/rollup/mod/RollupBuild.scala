package typingsJapgolly.rollup.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupBuild extends StObject {
  
  var cache: js.UndefOr[RollupCache] = js.undefined
  
  def close(): js.Promise[Unit]
  
  var closed: Boolean
  
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput]
  
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.undefined
  
  var watchFiles: js.Array[String]
  
  def write(options: OutputOptions): js.Promise[RollupOutput]
}
object RollupBuild {
  
  inline def apply(
    close: CallbackTo[js.Promise[Unit]],
    closed: Boolean,
    generate: OutputOptions => js.Promise[RollupOutput],
    watchFiles: js.Array[String],
    write: OutputOptions => js.Promise[RollupOutput]
  ): RollupBuild = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, closed = closed.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate), watchFiles = watchFiles.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RollupBuild]
  }
  
  extension [Self <: RollupBuild](x: Self) {
    
    inline def setCache(value: RollupCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setGenerate(value: OutputOptions => js.Promise[RollupOutput]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
    
    inline def setGetTimings(value: CallbackTo[SerializedTimings]): Self = StObject.set(x, "getTimings", value.toJsFn)
    
    inline def setGetTimingsUndefined: Self = StObject.set(x, "getTimings", js.undefined)
    
    inline def setWatchFiles(value: js.Array[String]): Self = StObject.set(x, "watchFiles", value.asInstanceOf[js.Any])
    
    inline def setWatchFilesVarargs(value: String*): Self = StObject.set(x, "watchFiles", js.Array(value*))
    
    inline def setWrite(value: OutputOptions => js.Promise[RollupOutput]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
