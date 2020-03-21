package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.events.FilteredEvent
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chrome.mdns.Service
import typingsJapgolly.chromeApps.chrome.mdns.ServiceTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmdns extends js.Object {
  /**
    * The maximum number of service instances that will be
    * included in onServiceList events. If more instances
    * are available, they may be truncated from the
    * onServiceList event.
    * @default 2048
    * @since Chrome 44.
    */
  val MAX_SERVICE_INSTANCES_PER_EVENT: integer
  /**
    * Event fired to inform clients of the current complete
    * set of known available services. Clients should only
    * need to store the list from the most recent event.
    * The service type that the extension is interested in
    * discovering should be specified as the event filter
    * with the 'serviceType' key. Not specifying an event
    * filter will not start any discovery listeners.
    * @example
    * Filter example:
    * chrome.mdns.onServiceList.addListener(() => { },
    *  { 'serviceType': 'definitelyTyped._tcp.local' });
    */
  val onServiceList: FilteredEvent[js.Function1[/* services */ js.Array[Service], Unit], ServiceTypes]
  /**
    * Immediately issues a multicast DNS query for all service types.
    * |callback| is invoked immediately.
    * At a later time, queries will be sent,
    * and any service events will be fired.
    * @since Chrome 45.
    * @param callback Callback invoked after ForceDiscovery() has started.
    */
  def forceDiscovery(callback: js.Function0[Unit]): Unit
}

object Typeofmdns {
  @scala.inline
  def apply(
    MAX_SERVICE_INSTANCES_PER_EVENT: integer,
    forceDiscovery: js.Function0[Unit] => Callback,
    onServiceList: FilteredEvent[js.Function1[/* services */ js.Array[Service], Unit], ServiceTypes]
  ): Typeofmdns = {
    val __obj = js.Dynamic.literal(MAX_SERVICE_INSTANCES_PER_EVENT = MAX_SERVICE_INSTANCES_PER_EVENT.asInstanceOf[js.Any], onServiceList = onServiceList.asInstanceOf[js.Any])
    __obj.updateDynamic("forceDiscovery")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => forceDiscovery(t0).runNow()))
    __obj.asInstanceOf[Typeofmdns]
  }
}

