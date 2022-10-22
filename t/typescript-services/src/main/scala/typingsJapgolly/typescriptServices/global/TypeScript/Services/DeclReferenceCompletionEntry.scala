package typingsJapgolly.typescriptServices.global.TypeScript.Services

import typingsJapgolly.typescriptServices.TypeScript.PullDecl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.DeclReferenceCompletionEntry")
@js.native
open class DeclReferenceCompletionEntry protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.DeclReferenceCompletionEntry {
  def this(name: String, kind: String, kindModifiers: String, decl: PullDecl) = this()
  
  /* CompleteClass */
  var decl: PullDecl = js.native
  
  /* CompleteClass */
  var docComment: String = js.native
  
  /* CompleteClass */
  var fullSymbolName: String = js.native
  
  /* private */ /* CompleteClass */
  var hasBeenResolved: Any = js.native
  
  /* CompleteClass */
  override def isResolved(): Boolean = js.native
  
  /* CompleteClass */
  var kind: String = js.native
  
  /* CompleteClass */
  var kindModifiers: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def resolve(`type`: String, fullSymbolName: String, docComments: String): Unit = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
