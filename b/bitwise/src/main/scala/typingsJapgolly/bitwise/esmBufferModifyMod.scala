package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.esmTypesMod.Bits
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBufferModifyMod {
  
  @JSImport("bitwise/esm/buffer/modify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(buffer: Buffer, bits: Bits): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(buffer: Buffer, bits: Bits, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
