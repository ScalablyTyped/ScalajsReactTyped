package typingsJapgolly.pvtsutils

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.std.ArrayBufferLike
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pvtsutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def combine(buf: js.typedarray.ArrayBuffer*): ArrayBufferLike = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(buf.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ArrayBufferLike]
  
  inline def isEqual(bytes1: js.typedarray.ArrayBuffer, bytes2: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(bytes1.asInstanceOf[js.Any], bytes2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait ArrayBufferViewConstructor[T /* <: js.typedarray.ArrayBufferView */]
    extends StObject
       with Instantiable1[
          (/* array */ ArrayBufferLike) | (/* array */ ArrayLike[Double]) | (/* length */ Double), 
          T
        ]
       with Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ Double, T]
       with Instantiable3[
          /* buffer */ ArrayBufferLike, 
          (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
          /* length */ Double, 
          T
        ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.utf8
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.binary
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.base64
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.base64url
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.hex
    - java.lang.String
  */
  type BufferEncoding = _BufferEncoding | String
  
  type BufferSource = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  trait BufferSourceConverter extends StObject
  
  trait Convert extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.ascii
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.utf8
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16be
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16le
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.usc2
  */
  trait TextEncoding extends StObject
  object TextEncoding {
    
    inline def ascii: typingsJapgolly.pvtsutils.pvtsutilsStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.pvtsutils.pvtsutilsStrings.ascii]
    
    inline def usc2: typingsJapgolly.pvtsutils.pvtsutilsStrings.usc2 = "usc2".asInstanceOf[typingsJapgolly.pvtsutils.pvtsutilsStrings.usc2]
    
    inline def utf16: typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16 = "utf16".asInstanceOf[typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16]
    
    inline def utf16be: typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16be = "utf16be".asInstanceOf[typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16be]
    
    inline def utf16le: typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16le = "utf16le".asInstanceOf[typingsJapgolly.pvtsutils.pvtsutilsStrings.utf16le]
    
    inline def utf8: typingsJapgolly.pvtsutils.pvtsutilsStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.pvtsutils.pvtsutilsStrings.utf8]
  }
  
  trait _BufferEncoding extends StObject
}
