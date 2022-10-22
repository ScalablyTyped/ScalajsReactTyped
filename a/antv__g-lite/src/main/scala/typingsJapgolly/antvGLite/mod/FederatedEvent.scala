package typingsJapgolly.antvGLite.mod

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "FederatedEvent")
@js.native
/**
  * The event boundary which manages this event. Propagation can only occur
  *  within the boundary's jurisdiction.
  */
open class FederatedEvent[N /* <: Event */, T] ()
  extends typingsJapgolly.antvGLite.distDomMod.FederatedEvent[N, T] {
  def this(manager: typingsJapgolly.antvGLite.distServicesMod.EventService) = this()
}
