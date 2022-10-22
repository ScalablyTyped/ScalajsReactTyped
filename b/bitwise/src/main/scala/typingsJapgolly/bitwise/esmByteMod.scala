package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Byte
import typingsJapgolly.bitwise.typesMod.UInt8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmByteMod {
  
  @JSImport("bitwise/esm/byte", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/esm/byte", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(byte: UInt8): Byte = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(byte.asInstanceOf[js.Any]).asInstanceOf[Byte]
    
    inline def write(byte: Byte): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
  }
  
  inline def read(byte: typingsJapgolly.bitwise.esmTypesMod.UInt8): typingsJapgolly.bitwise.esmTypesMod.Byte = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(byte.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Byte]
  
  inline def write(byte: typingsJapgolly.bitwise.esmTypesMod.Byte): typingsJapgolly.bitwise.esmTypesMod.UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(byte.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.UInt8]
}
