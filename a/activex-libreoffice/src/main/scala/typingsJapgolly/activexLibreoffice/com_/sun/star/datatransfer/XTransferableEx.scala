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
  * Interface to be implemented by objects used to provide data for a transfer operation.
  * @see com.sun.star.datatransfer.DataFlavor
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferableEx
  extends StObject
     with XInterface {
  
  /**
    * @param requestedFlavors Sequence of {@link DataFlavor} of interest. Specify an empty sequence for interest in all data flavors with top-level MIME conte
    * @returns The list of the matching supported {@link DataFlavor} that were requested. For each requested top-level MIME content-type, all supported subtypes
    */
  def queryTransferDataFlavors(requestedFlavors: SeqEquiv[DataFlavor]): SafeArray[DataFlavor]
}
object XTransferableEx {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    queryTransferDataFlavors: SeqEquiv[DataFlavor] => SafeArray[DataFlavor],
    release: Callback
  ): XTransferableEx = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), queryTransferDataFlavors = js.Any.fromFunction1(queryTransferDataFlavors), release = release.toJsFn)
    __obj.asInstanceOf[XTransferableEx]
  }
  
  extension [Self <: XTransferableEx](x: Self) {
    
    inline def setQueryTransferDataFlavors(value: SeqEquiv[DataFlavor] => SafeArray[DataFlavor]): Self = StObject.set(x, "queryTransferDataFlavors", js.Any.fromFunction1(value))
  }
}
