package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.TypeAssertionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAssertion
  extends StObject
     with UnaryExpression
     with AssertionExpression {
  
  val expression: UnaryExpression = js.native
  
  @JSName("kind")
  val kind_TypeAssertion: TypeAssertionExpression = js.native
  
  val `type`: TypeNode = js.native
}
