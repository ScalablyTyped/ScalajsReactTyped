package typingsJapgolly.awsSdkUtilBufferFrom

import typingsJapgolly.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-buffer-from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromArrayBuffer(input: js.typedarray.ArrayBuffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: Unit, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def fromString(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def fromString(input: String, encoding: StringEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii
    - typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8
    - typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le
    - typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2
    - typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64
    - typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1
    - typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary
    - typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex
  */
  trait StringEncoding extends StObject
  object StringEncoding {
    
    inline def ascii: typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii]
    
    inline def base64: typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64 = "base64".asInstanceOf[typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64]
    
    inline def binary: typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary = "binary".asInstanceOf[typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary]
    
    inline def hex: typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex = "hex".asInstanceOf[typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex]
    
    inline def latin1: typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1 = "latin1".asInstanceOf[typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1]
    
    inline def ucs2: typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2 = "ucs2".asInstanceOf[typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2]
    
    inline def utf16le: typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le = "utf16le".asInstanceOf[typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le]
    
    inline def utf8: typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8]
  }
}
