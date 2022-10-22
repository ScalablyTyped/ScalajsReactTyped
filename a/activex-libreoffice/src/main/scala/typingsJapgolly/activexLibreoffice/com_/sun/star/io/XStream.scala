package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers read and write access to the same stream. */
trait XStream
  extends StObject
     with XInterface {
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  val InputStream: XInputStream
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  val OutputStream: XOutputStream
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  def getInputStream(): XInputStream
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  def getOutputStream(): XOutputStream
}
object XStream {
  
  inline def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: Callback,
    getInputStream: CallbackTo[XInputStream],
    getOutputStream: CallbackTo[XOutputStream],
    queryInterface: `type` => Any,
    release: Callback
  ): XStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInputStream = getInputStream.toJsFn, getOutputStream = getOutputStream.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStream]
  }
  
  extension [Self <: XStream](x: Self) {
    
    inline def setGetInputStream(value: CallbackTo[XInputStream]): Self = StObject.set(x, "getInputStream", value.toJsFn)
    
    inline def setGetOutputStream(value: CallbackTo[XOutputStream]): Self = StObject.set(x, "getOutputStream", value.toJsFn)
    
    inline def setInputStream(value: XInputStream): Self = StObject.set(x, "InputStream", value.asInstanceOf[js.Any])
    
    inline def setOutputStream(value: XOutputStream): Self = StObject.set(x, "OutputStream", value.asInstanceOf[js.Any])
  }
}
