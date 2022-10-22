package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.CompilationSettings
import typingsJapgolly.typescriptServices.TypeScript.IPreProcessedFileInfo
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import typingsJapgolly.typescriptServices.TypeScript.Services.ICoreServicesHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.CoreServices")
@js.native
open class CoreServices protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.CoreServices {
  def this(host: ICoreServicesHost) = this()
  
  /* CompleteClass */
  override def collectGarbage(): Unit = js.native
  
  /* CompleteClass */
  override def dumpMemory(): String = js.native
  
  /* CompleteClass */
  override def getDefaultCompilationSettings(): CompilationSettings = js.native
  
  /* CompleteClass */
  override def getMemoryInfo(): js.Array[Any] = js.native
  
  /* CompleteClass */
  override def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  
  /* CompleteClass */
  var host: ICoreServicesHost = js.native
}
