package typingsJapgolly.cote.mod

import typingsJapgolly.eventemitter2.mod.EventEmitter2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("cote", "Component")
@js.native
open class Component protected () extends EventEmitter2 {
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
