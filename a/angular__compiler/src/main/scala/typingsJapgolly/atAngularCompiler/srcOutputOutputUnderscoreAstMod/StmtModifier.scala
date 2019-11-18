package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StmtModifier extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "StmtModifier")
@js.native
object StmtModifier extends js.Object {
  @js.native
  sealed trait Exported extends StmtModifier
  
  @js.native
  sealed trait Final extends StmtModifier
  
  @js.native
  sealed trait Private extends StmtModifier
  
  @js.native
  sealed trait Static extends StmtModifier
  
  /* 2 */ val Exported: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier.Exported with Double = js.native
  /* 0 */ val Final: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier.Final with Double = js.native
  /* 1 */ val Private: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier.Private with Double = js.native
  /* 3 */ val Static: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier.Static with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StmtModifier with Double] = js.native
}

