package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.libComponentsStateLookupMod.StateLookupOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "StateLookup")
@js.native
open class StateLookup protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libComponentsStateLookupMod.StateLookup {
  /**
    * Construct a new state lookup entity.
    *
    * This component stores state events for specific event types which can be
    * queried at a later date. This component will perform network requests to
    * fetch the current state for a given room ID. It relies on
    * {@link StateLookup#onEvent} being called with later events in order to
    * stay up-to-date. This should be connected to the <code>onEvent</code>
    * handler on the {@link Bridge}.
    * @constructor
    * @param {Object} opts Options for this constructor
    * @param {MatrixClient} opts.client Required. The client which will perform
    * /state requests.
    * @param {string[]} opts.eventTypes The state event types to track.
    * @throws if there is no client.
    */
  def this(opts: StateLookupOpts) = this()
}
