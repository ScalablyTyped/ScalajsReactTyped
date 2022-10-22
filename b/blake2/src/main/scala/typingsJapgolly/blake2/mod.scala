package typingsJapgolly.blake2

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.cryptoMod.BinaryToTextEncoding
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blake2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("blake2", "Hash")
  @js.native
  open class Hash protected () extends Transform {
    def this(algorithm: Blake2Algorithm) = this()
    def this(algorithm: Blake2Algorithm, options: Blake2Options) = this()
    
    def copy(): this.type = js.native
    
    def digest(): Buffer = js.native
    def digest(encoding: BinaryToTextEncoding): String = js.native
    
    def update(buf: Buffer): this.type = js.native
  }
  
  @JSImport("blake2", "KeyedHash")
  @js.native
  open class KeyedHash protected () extends Transform {
    def this(algorithm: Blake2Algorithm, key: Buffer) = this()
    def this(algorithm: Blake2Algorithm, key: Buffer, options: Blake2Options) = this()
    
    def copy(): this.type = js.native
    
    def digest(): Buffer = js.native
    def digest(encoding: BinaryToTextEncoding): String = js.native
    
    def update(buf: Buffer): this.type = js.native
  }
  
  inline def createHash(algorithm: Blake2Algorithm): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
  inline def createHash(algorithm: Blake2Algorithm, options: Blake2Options): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hash]
  
  inline def createKeyedHash(algorithm: Blake2Algorithm, key: Buffer): KeyedHash = (^.asInstanceOf[js.Dynamic].applyDynamic("createKeyedHash")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[KeyedHash]
  inline def createKeyedHash(algorithm: Blake2Algorithm, key: Buffer, options: Blake2Options): KeyedHash = (^.asInstanceOf[js.Dynamic].applyDynamic("createKeyedHash")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyedHash]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blake2.blake2Strings.blake2b
    - typingsJapgolly.blake2.blake2Strings.blake2bp
    - typingsJapgolly.blake2.blake2Strings.blake2s
    - typingsJapgolly.blake2.blake2Strings.blake2sp
    - typingsJapgolly.blake2.blake2Strings.bypass
  */
  trait Blake2Algorithm extends StObject
  object Blake2Algorithm {
    
    inline def blake2b: typingsJapgolly.blake2.blake2Strings.blake2b = "blake2b".asInstanceOf[typingsJapgolly.blake2.blake2Strings.blake2b]
    
    inline def blake2bp: typingsJapgolly.blake2.blake2Strings.blake2bp = "blake2bp".asInstanceOf[typingsJapgolly.blake2.blake2Strings.blake2bp]
    
    inline def blake2s: typingsJapgolly.blake2.blake2Strings.blake2s = "blake2s".asInstanceOf[typingsJapgolly.blake2.blake2Strings.blake2s]
    
    inline def blake2sp: typingsJapgolly.blake2.blake2Strings.blake2sp = "blake2sp".asInstanceOf[typingsJapgolly.blake2.blake2Strings.blake2sp]
    
    inline def bypass: typingsJapgolly.blake2.blake2Strings.bypass = "bypass".asInstanceOf[typingsJapgolly.blake2.blake2Strings.bypass]
  }
  
  trait Blake2Options
    extends StObject
       with TransformOptions {
    
    var digestLength: Double
  }
  object Blake2Options {
    
    inline def apply(digestLength: Double): Blake2Options = {
      val __obj = js.Dynamic.literal(digestLength = digestLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blake2Options]
    }
    
    extension [Self <: Blake2Options](x: Self) {
      
      inline def setDigestLength(value: Double): Self = StObject.set(x, "digestLength", value.asInstanceOf[js.Any])
    }
  }
}
