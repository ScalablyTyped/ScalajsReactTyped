package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the ways the receipt printer station should feed the mark-sensed paper when you call the ReceiptPrintJob.MarkFeed method. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterMarkFeedKind")
@js.native
object PosPrinterMarkFeedKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind & Double
  ] = js.native
  
  /* 2 */ val toCurrentTopOfForm: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toCurrentTopOfForm & Double = js.native
  
  /* 1 */ val toCutter: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toCutter & Double = js.native
  
  /* 3 */ val toNextTopOfForm: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toNextTopOfForm & Double = js.native
  
  /* 0 */ val toTakeUp: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toTakeUp & Double = js.native
}
