package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * has to be implemented if the class should be able to write into an output stream.
  * @see XActiveDataControl.
  */
trait XActiveDataSource
  extends StObject
     with XInterface {
  
  /** @returns the plugged stream. */
  var OutputStream: XOutputStream
  
  /** @returns the plugged stream. */
  def getOutputStream(): XOutputStream
  
  /**
    * plugs the output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setOutputStream(aStream: XOutputStream): Unit
}
object XActiveDataSource {
  
  inline def apply(
    OutputStream: XOutputStream,
    acquire: Callback,
    getOutputStream: CallbackTo[XOutputStream],
    queryInterface: `type` => Any,
    release: Callback,
    setOutputStream: XOutputStream => Callback
  ): XActiveDataSource = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, getOutputStream = getOutputStream.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()))
    __obj.asInstanceOf[XActiveDataSource]
  }
  
  extension [Self <: XActiveDataSource](x: Self) {
    
    inline def setGetOutputStream(value: CallbackTo[XOutputStream]): Self = StObject.set(x, "getOutputStream", value.toJsFn)
    
    inline def setOutputStream(value: XOutputStream): Self = StObject.set(x, "OutputStream", value.asInstanceOf[js.Any])
    
    inline def setSetOutputStream(value: XOutputStream => Callback): Self = StObject.set(x, "setOutputStream", js.Any.fromFunction1((t0: XOutputStream) => value(t0).runNow()))
  }
}
