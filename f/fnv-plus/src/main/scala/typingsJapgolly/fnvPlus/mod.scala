package typingsJapgolly.fnvPlus

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fnv-plus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fast1a32(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a32")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fast1a32hex(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a32hex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fast1a32hexutf(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a32hexutf")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fast1a32utf(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a32utf")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fast1a52(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a52")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fast1a52hex(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a52hex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fast1a52hexutf(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a52hexutf")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fast1a52utf(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a52utf")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fast1a64(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a64")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fast1a64hex(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a64hex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fast1a64hexutf(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a64hexutf")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fast1a64utf(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fast1a64utf")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hash(value: String): FnvHash = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(value.asInstanceOf[js.Any]).asInstanceOf[FnvHash]
  inline def hash(value: String, bitlength: Double): FnvHash = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(value.asInstanceOf[js.Any], bitlength.asInstanceOf[js.Any])).asInstanceOf[FnvHash]
  
  inline def seed(seed: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")(seed.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useUTF8(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUTF8")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait FnvHash extends StObject {
    
    /** Returns the hashed value as an decimal string */
    def dec(): String
    
    /** Returns the hashed value as an hexadecimal string */
    def hex(): String
    
    /** Returns the hashed value as an ascii string */
    def str(): String
  }
  object FnvHash {
    
    inline def apply(dec: CallbackTo[String], hex: CallbackTo[String], str: CallbackTo[String]): FnvHash = {
      val __obj = js.Dynamic.literal(dec = dec.toJsFn, hex = hex.toJsFn, str = str.toJsFn)
      __obj.asInstanceOf[FnvHash]
    }
    
    extension [Self <: FnvHash](x: Self) {
      
      inline def setDec(value: CallbackTo[String]): Self = StObject.set(x, "dec", value.toJsFn)
      
      inline def setHex(value: CallbackTo[String]): Self = StObject.set(x, "hex", value.toJsFn)
      
      inline def setStr(value: CallbackTo[String]): Self = StObject.set(x, "str", value.toJsFn)
    }
  }
}
