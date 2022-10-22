package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.ExtendsKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.ImplementsKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeritageClause
  extends StObject
     with Node {
  
  @JSName("kind")
  val kind_HeritageClause: typingsJapgolly.typescript.mod.SyntaxKind.HeritageClause = js.native
  
  @JSName("parent")
  val parent_HeritageClause: InterfaceDeclaration | ClassLikeDeclaration = js.native
  
  val token: ExtendsKeyword | ImplementsKeyword = js.native
  
  val types: NodeArray[ExpressionWithTypeArguments] = js.native
}
