package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueStatement
  extends StObject
     with Statement
     with BreakOrContinueStatement
     with HasJSDoc {
  
  @JSName("kind")
  val kind_ContinueStatement: typingsJapgolly.typescript.mod.SyntaxKind.ContinueStatement = js.native
  
  val label: js.UndefOr[Identifier] = js.native
}
