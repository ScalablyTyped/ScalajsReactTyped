package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTransferable2
  extends StObject
     with XTransferable {
  
  /**
    * This is equivalent of getTransferData of {@link XTransferable} , but takes an additional parameter that specifies the destination document type.
    * @param aFlavor requested data format
    * @param aDestShellID destination document shell ID. The ID of each individual shell must be unique.
    * @returns data in specified data format.
    * @throws com::sun::star::io::IOException if the data is no longer available in the requested flavor.
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the requested {@link DataFlavor} is not supported.
    */
  def getTransferData2(aFlavor: DataFlavor, aDestShellID: String): Any
}
object XTransferable2 {
  
  inline def apply(
    TransferDataFlavors: SafeArray[DataFlavor],
    acquire: Callback,
    getTransferData: DataFlavor => Any,
    getTransferData2: (DataFlavor, String) => Any,
    getTransferDataFlavors: CallbackTo[SafeArray[DataFlavor]],
    isDataFlavorSupported: DataFlavor => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XTransferable2 = {
    val __obj = js.Dynamic.literal(TransferDataFlavors = TransferDataFlavors.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTransferData = js.Any.fromFunction1(getTransferData), getTransferData2 = js.Any.fromFunction2(getTransferData2), getTransferDataFlavors = getTransferDataFlavors.toJsFn, isDataFlavorSupported = js.Any.fromFunction1(isDataFlavorSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTransferable2]
  }
  
  extension [Self <: XTransferable2](x: Self) {
    
    inline def setGetTransferData2(value: (DataFlavor, String) => Any): Self = StObject.set(x, "getTransferData2", js.Any.fromFunction2(value))
  }
}
