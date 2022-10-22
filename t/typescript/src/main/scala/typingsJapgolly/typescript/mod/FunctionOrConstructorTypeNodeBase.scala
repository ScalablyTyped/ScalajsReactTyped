package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.ConstructorType
import typingsJapgolly.typescript.mod.SyntaxKind.FunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionOrConstructorTypeNodeBase
  extends StObject
     with TypeNode
     with SignatureDeclarationBase {
  
  @JSName("kind")
  val kind_FunctionOrConstructorTypeNodeBase: FunctionType | ConstructorType = js.native
  
  @JSName("type")
  val type_FunctionOrConstructorTypeNodeBase: TypeNode = js.native
}
