package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.ByteOrderMark
import typingsJapgolly.typescriptServices.TypeScript.CompilationSettings
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import typingsJapgolly.typescriptServices.TypeScript.Services.ILanguageServiceShimHost
import typingsJapgolly.typescriptServices.TypeScript.Services.ILanguageServicesDiagnostics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.LanguageServiceShimHostAdapter")
@js.native
open class LanguageServiceShimHostAdapter protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.LanguageServiceShimHostAdapter {
  def this(shimHost: ILanguageServiceShimHost) = this()
  
  /* CompleteClass */
  override def debug(): Boolean = js.native
  
  /* CompleteClass */
  override def directoryExists(path: String): Boolean = js.native
  
  /* CompleteClass */
  override def error(): Boolean = js.native
  
  /* CompleteClass */
  override def fatal(): Boolean = js.native
  
  /* CompleteClass */
  override def fileExists(path: String): Boolean = js.native
  
  /* CompleteClass */
  override def getCompilationSettings(): CompilationSettings = js.native
  
  /* CompleteClass */
  override def getDiagnosticsObject(): ILanguageServicesDiagnostics = js.native
  
  /* CompleteClass */
  override def getLocalizedDiagnosticMessages(): Any = js.native
  
  /* CompleteClass */
  override def getParentDirectory(path: String): String = js.native
  
  /* CompleteClass */
  override def getScriptByteOrderMark(fileName: String): ByteOrderMark = js.native
  
  /* CompleteClass */
  override def getScriptFileNames(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getScriptIsOpen(fileName: String): Boolean = js.native
  
  /* CompleteClass */
  override def getScriptSnapshot(fileName: String): IScriptSnapshot = js.native
  
  /* CompleteClass */
  override def getScriptVersion(fileName: String): Double = js.native
  
  /* CompleteClass */
  override def information(): Boolean = js.native
  
  /* CompleteClass */
  override def log(s: String): Unit = js.native
  
  /* CompleteClass */
  override def resolveRelativePath(path: String, directory: String): String = js.native
  
  /* private */ /* CompleteClass */
  var shimHost: Any = js.native
  
  /* CompleteClass */
  override def warning(): Boolean = js.native
}
