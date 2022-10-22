package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeIcomputepipelinecontextMod {
  
  trait IComputePipelineContext extends StObject {
    
    /** @internal */
    def _getComputeShaderCode(): String | Null
    
    /** @internal */
    var _name: js.UndefOr[String] = js.undefined
    
    /** Releases the resources associated with the pipeline. */
    def dispose(): Unit
    
    /**
      * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
      */
    var isAsync: Boolean
    
    /**
      * Gets a boolean indicating that the context is ready to be used (like shader / pipeline are compiled and ready for instance)
      */
    var isReady: Boolean
  }
  object IComputePipelineContext {
    
    inline def apply(
      _getComputeShaderCode: CallbackTo[String | Null],
      dispose: Callback,
      isAsync: Boolean,
      isReady: Boolean
    ): IComputePipelineContext = {
      val __obj = js.Dynamic.literal(_getComputeShaderCode = _getComputeShaderCode.toJsFn, dispose = dispose.toJsFn, isAsync = isAsync.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any])
      __obj.asInstanceOf[IComputePipelineContext]
    }
    
    extension [Self <: IComputePipelineContext](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
      
      inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      inline def set_getComputeShaderCode(value: CallbackTo[String | Null]): Self = StObject.set(x, "_getComputeShaderCode", value.toJsFn)
      
      inline def set_name(value: String): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
      
      inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    }
  }
}
