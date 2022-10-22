package typingsJapgolly.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilePipelineParseMod {
  
  @JSImport("unified-engine/lib/file-pipeline/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(context: Context, file: VFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(context.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Context = typingsJapgolly.unifiedEngine.libFilePipelineMod.Context
  
  type VFile = typingsJapgolly.vfile.mod.VFile
}
