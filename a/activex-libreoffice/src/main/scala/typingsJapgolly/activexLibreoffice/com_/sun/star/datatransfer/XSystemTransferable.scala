package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to be implemented by objects used to provide system dependent data for a transfer operation. Those objects usually also implement {@link
  * XTransferable} .
  */
trait XSystemTransferable
  extends StObject
     with XInterface {
  
  /**
    * Called by a data consumer to obtain a system specific data object from the source. The data object is returned in an any. The contained type may
    * differ on different platforms.
    * @param aProcessId The argument aProcessId is a process identifier of the caller's process. The interface implementation must ensure that the system data
    * @returns The system dependent data object.; ;   **Notes:** Under Windows the returned any contains an unsigned long which represents a pointer to an IData
    */
  def getData(aProcessId: SeqEquiv[Double]): Any
}
object XSystemTransferable {
  
  inline def apply(
    acquire: Callback,
    getData: SeqEquiv[Double] => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XSystemTransferable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getData = js.Any.fromFunction1(getData), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSystemTransferable]
  }
  
  extension [Self <: XSystemTransferable](x: Self) {
    
    inline def setGetData(value: SeqEquiv[Double] => Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
  }
}
