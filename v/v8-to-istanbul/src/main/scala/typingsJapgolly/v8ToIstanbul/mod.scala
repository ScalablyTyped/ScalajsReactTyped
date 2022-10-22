package typingsJapgolly.v8ToIstanbul

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.istanbulLibCoverage.mod.CoverageMapData
import typingsJapgolly.node.inspectorMod.Profiler.FunctionCoverage
import typingsJapgolly.v8ToIstanbul.anon.Sourcemap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(scriptPath: String): V8ToIstanbul = ^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any]).asInstanceOf[V8ToIstanbul]
  inline def apply(scriptPath: String, wrapperLength: Double): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(
    scriptPath: String,
    wrapperLength: Double,
    sources: Unit,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], excludePath.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(scriptPath: String, wrapperLength: Double, sources: Sources): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(
    scriptPath: String,
    wrapperLength: Double,
    sources: Sources,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], excludePath.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(
    scriptPath: String,
    wrapperLength: Unit,
    sources: Unit,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], excludePath.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(scriptPath: String, wrapperLength: Unit, sources: Sources): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(
    scriptPath: String,
    wrapperLength: Unit,
    sources: Sources,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], excludePath.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.v8ToIstanbul.anon.Source
    - typingsJapgolly.v8ToIstanbul.anon.OriginalSource
  */
  trait Sources extends StObject
  object Sources {
    
    inline def OriginalSource(originalSource: String, source: String, sourceMap: Sourcemap): typingsJapgolly.v8ToIstanbul.anon.OriginalSource = {
      val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.v8ToIstanbul.anon.OriginalSource]
    }
    
    inline def Source(source: String): typingsJapgolly.v8ToIstanbul.anon.Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.v8ToIstanbul.anon.Source]
    }
  }
  
  trait V8ToIstanbul extends StObject {
    
    def applyCoverage(blocks: js.Array[FunctionCoverage]): Unit
    
    def destroy(): Unit
    
    def load(): js.Promise[Unit]
    
    def toIstanbul(): CoverageMapData
  }
  object V8ToIstanbul {
    
    inline def apply(
      applyCoverage: js.Array[FunctionCoverage] => Callback,
      destroy: Callback,
      load: CallbackTo[js.Promise[Unit]],
      toIstanbul: CallbackTo[CoverageMapData]
    ): V8ToIstanbul = {
      val __obj = js.Dynamic.literal(applyCoverage = js.Any.fromFunction1((t0: js.Array[FunctionCoverage]) => applyCoverage(t0).runNow()), destroy = destroy.toJsFn, load = load.toJsFn, toIstanbul = toIstanbul.toJsFn)
      __obj.asInstanceOf[V8ToIstanbul]
    }
    
    extension [Self <: V8ToIstanbul](x: Self) {
      
      inline def setApplyCoverage(value: js.Array[FunctionCoverage] => Callback): Self = StObject.set(x, "applyCoverage", js.Any.fromFunction1((t0: js.Array[FunctionCoverage]) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setLoad(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "load", value.toJsFn)
      
      inline def setToIstanbul(value: CallbackTo[CoverageMapData]): Self = StObject.set(x, "toIstanbul", value.toJsFn)
    }
  }
}
