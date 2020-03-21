package typingsJapgolly.winrtUwp.Windows.Devices.Printers

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs to access a 3D printer's capabilities and print tickets. */
@JSGlobal("Windows.Devices.Printers.PrintSchema")
@js.native
abstract class PrintSchema () extends js.Object {
  /**
    * Gets the 3D printer capabilities.
    * @param constrainTicket The print ticket.
    * @return An XML PrintCapabilities document containing 3D printer capabilities.
    */
  def getCapabilitiesAsync(constrainTicket: IRandomAccessStreamWithContentType): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /**
    * Gets the 3D printer's default print ticket.
    * @return An XML PrintTicket document containing the 3D printer's default print ticket.
    */
  def getDefaultPrintTicketAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /**
    * Creates a new print ticket by merging the user’s selection with the default print ticket and validating that it will work for the device.
    * @param deltaTicket The delta print ticket, specifies the differences between the default print ticket and the user's selections.
    * @return An XML PrintTicket document containing the suggested print ticket.
    */
  def mergeAndValidateWithDefaultPrintTicketAsync(deltaTicket: IRandomAccessStreamWithContentType): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}

