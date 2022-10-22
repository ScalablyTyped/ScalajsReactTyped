package typingsJapgolly.createHash

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(algorithm: algorithm): HashAlgorithm = ^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any]).asInstanceOf[HashAlgorithm]
  inline def apply(algorithm: algorithm, options: Any): HashAlgorithm = (^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HashAlgorithm]
  
  @JSImport("create-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait HashAlgorithm extends StObject {
    
    def digest(): Buffer = js.native
    def digest(target: encoding): String = js.native
    
    def end(): Unit = js.native
    
    def read(): Unit = js.native
    
    def update(data: String): this.type = js.native
    def update(data: String, encoding: String): this.type = js.native
    def update(data: js.typedarray.DataView): this.type = js.native
    def update(data: js.typedarray.DataView, encoding: String): this.type = js.native
    def update(data: TypedArray): this.type = js.native
    def update(data: TypedArray, encoding: String): this.type = js.native
    def update(data: Buffer): this.type = js.native
    def update(data: Buffer, encoding: String): this.type = js.native
    
    def write(data: String): this.type = js.native
    def write(data: String, encoding: String): this.type = js.native
    def write(data: js.typedarray.DataView): this.type = js.native
    def write(data: js.typedarray.DataView, encoding: String): this.type = js.native
    def write(data: TypedArray): this.type = js.native
    def write(data: TypedArray, encoding: String): this.type = js.native
    def write(data: Buffer): this.type = js.native
    def write(data: Buffer, encoding: String): this.type = js.native
  }
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.createHash.createHashStrings.md5
    - typingsJapgolly.createHash.createHashStrings.rmd160
    - typingsJapgolly.createHash.createHashStrings.ripemd160
    - typingsJapgolly.createHash.createHashStrings.sha
    - typingsJapgolly.createHash.createHashStrings.sha1
    - typingsJapgolly.createHash.createHashStrings.sha224
    - typingsJapgolly.createHash.createHashStrings.sha256
    - typingsJapgolly.createHash.createHashStrings.sha384
    - typingsJapgolly.createHash.createHashStrings.sha512
  */
  trait algorithm extends StObject
  object algorithm {
    
    inline def md5: typingsJapgolly.createHash.createHashStrings.md5 = "md5".asInstanceOf[typingsJapgolly.createHash.createHashStrings.md5]
    
    inline def ripemd160: typingsJapgolly.createHash.createHashStrings.ripemd160 = "ripemd160".asInstanceOf[typingsJapgolly.createHash.createHashStrings.ripemd160]
    
    inline def rmd160: typingsJapgolly.createHash.createHashStrings.rmd160 = "rmd160".asInstanceOf[typingsJapgolly.createHash.createHashStrings.rmd160]
    
    inline def sha: typingsJapgolly.createHash.createHashStrings.sha = "sha".asInstanceOf[typingsJapgolly.createHash.createHashStrings.sha]
    
    inline def sha1: typingsJapgolly.createHash.createHashStrings.sha1 = "sha1".asInstanceOf[typingsJapgolly.createHash.createHashStrings.sha1]
    
    inline def sha224: typingsJapgolly.createHash.createHashStrings.sha224 = "sha224".asInstanceOf[typingsJapgolly.createHash.createHashStrings.sha224]
    
    inline def sha256: typingsJapgolly.createHash.createHashStrings.sha256 = "sha256".asInstanceOf[typingsJapgolly.createHash.createHashStrings.sha256]
    
    inline def sha384: typingsJapgolly.createHash.createHashStrings.sha384 = "sha384".asInstanceOf[typingsJapgolly.createHash.createHashStrings.sha384]
    
    inline def sha512: typingsJapgolly.createHash.createHashStrings.sha512 = "sha512".asInstanceOf[typingsJapgolly.createHash.createHashStrings.sha512]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.createHash.createHashStrings.utf8
    - typingsJapgolly.createHash.createHashStrings.hex
    - typingsJapgolly.createHash.createHashStrings.base64
  */
  trait encoding extends StObject
  object encoding {
    
    inline def base64: typingsJapgolly.createHash.createHashStrings.base64 = "base64".asInstanceOf[typingsJapgolly.createHash.createHashStrings.base64]
    
    inline def hex: typingsJapgolly.createHash.createHashStrings.hex = "hex".asInstanceOf[typingsJapgolly.createHash.createHashStrings.hex]
    
    inline def utf8: typingsJapgolly.createHash.createHashStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.createHash.createHashStrings.utf8]
  }
}
