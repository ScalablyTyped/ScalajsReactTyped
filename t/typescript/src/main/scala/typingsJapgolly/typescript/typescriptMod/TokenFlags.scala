package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenFlags extends js.Object

@JSImport("typescript", "TokenFlags")
@js.native
object TokenFlags extends js.Object {
  @js.native
  sealed trait BinarySpecifier extends TokenFlags
  
  @js.native
  sealed trait HexSpecifier extends TokenFlags
  
  @js.native
  sealed trait None extends TokenFlags
  
  @js.native
  sealed trait Octal extends TokenFlags
  
  @js.native
  sealed trait OctalSpecifier extends TokenFlags
  
  @js.native
  sealed trait Scientific extends TokenFlags
  
  /* 128 */ val BinarySpecifier: typingsJapgolly.typescript.typescriptMod.TokenFlags.BinarySpecifier with Double = js.native
  /* 64 */ val HexSpecifier: typingsJapgolly.typescript.typescriptMod.TokenFlags.HexSpecifier with Double = js.native
  /* 0 */ val None: typingsJapgolly.typescript.typescriptMod.TokenFlags.None with Double = js.native
  /* 32 */ val Octal: typingsJapgolly.typescript.typescriptMod.TokenFlags.Octal with Double = js.native
  /* 256 */ val OctalSpecifier: typingsJapgolly.typescript.typescriptMod.TokenFlags.OctalSpecifier with Double = js.native
  /* 16 */ val Scientific: typingsJapgolly.typescript.typescriptMod.TokenFlags.Scientific with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenFlags with Double] = js.native
}

