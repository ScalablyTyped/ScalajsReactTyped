package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedTemplateExpression
  extends StObject
     with MemberExpression
     with CallLikeExpression
     with HasTypeArguments {
  
  @JSName("kind")
  val kind_TaggedTemplateExpression: typingsJapgolly.typescript.mod.SyntaxKind.TaggedTemplateExpression = js.native
  
  val tag: LeftHandSideExpression = js.native
  
  val template: TemplateLiteral = js.native
  
  val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
