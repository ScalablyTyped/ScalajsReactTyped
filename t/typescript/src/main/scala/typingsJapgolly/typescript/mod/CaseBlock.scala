package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseBlock
  extends StObject
     with Node {
  
  val clauses: NodeArray[CaseOrDefaultClause] = js.native
  
  @JSName("kind")
  val kind_CaseBlock: typingsJapgolly.typescript.mod.SyntaxKind.CaseBlock = js.native
  
  @JSName("parent")
  val parent_CaseBlock: SwitchStatement = js.native
}
