package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinTypeName extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinTypeName")
@js.native
object BuiltinTypeName extends js.Object {
  @js.native
  sealed trait Bool extends BuiltinTypeName
  
  @js.native
  sealed trait Dynamic extends BuiltinTypeName
  
  @js.native
  sealed trait Function extends BuiltinTypeName
  
  @js.native
  sealed trait Inferred extends BuiltinTypeName
  
  @js.native
  sealed trait Int extends BuiltinTypeName
  
  @js.native
  sealed trait None extends BuiltinTypeName
  
  @js.native
  sealed trait Number extends BuiltinTypeName
  
  @js.native
  sealed trait String extends BuiltinTypeName
  
  /* 1 */ val Bool: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Bool with Double = js.native
  /* 0 */ val Dynamic: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Dynamic with Double = js.native
  /* 5 */ val Function: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Function with Double = js.native
  /* 6 */ val Inferred: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Inferred with Double = js.native
  /* 3 */ val Int: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Int with Double = js.native
  /* 7 */ val None: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.None with Double = js.native
  /* 4 */ val Number: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Number with Double = js.native
  /* 2 */ val String: typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.String with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinTypeName with Double] = js.native
}

