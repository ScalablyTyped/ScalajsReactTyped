package typingsJapgolly.libp2pPubsub

import typingsJapgolly.libp2pInterfacePubsub.mod.Message
import typingsJapgolly.libp2pInterfacePubsub.mod.PubSubRPCMessage
import typingsJapgolly.multiformats.distTypesSrcHashesHasherMod.Await
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object utilsMod {
  
  @JSImport("@libp2p/pubsub/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def anyMatch(a: js.Array[Double], b: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def anyMatch(a: js.Array[Double], b: Set[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def anyMatch(a: Set[Double], b: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def anyMatch(a: Set[Double], b: Set[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def bigIntFromBytes(num: js.typedarray.Uint8Array): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntFromBytes")(num.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def bigIntToBytes(num: js.BigInt): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntToBytes")(num.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ensureArray[T](maybeArray: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureArray")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def ensureArray[T](maybeArray: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureArray")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def msgId(key: js.typedarray.Uint8Array, seqno: js.BigInt): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("msgId")(key.asInstanceOf[js.Any], seqno.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def noSignMsgId(data: js.typedarray.Uint8Array): Await[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("noSignMsgId")(data.asInstanceOf[js.Any]).asInstanceOf[Await[js.typedarray.Uint8Array]]
  
  inline def randomSeqno(): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("randomSeqno")().asInstanceOf[js.BigInt]
  
  inline def toMessage(message: PubSubRPCMessage): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("toMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  inline def toRpcMessage(message: Message): PubSubRPCMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("toRpcMessage")(message.asInstanceOf[js.Any]).asInstanceOf[PubSubRPCMessage]
}
