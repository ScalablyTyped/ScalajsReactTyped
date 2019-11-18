package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SemicolonPreference extends js.Object

@JSImport("typescript", "SemicolonPreference")
@js.native
object SemicolonPreference extends js.Object {
  @js.native
  sealed trait Ignore extends SemicolonPreference
  
  @js.native
  sealed trait Insert extends SemicolonPreference
  
  @js.native
  sealed trait Remove extends SemicolonPreference
  
  /* "ignore" */ val Ignore: typingsJapgolly.typescript.typescriptMod.SemicolonPreference.Ignore with String = js.native
  /* "insert" */ val Insert: typingsJapgolly.typescript.typescriptMod.SemicolonPreference.Insert with String = js.native
  /* "remove" */ val Remove: typingsJapgolly.typescript.typescriptMod.SemicolonPreference.Remove with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemicolonPreference with String] = js.native
}

