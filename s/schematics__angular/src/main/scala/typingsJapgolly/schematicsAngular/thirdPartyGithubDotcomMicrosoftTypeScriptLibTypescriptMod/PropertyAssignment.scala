package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyAssignment
  extends StObject
     with ObjectLiteralElement
     with JSDocContainer
     with HasExpressionInitializer
     with HasJSDoc
     with ObjectBindingOrAssignmentElement
     with ObjectLiteralElementLike
     with VariableLikeDeclaration {
  
  /** @deprecated A property assignment cannot have an exclamation token */
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  val initializer: Expression = js.native
  
  @JSName("kind")
  val kind_PropertyAssignment: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.PropertyAssignment = js.native
  
  @JSName("name")
  val name_PropertyAssignment: PropertyName = js.native
  
  @JSName("parent")
  val parent_PropertyAssignment: ObjectLiteralExpression = js.native
  
  /** @deprecated A property assignment cannot have a question token */
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
