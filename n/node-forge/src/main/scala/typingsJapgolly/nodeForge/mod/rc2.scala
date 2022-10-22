package typingsJapgolly.nodeForge.mod

import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rc2 {
  
  @JSImport("node-forge", "rc2")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDecryptionCipher(key: String): typingsJapgolly.nodeForge.mod.rc2.cipher = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecryptionCipher")(key.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def createDecryptionCipher(key: String, bits: Double): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecryptionCipher")(key.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def createDecryptionCipher(key: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecryptionCipher")(key.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def createDecryptionCipher(key: ByteBuffer, bits: Double): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecryptionCipher")(key.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  
  inline def createEncryptionCipher(key: String): typingsJapgolly.nodeForge.mod.rc2.cipher = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncryptionCipher")(key.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def createEncryptionCipher(key: String, bits: Double): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createEncryptionCipher")(key.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def createEncryptionCipher(key: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncryptionCipher")(key.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def createEncryptionCipher(key: ByteBuffer, bits: Double): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createEncryptionCipher")(key.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  
  inline def expandKey(key: String): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("expandKey")(key.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  inline def expandKey(key: String, effKeyBits: Double): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expandKey")(key.asInstanceOf[js.Any], effKeyBits.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  inline def expandKey(key: ByteBuffer): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("expandKey")(key.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  inline def expandKey(key: ByteBuffer, effKeyBits: Double): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expandKey")(key.asInstanceOf[js.Any], effKeyBits.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  inline def startDecrypting(key: String, iv: js.Array[Byte]): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: String, iv: js.Array[Byte], output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: String, iv: Bytes): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: String, iv: Bytes, output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: String, iv: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: String, iv: ByteBuffer, output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: ByteBuffer, iv: js.Array[Byte]): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: ByteBuffer, iv: js.Array[Byte], output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: ByteBuffer, iv: Bytes): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: ByteBuffer, iv: Bytes, output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: ByteBuffer, iv: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startDecrypting(key: ByteBuffer, iv: ByteBuffer, output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startDecrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  
  inline def startEncrypting(key: String, iv: js.Array[Byte]): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: String, iv: js.Array[Byte], output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: String, iv: Bytes): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: String, iv: Bytes, output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: String, iv: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: String, iv: ByteBuffer, output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: ByteBuffer, iv: js.Array[Byte]): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: ByteBuffer, iv: js.Array[Byte], output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: ByteBuffer, iv: Bytes): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: ByteBuffer, iv: Bytes, output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: ByteBuffer, iv: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  inline def startEncrypting(key: ByteBuffer, iv: ByteBuffer, output: ByteBuffer): typingsJapgolly.nodeForge.mod.rc2.cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("startEncrypting")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.rc2.cipher]
  
  @js.native
  trait cipher extends StObject {
    
    def finish(): Boolean = js.native
    def finish(pad: padFunction): Boolean = js.native
    
    var output: ByteBuffer = js.native
    
    def start(): Unit = js.native
    def start(iv: String): Unit = js.native
    def start(iv: String, output: ByteBuffer): Unit = js.native
    def start(iv: Null, output: ByteBuffer): Unit = js.native
    def start(iv: ByteBuffer): Unit = js.native
    def start(iv: ByteBuffer, output: ByteBuffer): Unit = js.native
    
    def update(input: ByteBuffer): Unit = js.native
  }
  
  type padFunction = js.Function3[/* blockSize */ Double, /* buffer */ ByteBuffer, /* decrypt */ Boolean, Boolean]
}
