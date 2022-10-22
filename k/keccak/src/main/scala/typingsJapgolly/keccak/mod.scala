package typingsJapgolly.keccak

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keccak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(algorithm: KeccakAlgorithm): Keccak = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Keccak]
  inline def default(algorithm: KeccakAlgorithm, options: TransformOptions): Keccak = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Keccak]
  inline def default(algorithm: Sha3Algorithm): Keccak = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Keccak]
  inline def default(algorithm: Sha3Algorithm, options: TransformOptions): Keccak = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Keccak]
  inline def default(algorithm: ShakeAlgorithm): Shake = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Shake]
  inline def default(algorithm: ShakeAlgorithm, options: TransformOptions): Shake = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Shake]
  
  @JSImport("keccak", "Keccak")
  @js.native
  open class Keccak protected () extends Transform {
    def this(
      rate: Double,
      capacity: Double,
      delimitedSuffix: Double,
      hashBitLength: Double,
      options: TransformOptions
    ) = this()
    def this(
      rate: Double,
      capacity: Double,
      delimitedSuffix: Null,
      hashBitLength: Double,
      options: TransformOptions
    ) = this()
    
    def digest(): Buffer = js.native
    def digest(encoding: BufferEncoding): String = js.native
    
    def update(data: String): Keccak = js.native
    def update(data: String, encoding: BufferEncoding): Keccak = js.native
    def update(data: Buffer): Keccak = js.native
    def update(data: Buffer, encoding: BufferEncoding): Keccak = js.native
  }
  
  @JSImport("keccak", "Shake")
  @js.native
  open class Shake protected () extends Transform {
    def this(rate: Double, capacity: Double, delimitedSuffix: Double, options: TransformOptions) = this()
    def this(rate: Double, capacity: Double, delimitedSuffix: Null, options: TransformOptions) = this()
    
    def squeeze(dataByteLength: Double): Buffer = js.native
    def squeeze(dataByteLength: Double, encoding: BufferEncoding): String = js.native
    
    def update(data: String): Shake = js.native
    def update(data: String, encoding: BufferEncoding): Shake = js.native
    def update(data: Buffer): Shake = js.native
    def update(data: Buffer, encoding: BufferEncoding): Shake = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.keccak.keccakStrings.keccak224
    - typingsJapgolly.keccak.keccakStrings.keccak256
    - typingsJapgolly.keccak.keccakStrings.keccak384
    - typingsJapgolly.keccak.keccakStrings.keccak512
  */
  trait KeccakAlgorithm extends StObject
  object KeccakAlgorithm {
    
    inline def keccak224: typingsJapgolly.keccak.keccakStrings.keccak224 = "keccak224".asInstanceOf[typingsJapgolly.keccak.keccakStrings.keccak224]
    
    inline def keccak256: typingsJapgolly.keccak.keccakStrings.keccak256 = "keccak256".asInstanceOf[typingsJapgolly.keccak.keccakStrings.keccak256]
    
    inline def keccak384: typingsJapgolly.keccak.keccakStrings.keccak384 = "keccak384".asInstanceOf[typingsJapgolly.keccak.keccakStrings.keccak384]
    
    inline def keccak512: typingsJapgolly.keccak.keccakStrings.keccak512 = "keccak512".asInstanceOf[typingsJapgolly.keccak.keccakStrings.keccak512]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.keccak.keccakStrings.`sha3-224`
    - typingsJapgolly.keccak.keccakStrings.`sha3-256`
    - typingsJapgolly.keccak.keccakStrings.`sha3-384`
    - typingsJapgolly.keccak.keccakStrings.`sha3-512`
  */
  trait Sha3Algorithm extends StObject
  object Sha3Algorithm {
    
    inline def `sha3-224`: typingsJapgolly.keccak.keccakStrings.`sha3-224` = "sha3-224".asInstanceOf[typingsJapgolly.keccak.keccakStrings.`sha3-224`]
    
    inline def `sha3-256`: typingsJapgolly.keccak.keccakStrings.`sha3-256` = "sha3-256".asInstanceOf[typingsJapgolly.keccak.keccakStrings.`sha3-256`]
    
    inline def `sha3-384`: typingsJapgolly.keccak.keccakStrings.`sha3-384` = "sha3-384".asInstanceOf[typingsJapgolly.keccak.keccakStrings.`sha3-384`]
    
    inline def `sha3-512`: typingsJapgolly.keccak.keccakStrings.`sha3-512` = "sha3-512".asInstanceOf[typingsJapgolly.keccak.keccakStrings.`sha3-512`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.keccak.keccakStrings.shake128
    - typingsJapgolly.keccak.keccakStrings.shake256
  */
  trait ShakeAlgorithm extends StObject
  object ShakeAlgorithm {
    
    inline def shake128: typingsJapgolly.keccak.keccakStrings.shake128 = "shake128".asInstanceOf[typingsJapgolly.keccak.keccakStrings.shake128]
    
    inline def shake256: typingsJapgolly.keccak.keccakStrings.shake256 = "shake256".asInstanceOf[typingsJapgolly.keccak.keccakStrings.shake256]
  }
}
