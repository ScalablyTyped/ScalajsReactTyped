package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullDeclGroup")
@js.native
open class PullDeclGroup protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullDeclGroup {
  def this(name: String) = this()
  
  /* private */ /* CompleteClass */
  var _decls: Any = js.native
  
  /* CompleteClass */
  override def addDecl(decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* CompleteClass */
  override def getDecls(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl] = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
