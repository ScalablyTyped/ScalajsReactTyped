package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAliasDeclaration
  extends StObject
     with DeclarationStatement
     with DeclarationWithTypeParameterChildren
     with HasJSDoc
     with HasModifiers
     with HasType {
  
  @JSName("kind")
  val kind_TypeAliasDeclaration: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.TypeAliasDeclaration = js.native
  
  @JSName("modifiers")
  val modifiers_TypeAliasDeclaration: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_TypeAliasDeclaration: Identifier = js.native
  
  val `type`: TypeNode = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
