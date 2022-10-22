package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralTypeNode
  extends StObject
     with TypeNode {
  
  @JSName("kind")
  val kind_LiteralTypeNode: typingsJapgolly.typescript.mod.SyntaxKind.LiteralType = js.native
  
  val literal: NullLiteral | BooleanLiteral | LiteralExpression | PrefixUnaryExpression = js.native
}
