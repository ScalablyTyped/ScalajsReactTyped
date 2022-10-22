package typingsJapgolly.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileSetPipelineFileSystemMod {
  
  @JSImport("unified-engine/lib/file-set-pipeline/file-system", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileSystem(context: Context, settings: Settings, next: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileSystem")(context.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = typingsJapgolly.trough.mod.Callback
  
  type Configuration = typingsJapgolly.unifiedEngine.libFileSetPipelineMod.Configuration
  
  trait Context extends StObject {
    
    var configuration: js.UndefOr[typingsJapgolly.unifiedEngine.libConfigurationMod.Configuration] = js.undefined
    
    var files: js.Array[String | VFile]
  }
  object Context {
    
    inline def apply(files: js.Array[String | VFile]): Context = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setConfiguration(value: typingsJapgolly.unifiedEngine.libConfigurationMod.Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setFiles(value: js.Array[String | VFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: (String | VFile)*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  type Settings = typingsJapgolly.unifiedEngine.libFileSetPipelineMod.Settings
  
  type VFile = typingsJapgolly.vfile.mod.VFile
}
