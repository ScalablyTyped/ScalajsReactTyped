package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenFlags extends StObject
@JSImport("typescript", "TokenFlags")
@js.native
object TokenFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenFlags & Double] = js.native
  
  @js.native
  sealed trait BinarySpecifier
    extends StObject
       with TokenFlags
  /* 128 */ val BinarySpecifier: typingsJapgolly.typescript.mod.TokenFlags.BinarySpecifier & Double = js.native
  
  @js.native
  sealed trait HexSpecifier
    extends StObject
       with TokenFlags
  /* 64 */ val HexSpecifier: typingsJapgolly.typescript.mod.TokenFlags.HexSpecifier & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TokenFlags
  /* 0 */ val None: typingsJapgolly.typescript.mod.TokenFlags.None & Double = js.native
  
  @js.native
  sealed trait Octal
    extends StObject
       with TokenFlags
  /* 32 */ val Octal: typingsJapgolly.typescript.mod.TokenFlags.Octal & Double = js.native
  
  @js.native
  sealed trait OctalSpecifier
    extends StObject
       with TokenFlags
  /* 256 */ val OctalSpecifier: typingsJapgolly.typescript.mod.TokenFlags.OctalSpecifier & Double = js.native
  
  @js.native
  sealed trait Scientific
    extends StObject
       with TokenFlags
  /* 16 */ val Scientific: typingsJapgolly.typescript.mod.TokenFlags.Scientific & Double = js.native
}
