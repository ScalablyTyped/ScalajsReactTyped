package typingsJapgolly.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/transport-state", JSImport.Namespace)
@js.native
object transportStateMod extends js.Object {
  @js.native
  sealed trait TransportState extends js.Object
  
  @js.native
  object TransportState extends js.Object {
    /**
      * The `connect()` method resolved.
      */
    @js.native
    sealed trait Connected extends TransportState
    
    /**
      * The `connect()` method was called.
      */
    @js.native
    sealed trait Connecting extends TransportState
    
    /**
      * The `connect()` method was rejected, or
      * the `disconnect()` method completed, or
      * network connectivity was lost.
      */
    @js.native
    sealed trait Disconnected extends TransportState
    
    /**
      * The `disconnect()` method was called.
      */
    @js.native
    sealed trait Disconnecting extends TransportState
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransportState with String] = js.native
    /* "Connected" */ @js.native
    object Connected extends TopLevel[Connected with String]
    
    /* "Connecting" */ @js.native
    object Connecting extends TopLevel[Connecting with String]
    
    /* "Disconnected" */ @js.native
    object Disconnected extends TopLevel[Disconnected with String]
    
    /* "Disconnecting" */ @js.native
    object Disconnecting extends TopLevel[Disconnecting with String]
    
  }
  
}

