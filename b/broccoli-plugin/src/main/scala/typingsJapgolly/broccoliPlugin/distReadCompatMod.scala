package typingsJapgolly.broccoliPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.broccoliNodeApi.mod.CallbackObject
import typingsJapgolly.broccoliNodeApi.mod.InputNode
import typingsJapgolly.broccoliNodeApi.mod.TransformNodeInfo
import typingsJapgolly.broccoliPlugin.distInterfacesMod.MapSeriesIterator
import typingsJapgolly.broccoliPlugin.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReadCompatMod {
  
  @JSImport("broccoli-plugin/dist/read_compat", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ReadCompat {
    def this(plugin: PluginWithDescription) = this()
    
    /* private */ /* CompleteClass */
    var _priorBuildInputNodeOutputPaths: Any = js.native
    
    /* CompleteClass */
    var callbackObject: CallbackObject = js.native
    
    /* CompleteClass */
    override def cleanup(): Unit = js.native
    
    /* CompleteClass */
    var inputBasePath: String = js.native
    
    /* CompleteClass */
    var inputPaths: js.Array[String] = js.native
    
    /* CompleteClass */
    var outputPath: String = js.native
    
    /* CompleteClass */
    var pluginInterface: TransformNodeInfo = js.native
    
    /* CompleteClass */
    override def read(readTree: MapSeriesIterator[InputNode]): js.Promise[String] = js.native
  }
  
  @js.native
  trait PluginWithDescription extends ^ {
    
    var description: js.UndefOr[String] = js.native
  }
  
  trait ReadCompat extends StObject {
    
    /* private */ var _priorBuildInputNodeOutputPaths: Any
    
    var cachePath: js.UndefOr[String] = js.undefined
    
    var callbackObject: CallbackObject
    
    def cleanup(): Unit
    
    var inputBasePath: String
    
    var inputPaths: js.Array[String]
    
    var outputPath: String
    
    var pluginInterface: TransformNodeInfo
    
    def read(readTree: MapSeriesIterator[InputNode]): js.Promise[String]
  }
  object ReadCompat {
    
    inline def apply(
      _priorBuildInputNodeOutputPaths: Any,
      callbackObject: CallbackObject,
      cleanup: Callback,
      inputBasePath: String,
      inputPaths: js.Array[String],
      outputPath: String,
      pluginInterface: TransformNodeInfo,
      read: MapSeriesIterator[InputNode] => js.Promise[String]
    ): ReadCompat = {
      val __obj = js.Dynamic.literal(_priorBuildInputNodeOutputPaths = _priorBuildInputNodeOutputPaths.asInstanceOf[js.Any], callbackObject = callbackObject.asInstanceOf[js.Any], cleanup = cleanup.toJsFn, inputBasePath = inputBasePath.asInstanceOf[js.Any], inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], pluginInterface = pluginInterface.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[ReadCompat]
    }
    
    extension [Self <: ReadCompat](x: Self) {
      
      inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
      
      inline def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
      
      inline def setCallbackObject(value: CallbackObject): Self = StObject.set(x, "callbackObject", value.asInstanceOf[js.Any])
      
      inline def setCleanup(value: Callback): Self = StObject.set(x, "cleanup", value.toJsFn)
      
      inline def setInputBasePath(value: String): Self = StObject.set(x, "inputBasePath", value.asInstanceOf[js.Any])
      
      inline def setInputPaths(value: js.Array[String]): Self = StObject.set(x, "inputPaths", value.asInstanceOf[js.Any])
      
      inline def setInputPathsVarargs(value: String*): Self = StObject.set(x, "inputPaths", js.Array(value*))
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setPluginInterface(value: TransformNodeInfo): Self = StObject.set(x, "pluginInterface", value.asInstanceOf[js.Any])
      
      inline def setRead(value: MapSeriesIterator[InputNode] => js.Promise[String]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def set_priorBuildInputNodeOutputPaths(value: Any): Self = StObject.set(x, "_priorBuildInputNodeOutputPaths", value.asInstanceOf[js.Any])
    }
  }
}
