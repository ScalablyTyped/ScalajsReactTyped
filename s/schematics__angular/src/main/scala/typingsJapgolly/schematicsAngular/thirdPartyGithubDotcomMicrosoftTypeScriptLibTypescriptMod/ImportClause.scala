package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportClause
  extends StObject
     with NamedDeclaration
     with TypeOnlyCompatibleAliasDeclaration {
  
  val isTypeOnly: Boolean = js.native
  
  @JSName("kind")
  val kind_ImportClause: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ImportClause = js.native
  
  @JSName("name")
  val name_ImportClause: js.UndefOr[Identifier] = js.native
  
  val namedBindings: js.UndefOr[NamedImportBindings] = js.native
  
  @JSName("parent")
  val parent_ImportClause: ImportDeclaration = js.native
}
