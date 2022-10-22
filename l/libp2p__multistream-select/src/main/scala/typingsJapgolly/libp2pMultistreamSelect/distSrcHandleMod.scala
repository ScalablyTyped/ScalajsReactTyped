package typingsJapgolly.libp2pMultistreamSelect

import typingsJapgolly.itStreamTypes.mod.Duplex
import typingsJapgolly.libp2pMultistreamSelect.mod.ByteArrayInit
import typingsJapgolly.libp2pMultistreamSelect.mod.ByteListInit
import typingsJapgolly.libp2pMultistreamSelect.mod.ProtocolStream
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHandleMod {
  
  @JSImport("@libp2p/multistream-select/dist/src/handle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handle(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String,
    options: ByteArrayInit
  ): js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String,
    options: ByteListInit
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String]
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String],
    options: ByteArrayInit
  ): js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String],
    options: ByteListInit
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
}
