package typingsJapgolly.byteRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Calculates integer ranges for a given number of bytes.
    *
    * @param bytes Number of bytes to return the integer range for. Must be a positive integer.
    */
  inline def apply(bytes: Double): ByteRange = ^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any]).asInstanceOf[ByteRange]
  inline def apply(bytes: Double, options: Options): ByteRange = (^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ByteRange]
  
  @JSImport("byte-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Precomputed byte range for an signed 16 bit integer.
    */
  @JSImport("byte-range", "int16")
  @js.native
  val int16: ByteRange = js.native
  
  /**
    * Precomputed byte range for an signed 32 bit integer.
    */
  @JSImport("byte-range", "int32")
  @js.native
  val int32: ByteRange = js.native
  
  /**
    * Precomputed byte range for an signed 8 bit integer.
    */
  @JSImport("byte-range", "int8")
  @js.native
  val int8: ByteRange = js.native
  
  /**
    * Precomputed byte range for an unsigned 16 bit integer.
    */
  @JSImport("byte-range", "uint16")
  @js.native
  val uint16: ByteRange = js.native
  
  /**
    * Precomputed byte range for an unsigned 32 bit integer.
    */
  @JSImport("byte-range", "uint32")
  @js.native
  val uint32: ByteRange = js.native
  
  /**
    * Precomputed byte range for an unsigned 8 bit integer.
    */
  @JSImport("byte-range", "uint8")
  @js.native
  val uint8: ByteRange = js.native
  
  type ByteRange = js.Tuple2[Double, Double]
  
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
}
