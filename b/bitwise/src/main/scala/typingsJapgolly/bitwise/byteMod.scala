package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Byte
import typingsJapgolly.bitwise.typesMod.UInt8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteMod {
  
  @JSImport("bitwise/byte", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/byte", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(byte: UInt8): Byte = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(byte.asInstanceOf[js.Any]).asInstanceOf[Byte]
    
    inline def write(byte: Byte): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
  }
  
  inline def read(byte: UInt8): Byte = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(byte.asInstanceOf[js.Any]).asInstanceOf[Byte]
  
  inline def write(byte: Byte): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
}
