package typingsJapgolly.nodeForge.mod

import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import typingsJapgolly.nodeForge.mod.util.ByteStringBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cipher {
  
  @JSImport("node-forge", "cipher")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCipher(algorithm: Algorithm, payload: Bytes): BlockCipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[BlockCipher]
  inline def createCipher(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[BlockCipher]
  
  inline def createDecipher(algorithm: Algorithm, payload: Bytes): BlockCipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[BlockCipher]
  inline def createDecipher(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[BlockCipher]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeForge.nodeForgeStrings.`AES-ECB`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CBC`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CFB`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`AES-OFB`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CTR`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`AES-GCM`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`3DES-ECB`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`3DES-CBC`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`DES-ECB`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`DES-CBC`
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def `3DES-CBC`: typingsJapgolly.nodeForge.nodeForgeStrings.`3DES-CBC` = "3DES-CBC".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`3DES-CBC`]
    
    inline def `3DES-ECB`: typingsJapgolly.nodeForge.nodeForgeStrings.`3DES-ECB` = "3DES-ECB".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`3DES-ECB`]
    
    inline def `AES-CBC`: typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CBC` = "AES-CBC".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CBC`]
    
    inline def `AES-CFB`: typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CFB` = "AES-CFB".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CFB`]
    
    inline def `AES-CTR`: typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CTR` = "AES-CTR".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`AES-CTR`]
    
    inline def `AES-ECB`: typingsJapgolly.nodeForge.nodeForgeStrings.`AES-ECB` = "AES-ECB".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`AES-ECB`]
    
    inline def `AES-GCM`: typingsJapgolly.nodeForge.nodeForgeStrings.`AES-GCM` = "AES-GCM".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`AES-GCM`]
    
    inline def `AES-OFB`: typingsJapgolly.nodeForge.nodeForgeStrings.`AES-OFB` = "AES-OFB".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`AES-OFB`]
    
    inline def `DES-CBC`: typingsJapgolly.nodeForge.nodeForgeStrings.`DES-CBC` = "DES-CBC".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`DES-CBC`]
    
    inline def `DES-ECB`: typingsJapgolly.nodeForge.nodeForgeStrings.`DES-ECB` = "DES-ECB".asInstanceOf[typingsJapgolly.nodeForge.nodeForgeStrings.`DES-ECB`]
  }
  
  @js.native
  trait BlockCipher extends StObject {
    
    def finish(): Boolean = js.native
    
    var mode: Mode = js.native
    
    var output: ByteStringBuffer = js.native
    
    def start(): Unit = js.native
    def start(options: StartOptions): Unit = js.native
    
    def update(payload: ByteBuffer): Unit = js.native
  }
  
  trait Mode extends StObject {
    
    var tag: ByteStringBuffer
  }
  object Mode {
    
    inline def apply(tag: ByteStringBuffer): Mode = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mode]
    }
    
    extension [Self <: Mode](x: Self) {
      
      inline def setTag(value: ByteStringBuffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartOptions extends StObject {
    
    var additionalData: js.UndefOr[String] = js.undefined
    
    var iv: js.UndefOr[ByteBuffer | js.Array[Byte] | Bytes] = js.undefined
    
    var tag: js.UndefOr[ByteStringBuffer] = js.undefined
    
    var tagLength: js.UndefOr[Double] = js.undefined
  }
  object StartOptions {
    
    inline def apply(): StartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOptions]
    }
    
    extension [Self <: StartOptions](x: Self) {
      
      inline def setAdditionalData(value: String): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      inline def setIv(value: ByteBuffer | js.Array[Byte] | Bytes): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setIvVarargs(value: Byte*): Self = StObject.set(x, "iv", js.Array(value*))
      
      inline def setTag(value: ByteStringBuffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagLength(value: Double): Self = StObject.set(x, "tagLength", value.asInstanceOf[js.Any])
      
      inline def setTagLengthUndefined: Self = StObject.set(x, "tagLength", js.undefined)
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
