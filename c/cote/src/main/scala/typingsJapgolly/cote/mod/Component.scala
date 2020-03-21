package typingsJapgolly.cote.mod

import typingsJapgolly.eventemitter2.mod.EventEmitter2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cote", "Component")
@js.native
abstract class Component protected () extends EventEmitter2 {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: Advertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: Advertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  /**
    * Closes socket and stops discovery.
    */
  def close(): Unit = js.native
}

