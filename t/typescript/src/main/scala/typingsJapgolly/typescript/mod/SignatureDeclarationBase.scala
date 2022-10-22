package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.CallSignature
import typingsJapgolly.typescript.mod.SyntaxKind.ConstructSignature
import typingsJapgolly.typescript.mod.SyntaxKind.Constructor
import typingsJapgolly.typescript.mod.SyntaxKind.ConstructorType
import typingsJapgolly.typescript.mod.SyntaxKind.FunctionType
import typingsJapgolly.typescript.mod.SyntaxKind.GetAccessor
import typingsJapgolly.typescript.mod.SyntaxKind.IndexSignature
import typingsJapgolly.typescript.mod.SyntaxKind.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureDeclarationBase
  extends StObject
     with NamedDeclaration
     with JSDocContainer {
  
  @JSName("kind")
  val kind_SignatureDeclarationBase: CallSignature | ConstructSignature | typingsJapgolly.typescript.mod.SyntaxKind.MethodSignature | IndexSignature | FunctionType | ConstructorType | typingsJapgolly.typescript.mod.SyntaxKind.JSDocFunctionType | typingsJapgolly.typescript.mod.SyntaxKind.FunctionDeclaration | typingsJapgolly.typescript.mod.SyntaxKind.MethodDeclaration | Constructor | GetAccessor | SetAccessor | typingsJapgolly.typescript.mod.SyntaxKind.FunctionExpression | typingsJapgolly.typescript.mod.SyntaxKind.ArrowFunction = js.native
  
  @JSName("name")
  val name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  
  val parameters: NodeArray[ParameterDeclaration] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
