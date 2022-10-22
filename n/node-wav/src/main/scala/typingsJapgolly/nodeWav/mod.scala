package typingsJapgolly.nodeWav

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodeWav.anon.BitDepth
import typingsJapgolly.nodeWav.anon.ChannelData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-wav", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: Buffer): ChannelData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[ChannelData]
  
  inline def encode(channelData: js.Array[js.typedarray.ArrayBuffer], opts: BitDepth): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(channelData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
