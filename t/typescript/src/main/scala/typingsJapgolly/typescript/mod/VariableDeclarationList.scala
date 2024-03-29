package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclarationList
  extends StObject
     with Node
     with ForInitializer {
  
  val declarations: NodeArray[VariableDeclaration] = js.native
  
  @JSName("kind")
  val kind_VariableDeclarationList: typingsJapgolly.typescript.mod.SyntaxKind.VariableDeclarationList = js.native
  
  @JSName("parent")
  val parent_VariableDeclarationList: VariableStatement | ForStatement | ForOfStatement | ForInStatement = js.native
}
