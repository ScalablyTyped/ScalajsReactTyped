package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyDeclaration
  extends StObject
     with ClassElement
     with JSDocContainer
     with HasDecorators
     with HasExpressionInitializer
     with HasJSDoc
     with HasModifiers
     with HasType
     with VariableLikeDeclaration {
  
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  val initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_PropertyDeclaration: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.PropertyDeclaration = js.native
  
  @JSName("name")
  val name_PropertyDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_PropertyDeclaration: ClassLikeDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
