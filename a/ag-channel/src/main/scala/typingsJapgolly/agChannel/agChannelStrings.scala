package typingsJapgolly.agChannel

import typingsJapgolly.agChannel.mod.ChannelState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agChannelStrings {
  
  @js.native
  sealed trait pending
    extends StObject
       with ChannelState
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait subscribed
    extends StObject
       with ChannelState
  inline def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait unsubscribed
    extends StObject
       with ChannelState
  inline def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}
