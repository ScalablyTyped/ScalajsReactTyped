package typingsJapgolly.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CONTACT_ACTIVE_STATES extends StObject
@JSGlobal("connect.CONTACT_ACTIVE_STATES")
@js.native
object CONTACT_ACTIVE_STATES extends StObject {
  
  @js.native
  sealed trait CONNECTED
    extends StObject
       with CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait CONNECTING
    extends StObject
       with CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait INCOMING
    extends StObject
       with CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait PENDING
    extends StObject
       with CONTACT_ACTIVE_STATES
}
