package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterPrintSide extends js.Object

/** Describes the sides of the sheet of paper on which the point-of-service printer prints. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterPrintSide")
@js.native
object PosPrinterPrintSide extends js.Object {
  /** The point-of-service printer is printing or should print on the front side of the sheet. */
  @js.native
  sealed trait side1 extends PosPrinterPrintSide
  
  /** The point-of-service printer is printing or should print on the back side of the sheet. */
  @js.native
  sealed trait side2 extends PosPrinterPrintSide
  
  /** The side on which the point-of-service printer is currently printing is unknown. */
  @js.native
  sealed trait unknown extends PosPrinterPrintSide
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterPrintSide with Double] = js.native
  /* 1 */ @js.native
  object side1 extends TopLevel[side1 with Double]
  
  /* 2 */ @js.native
  object side2 extends TopLevel[side2 with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

