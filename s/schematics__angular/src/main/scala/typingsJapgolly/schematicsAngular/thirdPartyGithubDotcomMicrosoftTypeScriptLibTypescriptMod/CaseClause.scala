package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseClause
  extends StObject
     with Node
     with JSDocContainer
     with CaseOrDefaultClause
     with HasJSDoc {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_CaseClause: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.CaseClause = js.native
  
  @JSName("parent")
  val parent_CaseClause: CaseBlock = js.native
  
  val statements: NodeArray[Statement] = js.native
}
