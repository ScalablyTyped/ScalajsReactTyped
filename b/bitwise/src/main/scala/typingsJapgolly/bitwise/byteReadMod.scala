package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Byte
import typingsJapgolly.bitwise.typesMod.UInt8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteReadMod {
  
  @JSImport("bitwise/byte/read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(byte: UInt8): Byte = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(byte.asInstanceOf[js.Any]).asInstanceOf[Byte]
}
