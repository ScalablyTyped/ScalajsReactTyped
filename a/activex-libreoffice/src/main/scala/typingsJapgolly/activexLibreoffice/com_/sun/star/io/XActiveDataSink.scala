package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to read the corresponding object from an input stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
trait XActiveDataSink
  extends StObject
     with XInterface {
  
  /** @returns the plugged stream. */
  var InputStream: XInputStream
  
  /** @returns the plugged stream. */
  def getInputStream(): XInputStream
  
  /**
    * plugs the input stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for an {@link XConnectable} and connect both.
    */
  def setInputStream(aStream: XInputStream): Unit
}
object XActiveDataSink {
  
  inline def apply(
    InputStream: XInputStream,
    acquire: Callback,
    getInputStream: CallbackTo[XInputStream],
    queryInterface: `type` => Any,
    release: Callback,
    setInputStream: XInputStream => Callback
  ): XActiveDataSink = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInputStream = getInputStream.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()))
    __obj.asInstanceOf[XActiveDataSink]
  }
  
  extension [Self <: XActiveDataSink](x: Self) {
    
    inline def setGetInputStream(value: CallbackTo[XInputStream]): Self = StObject.set(x, "getInputStream", value.toJsFn)
    
    inline def setInputStream(value: XInputStream): Self = StObject.set(x, "InputStream", value.asInstanceOf[js.Any])
    
    inline def setSetInputStream(value: XInputStream => Callback): Self = StObject.set(x, "setInputStream", js.Any.fromFunction1((t0: XInputStream) => value(t0).runNow()))
  }
}
