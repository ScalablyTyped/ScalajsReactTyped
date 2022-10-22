package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides direct access to the data in all data flavors. It can be used by the clipboard implementation to optimize data transport on
  * flush operations.
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferDataAccess
  extends StObject
     with XInterface {
  
  /**
    * To get all the data of a sequence of {@link DataFlavor} .
    * @param aFlavorList The sequence of requested {@link DataFlavor} . An unsupported {@link DataFlavor} will be ignored.
    * @returns The data in the requested {@link DataFlavor} . For unsupported {@link DataFlavor} an empty any will be returned.
    */
  def getData(aFlavorList: SeqEquiv[DataFlavor]): SafeArray[Any]
  
  /**
    * To query for the summarized data size in bytes of a sequence of {@link DataFlavor} .
    * @param aFlavorList A sequence of requested {@link DataFlavor} . An unsupported {@link DataFlavor} will be ignored.
    * @returns The number of bytes of the transfer data in the specified sequence of {@link DataFlavor} .
    */
  def queryDataSize(aFlavorList: SeqEquiv[DataFlavor]): Double
}
object XTransferDataAccess {
  
  inline def apply(
    acquire: Callback,
    getData: SeqEquiv[DataFlavor] => SafeArray[Any],
    queryDataSize: SeqEquiv[DataFlavor] => Double,
    queryInterface: `type` => Any,
    release: Callback
  ): XTransferDataAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getData = js.Any.fromFunction1(getData), queryDataSize = js.Any.fromFunction1(queryDataSize), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTransferDataAccess]
  }
  
  extension [Self <: XTransferDataAccess](x: Self) {
    
    inline def setGetData(value: SeqEquiv[DataFlavor] => SafeArray[Any]): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setQueryDataSize(value: SeqEquiv[DataFlavor] => Double): Self = StObject.set(x, "queryDataSize", js.Any.fromFunction1(value))
  }
}
