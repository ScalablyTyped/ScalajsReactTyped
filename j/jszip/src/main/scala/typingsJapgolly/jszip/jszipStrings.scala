package typingsJapgolly.jszip

import typingsJapgolly.jszip.mod.Compression
import typingsJapgolly.jszip.mod.InputType
import typingsJapgolly.jszip.mod.OutputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jszipStrings {
  
  @js.native
  sealed trait DEFLATE
    extends StObject
       with Compression
  inline def DEFLATE: DEFLATE = "DEFLATE".asInstanceOf[DEFLATE]
  
  @js.native
  sealed trait DOS extends StObject
  inline def DOS: DOS = "DOS".asInstanceOf[DOS]
  
  @js.native
  sealed trait STORE
    extends StObject
       with Compression
  inline def STORE: STORE = "STORE".asInstanceOf[STORE]
  
  @js.native
  sealed trait UNIX extends StObject
  inline def UNIX: UNIX = "UNIX".asInstanceOf[UNIX]
  
  @js.native
  sealed trait array
    extends StObject
       with InputType
       with OutputType
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait arraybuffer
    extends StObject
       with InputType
       with OutputType
  inline def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait base64
    extends StObject
       with InputType
       with OutputType
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait binarystring
    extends StObject
       with InputType
       with OutputType
  inline def binarystring: binarystring = "binarystring".asInstanceOf[binarystring]
  
  @js.native
  sealed trait blob
    extends StObject
       with InputType
       with OutputType
  inline def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait nodebuffer
    extends StObject
       with OutputType
  inline def nodebuffer: nodebuffer = "nodebuffer".asInstanceOf[nodebuffer]
  
  @js.native
  sealed trait stream
    extends StObject
       with InputType
  inline def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait string
    extends StObject
       with InputType
       with OutputType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait text
    extends StObject
       with InputType
       with OutputType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait uint8array
    extends StObject
       with InputType
       with OutputType
  inline def uint8array: uint8array = "uint8array".asInstanceOf[uint8array]
}
