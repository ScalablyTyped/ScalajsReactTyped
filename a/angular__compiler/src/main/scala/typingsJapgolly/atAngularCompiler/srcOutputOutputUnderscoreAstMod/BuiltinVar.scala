package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinVar extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinVar")
@js.native
object BuiltinVar extends js.Object {
  @js.native
  sealed trait CatchError extends BuiltinVar
  
  @js.native
  sealed trait CatchStack extends BuiltinVar
  
  @js.native
  sealed trait Super extends BuiltinVar
  
  @js.native
  sealed trait This extends BuiltinVar
  
  /* 2 */ val CatchError: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinVar.CatchError with Double = js.native
  /* 3 */ val CatchStack: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinVar.CatchStack with Double = js.native
  /* 1 */ val Super: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinVar.Super with Double = js.native
  /* 0 */ val This: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinVar.This with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinVar with Double] = js.native
}

