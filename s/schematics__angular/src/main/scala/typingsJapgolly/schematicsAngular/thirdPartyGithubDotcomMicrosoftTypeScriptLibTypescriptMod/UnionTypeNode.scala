package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeNode
  extends StObject
     with TypeNode
     with UnionOrIntersectionTypeNode {
  
  @JSName("kind")
  val kind_UnionTypeNode: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.UnionType = js.native
  
  val types: NodeArray[TypeNode] = js.native
}
