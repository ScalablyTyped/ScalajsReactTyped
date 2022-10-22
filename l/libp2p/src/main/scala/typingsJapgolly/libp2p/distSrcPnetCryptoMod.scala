package typingsJapgolly.libp2p

import typingsJapgolly.itStreamTypes.mod.Source
import typingsJapgolly.libp2p.anon.CodecName
import typingsJapgolly.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPnetCryptoMod {
  
  @JSImport("libp2p/dist/src/pnet/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBoxStream(nonce: js.typedarray.Uint8Array, psk: js.typedarray.Uint8Array): js.Function1[
    /* source */ Source[js.typedarray.Uint8Array], 
    AsyncGenerator[js.typedarray.Uint8Array, Unit, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBoxStream")(nonce.asInstanceOf[js.Any], psk.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* source */ Source[js.typedarray.Uint8Array], 
    AsyncGenerator[js.typedarray.Uint8Array, Unit, Any]
  ]]
  
  inline def createUnboxStream(nonce: js.typedarray.Uint8Array, psk: js.typedarray.Uint8Array): js.Function1[
    /* source */ Source[js.typedarray.Uint8Array], 
    AsyncGenerator[js.typedarray.Uint8Array, Unit, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnboxStream")(nonce.asInstanceOf[js.Any], psk.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* source */ Source[js.typedarray.Uint8Array], 
    AsyncGenerator[js.typedarray.Uint8Array, Unit, Any]
  ]]
  
  inline def decodeV1PSK(pskBuffer: js.typedarray.Uint8Array): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeV1PSK")(pskBuffer.asInstanceOf[js.Any]).asInstanceOf[CodecName]
}
