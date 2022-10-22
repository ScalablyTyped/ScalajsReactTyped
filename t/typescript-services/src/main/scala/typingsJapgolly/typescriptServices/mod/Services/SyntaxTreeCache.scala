package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.Services.ILanguageServiceHost
import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.SyntaxTreeCache")
@js.native
open class SyntaxTreeCache protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.SyntaxTreeCache {
  def this(_host: ILanguageServiceHost) = this()
  
  /* private */ /* CompleteClass */
  var _currentFileName: Any = js.native
  
  /* private */ /* CompleteClass */
  var _currentFileScriptSnapshot: Any = js.native
  
  /* private */ /* CompleteClass */
  var _currentFileSyntaxTree: Any = js.native
  
  /* private */ /* CompleteClass */
  var _currentFileVersion: Any = js.native
  
  /* private */ /* CompleteClass */
  var _host: Any = js.native
  
  /* private */ /* CompleteClass */
  var _hostCache: Any = js.native
  
  /* private */ /* CompleteClass */
  override def createSyntaxTree(fileName: Any, scriptSnapshot: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def ensureInvariants(
    fileName: Any,
    editRange: Any,
    incrementalTree: Any,
    oldScriptSnapshot: Any,
    newScriptSnapshot: Any
  ): Any = js.native
  
  /* CompleteClass */
  override def getCurrentFileSyntaxTree(fileName: String): SyntaxTree = js.native
  
  /* private */ /* CompleteClass */
  override def updateSyntaxTree(fileName: Any, scriptSnapshot: Any, previousSyntaxTree: Any, previousFileVersion: Any): Any = js.native
}
