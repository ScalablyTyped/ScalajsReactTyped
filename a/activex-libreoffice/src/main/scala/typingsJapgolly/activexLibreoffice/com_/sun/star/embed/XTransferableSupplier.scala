package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provide access to a {@link com.sun.star.datatransfer.XTransferable} implementation from the object. */
trait XTransferableSupplier
  extends StObject
     with XInterface {
  
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns implementation
    */
  val Transferable: XTransferable
  
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns implementation
    */
  def getTransferable(): XTransferable
}
object XTransferableSupplier {
  
  inline def apply(
    Transferable: XTransferable,
    acquire: Callback,
    getTransferable: CallbackTo[XTransferable],
    queryInterface: `type` => Any,
    release: Callback
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTransferable = getTransferable.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTransferableSupplier]
  }
  
  extension [Self <: XTransferableSupplier](x: Self) {
    
    inline def setGetTransferable(value: CallbackTo[XTransferable]): Self = StObject.set(x, "getTransferable", value.toJsFn)
    
    inline def setTransferable(value: XTransferable): Self = StObject.set(x, "Transferable", value.asInstanceOf[js.Any])
  }
}
