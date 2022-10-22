package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcDirectionalIndexByteEncoderMod {
  
  trait DirectionalIndexByteEncoder extends StObject {
    
    def writeBytes(value: ByteString): Unit
    
    def writeInfinity(): Unit
    
    def writeNumber(value: Double): Unit
    
    def writeString(value: String): Unit
  }
  object DirectionalIndexByteEncoder {
    
    inline def apply(
      writeBytes: ByteString => Callback,
      writeInfinity: Callback,
      writeNumber: Double => Callback,
      writeString: String => Callback
    ): DirectionalIndexByteEncoder = {
      val __obj = js.Dynamic.literal(writeBytes = js.Any.fromFunction1((t0: ByteString) => writeBytes(t0).runNow()), writeInfinity = writeInfinity.toJsFn, writeNumber = js.Any.fromFunction1((t0: Double) => writeNumber(t0).runNow()), writeString = js.Any.fromFunction1((t0: String) => writeString(t0).runNow()))
      __obj.asInstanceOf[DirectionalIndexByteEncoder]
    }
    
    extension [Self <: DirectionalIndexByteEncoder](x: Self) {
      
      inline def setWriteBytes(value: ByteString => Callback): Self = StObject.set(x, "writeBytes", js.Any.fromFunction1((t0: ByteString) => value(t0).runNow()))
      
      inline def setWriteInfinity(value: Callback): Self = StObject.set(x, "writeInfinity", value.toJsFn)
      
      inline def setWriteNumber(value: Double => Callback): Self = StObject.set(x, "writeNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setWriteString(value: String => Callback): Self = StObject.set(x, "writeString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
