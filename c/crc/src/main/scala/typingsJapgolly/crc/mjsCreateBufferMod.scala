package typingsJapgolly.crc

import typingsJapgolly.buffer.mod.Buffer
import typingsJapgolly.crc.mjsTypesMod.BufferInput
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mjsCreateBufferMod {
  
  @JSImport("crc/mjs/create_buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: BufferInput): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def default(value: BufferInput, encoding: BufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
