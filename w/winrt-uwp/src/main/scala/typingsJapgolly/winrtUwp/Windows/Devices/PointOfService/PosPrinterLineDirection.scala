package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterLineDirection extends js.Object

/** Describes the possible directions that a receipt or slip printer station can use to print a ruled line. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterLineDirection")
@js.native
object PosPrinterLineDirection extends js.Object {
  /** Prints a horizontal ruled line. */
  @js.native
  sealed trait horizontal extends PosPrinterLineDirection
  
  /** Prints a vertical ruled line. */
  @js.native
  sealed trait vertical extends PosPrinterLineDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterLineDirection with Double] = js.native
  /* 0 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 1 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}

