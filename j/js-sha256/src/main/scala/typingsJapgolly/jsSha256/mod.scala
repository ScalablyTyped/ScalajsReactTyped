package typingsJapgolly.jsSha256

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-sha256", "sha224")
  @js.native
  def sha224: Hash = js.native
  inline def sha224_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha224")(x.asInstanceOf[js.Any])
  
  @JSImport("js-sha256", "sha256")
  @js.native
  def sha256: Hash = js.native
  inline def sha256_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Hash extends StObject {
    
    /**
      * Hash and return hex string.
      *
      * @param message The message you want to hash.
      */
    def apply(message: Message): String = js.native
    
    /**
      * Return hash in integer array.
      *
      * @param message The message you want to hash.
      */
    def array(message: Message): js.Array[Double] = js.native
    
    /**
      * Return hash in ArrayBuffer.
      *
      * @param message The message you want to hash.
      */
    def arrayBuffer(message: Message): js.typedarray.ArrayBuffer = js.native
    
    /**
      * Create a hash object.
      */
    def create(): Hasher = js.native
    
    /**
      * Return hash in integer array.
      *
      * @param message The message you want to hash.
      */
    def digest(message: Message): js.Array[Double] = js.native
    
    /**
      * Return hash in hex string.
      *
      * @param message The message you want to hash.
      */
    def hex(message: Message): String = js.native
    
    /**
      * Computes a Hash-based message authentication code (HMAC) using a secret key
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    /**
      * HMAC interface
      */
    def hmac(secretKey: String, message: Message): String = js.native
    /**
      * HMAC interface
      */
    @JSName("hmac")
    var hmac_Original: Hmac = js.native
    
    /**
      * Create a hash object and hash message.
      *
      * @param message The message you want to hash.
      */
    def update(message: Message): Hasher = js.native
  }
  
  trait Hasher extends StObject {
    
    /**
      * Return hash in integer array.
      */
    def array(): js.Array[Double]
    
    /**
      * Return hash in ArrayBuffer.
      */
    def arrayBuffer(): js.typedarray.ArrayBuffer
    
    /**
      * Return hash in integer array.
      */
    def digest(): js.Array[Double]
    
    /**
      * Return hash in hex string.
      */
    def hex(): String
    
    /**
      * Update hash
      *
      * @param message The message you want to hash.
      */
    def update(message: Message): Hasher
  }
  object Hasher {
    
    inline def apply(
      array: CallbackTo[js.Array[Double]],
      arrayBuffer: CallbackTo[js.typedarray.ArrayBuffer],
      digest: CallbackTo[js.Array[Double]],
      hex: CallbackTo[String],
      update: Message => Hasher
    ): Hasher = {
      val __obj = js.Dynamic.literal(array = array.toJsFn, arrayBuffer = arrayBuffer.toJsFn, digest = digest.toJsFn, hex = hex.toJsFn, update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Hasher]
    }
    
    extension [Self <: Hasher](x: Self) {
      
      inline def setArray(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "array", value.toJsFn)
      
      inline def setArrayBuffer(value: CallbackTo[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setDigest(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "digest", value.toJsFn)
      
      inline def setHex(value: CallbackTo[String]): Self = StObject.set(x, "hex", value.toJsFn)
      
      inline def setUpdate(value: Message => Hasher): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Hmac extends StObject {
    
    /**
      * Computes a Hash-based message authentication code (HMAC) using a secret key
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def apply(secretKey: String, message: Message): String = js.native
    
    /**
      * Return hash in integer array.
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def array(secretKey: String, message: Message): js.Array[Double] = js.native
    
    /**
      * Return hash in ArrayBuffer.
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def arrayBuffer(secretKey: String, message: Message): js.typedarray.ArrayBuffer = js.native
    
    /**
      * Create a hash object using a secret key.
      *
      * @param secretKey The Secret Key
      */
    def create(secretKey: String): Hasher = js.native
    
    /**
      * Return hash in integer array.
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def digest(secretKey: String, message: Message): js.Array[Double] = js.native
    
    /**
      * Return hash in hex string.
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def hex(secretKey: String, message: Message): String = js.native
    
    /**
      * Create a hash object and hash message using a secret key
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def update(secretKey: String, message: Message): Hasher = js.native
  }
  
  type Message = String | js.Array[Double] | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array
}
