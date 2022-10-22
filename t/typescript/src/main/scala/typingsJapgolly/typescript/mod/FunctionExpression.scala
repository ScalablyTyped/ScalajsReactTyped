package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionExpression
  extends StObject
     with PrimaryExpression
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  @JSName("body")
  val body_FunctionExpression: FunctionBody = js.native
  
  @JSName("kind")
  val kind_FunctionExpression: typingsJapgolly.typescript.mod.SyntaxKind.FunctionExpression = js.native
  
  @JSName("modifiers")
  val modifiers_FunctionExpression: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_FunctionExpression: js.UndefOr[Identifier] = js.native
}
