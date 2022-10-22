package typingsJapgolly.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait s2k extends StObject
/**
  * A string to key specifier type
  */
@JSImport("openpgp", "enums.s2k")
@js.native
object s2k extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[s2k & Double] = js.native
  
  @js.native
  sealed trait gnu
    extends StObject
       with s2k
  /* 101 */ val gnu: typingsJapgolly.openpgp.mod.enums.s2k.gnu & Double = js.native
  
  @js.native
  sealed trait iterated
    extends StObject
       with s2k
  /* 3 */ val iterated: typingsJapgolly.openpgp.mod.enums.s2k.iterated & Double = js.native
  
  @js.native
  sealed trait salted
    extends StObject
       with s2k
  /* 1 */ val salted: typingsJapgolly.openpgp.mod.enums.s2k.salted & Double = js.native
  
  @js.native
  sealed trait simple
    extends StObject
       with s2k
  /* 0 */ val simple: typingsJapgolly.openpgp.mod.enums.s2k.simple & Double = js.native
}
