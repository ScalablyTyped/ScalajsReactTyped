package typingsJapgolly.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Requester")
@js.native
open class Requester protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: RequesterAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: RequesterAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  
  /**
    * Queues a request until a Responder is available, and once so, delivers
    * the request. Requests are dispatched to Responders in a round-robin way.
    *
    * @param event Request.
    */
  def send[T /* <: Event */](event: T): js.Promise[Any] = js.native
  /**
    * Queues a request until a Responder is available, and once so, delivers
    * the request. Requests are dispatched to Responders in a round-robin way.
    *
    * @param event Request.
    * @param callback Function to execute after getting a result.
    */
  def send[T /* <: Event */](event: T, callback: js.Function2[/* error */ Any, /* result */ Any, Unit]): Unit = js.native
}
