package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface offers access to the written bytes */
trait XSequenceOutputStream
  extends StObject
     with XOutputStream {
  
  /** allows to get access to the written data */
  val WrittenBytes: SafeArray[Double]
  
  /** allows to get access to the written data */
  def getWrittenBytes(): SafeArray[Double]
}
object XSequenceOutputStream {
  
  inline def apply(
    WrittenBytes: SafeArray[Double],
    acquire: Callback,
    closeOutput: Callback,
    flush: Callback,
    getWrittenBytes: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback,
    writeBytes: SeqEquiv[Double] => Callback
  ): XSequenceOutputStream = {
    val __obj = js.Dynamic.literal(WrittenBytes = WrittenBytes.asInstanceOf[js.Any], acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, getWrittenBytes = getWrittenBytes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()))
    __obj.asInstanceOf[XSequenceOutputStream]
  }
  
  extension [Self <: XSequenceOutputStream](x: Self) {
    
    inline def setGetWrittenBytes(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getWrittenBytes", value.toJsFn)
    
    inline def setWrittenBytes(value: SafeArray[Double]): Self = StObject.set(x, "WrittenBytes", value.asInstanceOf[js.Any])
  }
}
