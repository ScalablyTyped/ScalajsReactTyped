package typingsJapgolly.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilePipelineQueueMod {
  
  @JSImport("unified-engine/lib/file-pipeline/queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def queue(context: Context, file: VFile, next: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(context.asInstanceOf[js.Any], file.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = typingsJapgolly.trough.mod.Callback
  
  type Context = typingsJapgolly.unifiedEngine.libFilePipelineMod.Context
  
  type VFile = typingsJapgolly.vfile.mod.VFile
}
