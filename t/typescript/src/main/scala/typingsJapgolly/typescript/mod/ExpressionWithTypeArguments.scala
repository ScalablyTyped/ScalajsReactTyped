package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionWithTypeArguments
  extends NodeWithTypeArguments
     with TypeReferenceType {
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_ExpressionWithTypeArguments: typingsJapgolly.typescript.mod.SyntaxKind.ExpressionWithTypeArguments = js.native
  @JSName("parent")
  var parent_ExpressionWithTypeArguments: HeritageClause | JSDocAugmentsTag = js.native
}

