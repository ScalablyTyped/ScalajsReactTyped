package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bits
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferReadMod {
  
  @JSImport("bitwise/buffer/read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(buffer: Buffer): Bits = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any]).asInstanceOf[Bits]
  inline def default(buffer: Buffer, offset: Double): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Bits]
  inline def default(buffer: Buffer, offset: Double, length: Double): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Bits]
  inline def default(buffer: Buffer, offset: Unit, length: Double): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Bits]
}
