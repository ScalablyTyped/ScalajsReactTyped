package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestRunProfileKind extends StObject
@JSImport("vscode", "TestRunProfileKind")
@js.native
object TestRunProfileKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunProfileKind & Double] = js.native
  
  @js.native
  sealed trait Coverage
    extends StObject
       with TestRunProfileKind
  /* 3 */ val Coverage: typingsJapgolly.vscode.mod.TestRunProfileKind.Coverage & Double = js.native
  
  @js.native
  sealed trait Debug
    extends StObject
       with TestRunProfileKind
  /* 2 */ val Debug: typingsJapgolly.vscode.mod.TestRunProfileKind.Debug & Double = js.native
  
  @js.native
  sealed trait Run
    extends StObject
       with TestRunProfileKind
  /* 1 */ val Run: typingsJapgolly.vscode.mod.TestRunProfileKind.Run & Double = js.native
}
