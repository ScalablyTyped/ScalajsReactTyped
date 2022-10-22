package typingsJapgolly.bitwise

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferXorMod {
  
  @JSImport("bitwise/buffer/xor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def default(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
