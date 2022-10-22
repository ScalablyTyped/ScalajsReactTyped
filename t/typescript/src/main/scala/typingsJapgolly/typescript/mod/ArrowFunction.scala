package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowFunction
  extends StObject
     with Expression
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  @JSName("body")
  val body_ArrowFunction: ConciseBody = js.native
  
  val equalsGreaterThanToken: EqualsGreaterThanToken = js.native
  
  @JSName("kind")
  val kind_ArrowFunction: typingsJapgolly.typescript.mod.SyntaxKind.ArrowFunction = js.native
  
  @JSName("modifiers")
  val modifiers_ArrowFunction: js.UndefOr[NodeArray[Modifier]] = js.native
}
