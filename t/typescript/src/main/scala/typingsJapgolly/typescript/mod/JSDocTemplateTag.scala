package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocTemplateTag
  extends StObject
     with JSDocTag
     with DeclarationWithTypeParameterChildren {
  
  val constraint: js.UndefOr[JSDocTypeExpression] = js.native
  
  @JSName("kind")
  val kind_JSDocTemplateTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocTemplateTag = js.native
  
  val typeParameters: NodeArray[TypeParameterDeclaration] = js.native
}
