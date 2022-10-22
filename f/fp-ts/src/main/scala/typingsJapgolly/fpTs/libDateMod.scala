package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libIOMod.IO_
import typingsJapgolly.fpTs.libOrdMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateMod {
  
  @JSImport("fp-ts/lib/Date", "Eq")
  @js.native
  val Eq: typingsJapgolly.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "Ord")
  @js.native
  val Ord: Ord_[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "create")
  @js.native
  val create: IO_[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqDate")
  @js.native
  val eqDate: typingsJapgolly.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqMonth")
  @js.native
  val eqMonth: typingsJapgolly.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "eqYear")
  @js.native
  val eqYear: typingsJapgolly.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts/lib/Date", "now")
  @js.native
  val now: IO_[Double] = js.native
}
