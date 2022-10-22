package typingsJapgolly.matrixJsSdk.mod

import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotdirect
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotpresence
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotreaction
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotcanonical_alias
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotencryption
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotguest_access
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDothistory_visibility
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotjoin_rules
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotmember
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotmessage
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotname
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotpower_levels
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDotredaction
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDottombstone
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotroomDottopic
import typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotsticker
import typingsJapgolly.matrixJsSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient(ops: String): MatrixClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(ops.asInstanceOf[js.Any]).asInstanceOf[MatrixClient]
inline def createClient(ops: CreateClientOption): MatrixClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(ops.asInstanceOf[js.Any]).asInstanceOf[MatrixClient]

inline def getRequest(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")().asInstanceOf[Any]

inline def request(r: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(r.asInstanceOf[js.Any]).asInstanceOf[Unit]

type CryptoModule = Any

type CryptoVerificationBase = Any

type EventContentType = EventContentTypeMessage

type EventTimelineDirection = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTimeline.BACKWARDS */ Any

type EventType = LiteralUnion[
mDotroomDotcanonical_alias | mDotroomDotencryption | mDotroomDotguest_access | mDotroomDothistory_visibility | mDotroomDotjoin_rules | mDotroomDotmember | mDotroomDotmessage | mDotroomDotname | mDotroomDotpower_levels | mDotroomDotredaction | mDotroomDottombstone | mDotroomDottopic | mDotsticker | mDotdirect | mDotreaction | mDotpresence, 
String]

type FilterComponent = Any

type LiteralUnion[T /* <: U */, U] = T | (U & js.Object)

type MatrixCallback = js.Function2[/* err */ Null | js.Object, /* data */ Any, Unit]

/* Rewritten from type alias, can be one of: 
  - scala.Nothing
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.ban
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.invite
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.join
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.leave
*/
type MembershipType = _MembershipType | scala.Nothing

/* Rewritten from type alias, can be one of: 
  - scala.Nothing
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotaudio
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotbadDotencrypted
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotemote
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotfile
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotimage
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotnotice
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDottext
  - typingsJapgolly.matrixJsSdk.matrixJsSdkStrings.mDotvideo
*/
type MsgType = _MsgType | scala.Nothing

type ProcessFn = js.Function1[/* event */ MatrixEvent[EventContentTypeMessage, EventType], js.Promise[Any]]

type QueueAlgorithm = js.Function1[/* event */ MatrixEvent[EventContentTypeMessage, EventType], String]

type RetryAlgorithm = js.Function3[
/* event */ MatrixEvent[EventContentTypeMessage, EventType], 
/* attempts */ Double, 
/* err */ MatrixError, 
Double]

type SyncCallback = js.Function3[/* state */ SyncState, /* prevState */ SyncState, /* data */ SyncData, Unit]
