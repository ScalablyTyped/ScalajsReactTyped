package typingsJapgolly.unifiedEngine

import typingsJapgolly.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilePipelineMod {
  
  @JSImport("unified-engine/lib/file-pipeline", "filePipeline")
  @js.native
  val filePipeline: typingsJapgolly.trough.mod.Pipeline = js.native
  
  type Configuration = typingsJapgolly.unifiedEngine.libConfigurationMod.Configuration
  
  trait Context extends StObject {
    
    var configuration: Configuration
    
    var fileSet: FileSet
    
    /**
      * Clone current processor
      *
      * @returns
      *   New unfrozen processor that is configured to function the same as its
      *   ancestor.
      *   But when the descendant processor is configured it does not affect the
      *   ancestral processor.
      */
    def processor(): typingsJapgolly.unified.mod.Processor[Unit, Unit, Unit, Unit]
    @JSName("processor")
    var processor_Original: Processor
    
    var settings: Settings
    
    var tree: js.UndefOr[typingsJapgolly.unist.mod.Node[Data]] = js.undefined
  }
  object Context {
    
    inline def apply(configuration: Configuration, fileSet: FileSet, processor: Processor, settings: Settings): Context = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], fileSet = fileSet.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setFileSet(value: FileSet): Self = StObject.set(x, "fileSet", value.asInstanceOf[js.Any])
      
      inline def setProcessor(value: Processor): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setTree(value: typingsJapgolly.unist.mod.Node[Data]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
  
  type FileSet = typingsJapgolly.unifiedEngine.libFileSetMod.FileSet
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  type Pipeline = typingsJapgolly.trough.mod.Pipeline
  
  type Processor = typingsJapgolly.unified.mod.Processor[Unit, Unit, Unit, Unit]
  
  type Settings = typingsJapgolly.unifiedEngine.libMod.Settings
  
  type VFile = typingsJapgolly.vfile.mod.VFile
  
  type VFileMessage = typingsJapgolly.vfileMessage.mod.VFileMessage
}
