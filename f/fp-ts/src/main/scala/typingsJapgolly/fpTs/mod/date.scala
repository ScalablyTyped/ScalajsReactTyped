package typingsJapgolly.fpTs.mod

import typingsJapgolly.fpTs.libIOMod.IO_
import typingsJapgolly.fpTs.libOrdMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object date {
  
  @JSImport("fp-ts", "date.Eq")
  @js.native
  val Eq: typingsJapgolly.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "date.Ord")
  @js.native
  val Ord: Ord_[js.Date] = js.native
  
  @JSImport("fp-ts", "date.create")
  @js.native
  val create: IO_[js.Date] = js.native
  
  @JSImport("fp-ts", "date.eqDate")
  @js.native
  val eqDate: typingsJapgolly.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "date.eqMonth")
  @js.native
  val eqMonth: typingsJapgolly.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "date.eqYear")
  @js.native
  val eqYear: typingsJapgolly.fpTs.libEqMod.Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "date.now")
  @js.native
  val now: IO_[Double] = js.native
}
