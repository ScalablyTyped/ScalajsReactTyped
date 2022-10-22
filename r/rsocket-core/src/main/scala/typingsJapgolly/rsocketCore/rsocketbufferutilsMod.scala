package typingsJapgolly.rsocketCore

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketbufferutilsMod {
  
  @JSImport("rsocket-core/RSocketBufferUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def byteLength(data: Any, encoding: Encoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createBuffer(args: Any*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Buffer]
  
  inline def readUInt24BE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt24BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readUInt64BE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toBuffer(data: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt24BE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def writeUInt64BE(buffer: Buffer, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64BE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rsocketCore.rsocketCoreStrings.ascii
    - typingsJapgolly.rsocketCore.rsocketCoreStrings.base64
    - typingsJapgolly.rsocketCore.rsocketCoreStrings.hex
    - typingsJapgolly.rsocketCore.rsocketCoreStrings.utf8
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def ascii: typingsJapgolly.rsocketCore.rsocketCoreStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.rsocketCore.rsocketCoreStrings.ascii]
    
    inline def base64: typingsJapgolly.rsocketCore.rsocketCoreStrings.base64 = "base64".asInstanceOf[typingsJapgolly.rsocketCore.rsocketCoreStrings.base64]
    
    inline def hex: typingsJapgolly.rsocketCore.rsocketCoreStrings.hex = "hex".asInstanceOf[typingsJapgolly.rsocketCore.rsocketCoreStrings.hex]
    
    inline def utf8: typingsJapgolly.rsocketCore.rsocketCoreStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.rsocketCore.rsocketCoreStrings.utf8]
  }
}
