package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to read and write the corresponding stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
trait XActiveDataStreamer
  extends StObject
     with XInterface {
  
  /** @returns the plugged stream. */
  var Stream: XStream
  
  /** @returns the plugged stream. */
  def getStream(): XStream
  
  /**
    * plugs the input/output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setStream(aStream: XStream): Unit
}
object XActiveDataStreamer {
  
  inline def apply(
    Stream: XStream,
    acquire: Callback,
    getStream: CallbackTo[XStream],
    queryInterface: `type` => Any,
    release: Callback,
    setStream: XStream => Callback
  ): XActiveDataStreamer = {
    val __obj = js.Dynamic.literal(Stream = Stream.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStream = getStream.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setStream = js.Any.fromFunction1((t0: XStream) => setStream(t0).runNow()))
    __obj.asInstanceOf[XActiveDataStreamer]
  }
  
  extension [Self <: XActiveDataStreamer](x: Self) {
    
    inline def setGetStream(value: CallbackTo[XStream]): Self = StObject.set(x, "getStream", value.toJsFn)
    
    inline def setSetStream(value: XStream => Callback): Self = StObject.set(x, "setStream", js.Any.fromFunction1((t0: XStream) => value(t0).runNow()))
    
    inline def setStream(value: XStream): Self = StObject.set(x, "Stream", value.asInstanceOf[js.Any])
  }
}
