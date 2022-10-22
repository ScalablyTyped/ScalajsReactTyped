package typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod

import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageAcceptance.Accept
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Ignore
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Reject
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.^
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePubsub.mod.Message
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def rejectReasonFromAcceptance(acceptance: Exclude[MessageAcceptance, Accept]): Ignore | Reject = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectReasonFromAcceptance")(acceptance.asInstanceOf[js.Any]).asInstanceOf[Ignore | Reject]

type FastMsgIdFn = js.Function1[/* msg */ IMessage, String]

type IPStr = String

type MsgIdFn = js.Function1[/* msg */ Message, js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array]

type MsgIdStr = String

type MsgIdToStrFn = js.Function1[/* msgId */ js.typedarray.Uint8Array, String]

type PeerIdStr = String

type TopicStr = String

type TopicValidatorFn = js.Function3[
/* topic */ TopicStr, 
/* msg */ Message, 
/* propagationSource */ PeerId, 
MessageAcceptance | js.Promise[MessageAcceptance]]
