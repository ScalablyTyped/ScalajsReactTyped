package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** reads {@link XPersistObject} implementations from a stream */
trait XObjectInputStream
  extends StObject
     with XDataInputStream {
  
  /**
    * reads an object from the stream. In general, it reads the service name, instantiaties the object and calls read on the {@link XPersistObject}
    * interface with itself as argument.
    */
  def readObject(): XPersistObject
}
object XObjectInputStream {
  
  inline def apply(
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    queryInterface: `type` => Any,
    readBoolean: CallbackTo[Double],
    readByte: CallbackTo[Double],
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readChar: CallbackTo[String],
    readDouble: CallbackTo[Double],
    readFloat: CallbackTo[Double],
    readHyper: CallbackTo[Double],
    readLong: CallbackTo[Double],
    readObject: CallbackTo[XPersistObject],
    readShort: CallbackTo[Double],
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readUTF: CallbackTo[String],
    release: Callback,
    skipBytes: Double => Callback
  ): XObjectInputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = readBoolean.toJsFn, readByte = readByte.toJsFn, readBytes = js.Any.fromFunction2(readBytes), readChar = readChar.toJsFn, readDouble = readDouble.toJsFn, readFloat = readFloat.toJsFn, readHyper = readHyper.toJsFn, readLong = readLong.toJsFn, readObject = readObject.toJsFn, readShort = readShort.toJsFn, readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = readUTF.toJsFn, release = release.toJsFn, skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[XObjectInputStream]
  }
  
  extension [Self <: XObjectInputStream](x: Self) {
    
    inline def setReadObject(value: CallbackTo[XPersistObject]): Self = StObject.set(x, "readObject", value.toJsFn)
  }
}
