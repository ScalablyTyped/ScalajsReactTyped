package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to be implemented by objects used to provide data for a data transfer operation.
  * @see com.sun.star.datatransfer.DataFlavor
  */
trait XTransferable
  extends StObject
     with XInterface {
  
  /**
    * Returns a sequence of supported {@link DataFlavor} .
    * @returns The sequence of supported {@link DataFlavor} .
    * @see com.sun.star.datatransfer.DataFlavor
    */
  val TransferDataFlavors: SafeArray[DataFlavor]
  
  /**
    * Called by a data consumer to obtain data from the source in a specified format.
    * @param aFlavor Describes the requested data format
    * @returns The data in the specified {@link DataFlavor} .
    * @throws com::sun::star::io::IOException if the data is no longer available in the requested flavor.
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the requested {@link DataFlavor} is not supported.
    */
  def getTransferData(aFlavor: DataFlavor): Any
  
  /**
    * Returns a sequence of supported {@link DataFlavor} .
    * @returns The sequence of supported {@link DataFlavor} .
    * @see com.sun.star.datatransfer.DataFlavor
    */
  def getTransferDataFlavors(): SafeArray[DataFlavor]
  
  /**
    * Checks if the data object supports the specified data flavor.
    * @param aFlavor Describes the format that should be checked
    * @returns A value of `TRUE` if the {@link DataFlavor} is supported by the transfer source. A value of `FALSE` if the {@link DataFlavor} is unsupported by t
    */
  def isDataFlavorSupported(aFlavor: DataFlavor): Boolean
}
object XTransferable {
  
  inline def apply(
    TransferDataFlavors: SafeArray[DataFlavor],
    acquire: Callback,
    getTransferData: DataFlavor => Any,
    getTransferDataFlavors: CallbackTo[SafeArray[DataFlavor]],
    isDataFlavorSupported: DataFlavor => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XTransferable = {
    val __obj = js.Dynamic.literal(TransferDataFlavors = TransferDataFlavors.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTransferData = js.Any.fromFunction1(getTransferData), getTransferDataFlavors = getTransferDataFlavors.toJsFn, isDataFlavorSupported = js.Any.fromFunction1(isDataFlavorSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTransferable]
  }
  
  extension [Self <: XTransferable](x: Self) {
    
    inline def setGetTransferData(value: DataFlavor => Any): Self = StObject.set(x, "getTransferData", js.Any.fromFunction1(value))
    
    inline def setGetTransferDataFlavors(value: CallbackTo[SafeArray[DataFlavor]]): Self = StObject.set(x, "getTransferDataFlavors", value.toJsFn)
    
    inline def setIsDataFlavorSupported(value: DataFlavor => Boolean): Self = StObject.set(x, "isDataFlavorSupported", js.Any.fromFunction1(value))
    
    inline def setTransferDataFlavors(value: SafeArray[DataFlavor]): Self = StObject.set(x, "TransferDataFlavors", value.asInstanceOf[js.Any])
  }
}
