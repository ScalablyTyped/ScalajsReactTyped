package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.FunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionTypeNode
  extends StObject
     with FunctionOrConstructorTypeNodeBase
     with FunctionOrConstructorTypeNode
     with HasJSDoc
     with SignatureDeclaration {
  
  @JSName("kind")
  val kind_FunctionTypeNode: FunctionType = js.native
  
  /** @deprecated A function type cannot have modifiers */
  @JSName("modifiers")
  val modifiers_FunctionTypeNode: js.UndefOr[NodeArray[Modifier]] = js.native
}
