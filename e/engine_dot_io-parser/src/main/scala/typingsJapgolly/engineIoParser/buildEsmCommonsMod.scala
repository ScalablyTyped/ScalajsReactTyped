package typingsJapgolly.engineIoParser

import typingsJapgolly.engineIoParser.anon.Compress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmCommonsMod {
  
  @JSImport("engine.io-parser/build/esm/commons", "ERROR_PACKET")
  @js.native
  val ERROR_PACKET: Packet = js.native
  
  @JSImport("engine.io-parser/build/esm/commons", "PACKET_TYPES")
  @js.native
  val PACKET_TYPES: Any = js.native
  
  @JSImport("engine.io-parser/build/esm/commons", "PACKET_TYPES_REVERSE")
  @js.native
  val PACKET_TYPES_REVERSE: Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.engineIoParser.engineIoParserStrings.nodebuffer
    - typingsJapgolly.engineIoParser.engineIoParserStrings.arraybuffer
    - typingsJapgolly.engineIoParser.engineIoParserStrings.blob
  */
  trait BinaryType extends StObject
  object BinaryType {
    
    inline def arraybuffer: typingsJapgolly.engineIoParser.engineIoParserStrings.arraybuffer = "arraybuffer".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.arraybuffer]
    
    inline def blob: typingsJapgolly.engineIoParser.engineIoParserStrings.blob = "blob".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.blob]
    
    inline def nodebuffer: typingsJapgolly.engineIoParser.engineIoParserStrings.nodebuffer = "nodebuffer".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.nodebuffer]
  }
  
  trait Packet extends StObject {
    
    var data: js.UndefOr[RawData] = js.undefined
    
    var options: js.UndefOr[Compress] = js.undefined
    
    var `type`: PacketType
  }
  object Packet {
    
    inline def apply(`type`: PacketType): Packet = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    extension [Self <: Packet](x: Self) {
      
      inline def setData(value: RawData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setOptions(value: Compress): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: PacketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.engineIoParser.engineIoParserStrings.open
    - typingsJapgolly.engineIoParser.engineIoParserStrings.close
    - typingsJapgolly.engineIoParser.engineIoParserStrings.ping
    - typingsJapgolly.engineIoParser.engineIoParserStrings.pong
    - typingsJapgolly.engineIoParser.engineIoParserStrings.message
    - typingsJapgolly.engineIoParser.engineIoParserStrings.upgrade
    - typingsJapgolly.engineIoParser.engineIoParserStrings.noop
    - typingsJapgolly.engineIoParser.engineIoParserStrings.error
  */
  trait PacketType extends StObject
  object PacketType {
    
    inline def close: typingsJapgolly.engineIoParser.engineIoParserStrings.close = "close".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.close]
    
    inline def error: typingsJapgolly.engineIoParser.engineIoParserStrings.error = "error".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.error]
    
    inline def message: typingsJapgolly.engineIoParser.engineIoParserStrings.message = "message".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.message]
    
    inline def noop: typingsJapgolly.engineIoParser.engineIoParserStrings.noop = "noop".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.noop]
    
    inline def open: typingsJapgolly.engineIoParser.engineIoParserStrings.open = "open".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.open]
    
    inline def ping: typingsJapgolly.engineIoParser.engineIoParserStrings.ping = "ping".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.ping]
    
    inline def pong: typingsJapgolly.engineIoParser.engineIoParserStrings.pong = "pong".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.pong]
    
    inline def upgrade: typingsJapgolly.engineIoParser.engineIoParserStrings.upgrade = "upgrade".asInstanceOf[typingsJapgolly.engineIoParser.engineIoParserStrings.upgrade]
  }
  
  type RawData = Any
}
