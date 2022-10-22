package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to seek to a certain position within a stream.
  *
  * This interface should be supported, if it is possible to access the data at the new position quickly. You should not support this interface, if you
  * have a continuous stream, for example, a video stream.
  */
trait XSeekable
  extends StObject
     with XInterface {
  
  /**
    * returns the length of the stream.
    * @returns the length of the storage medium on which the stream works.
    */
  val Length: Double
  
  /**
    * returns the current offset of the stream.
    * @returns the current offset in this stream.
    */
  val Position: Double
  
  /**
    * returns the length of the stream.
    * @returns the length of the storage medium on which the stream works.
    */
  def getLength(): Double
  
  /**
    * returns the current offset of the stream.
    * @returns the current offset in this stream.
    */
  def getPosition(): Double
  
  /**
    * changes the seek pointer to a new location relative to the beginning of the stream.
    *
    * This method changes the seek pointer so subsequent reads and writes can take place at a different location in the stream object. It is an error to
    * seek before the beginning of the stream or after the end of the stream.
    * @throws com::sun::star::lang::IllegalArgumentException in case location is negative or greater than {@link XSeekable.getLength()} .
    */
  def seek(location: Double): Unit
}
object XSeekable {
  
  inline def apply(
    Length: Double,
    Position: Double,
    acquire: Callback,
    getLength: CallbackTo[Double],
    getPosition: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    seek: Double => Callback
  ): XSeekable = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLength = getLength.toJsFn, getPosition = getPosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()))
    __obj.asInstanceOf[XSeekable]
  }
  
  extension [Self <: XSeekable](x: Self) {
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Double]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
