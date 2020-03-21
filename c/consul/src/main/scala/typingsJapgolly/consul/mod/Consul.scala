package typingsJapgolly.consul.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.consul.mod.Lock.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consul extends js.Object {
  var acl: Acl
  var agent: Agent
  var catalog: Catalog
  var event: Event
  var health: Health
  var kv: Kv
  var session: Session
  var status: Status
  /**
    * Lock helper.
    */
  def lock(opts: Options): Lock
  /**
    * Watch helper.
    */
  def watch(opts: typingsJapgolly.consul.mod.Watch.Options): Watch
}

object Consul {
  @scala.inline
  def apply(
    acl: Acl,
    agent: Agent,
    catalog: Catalog,
    event: Event,
    health: Health,
    kv: Kv,
    lock: Options => CallbackTo[Lock],
    session: Session,
    status: Status,
    watch: typingsJapgolly.consul.mod.Watch.Options => CallbackTo[Watch]
  ): Consul = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], catalog = catalog.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], health = health.asInstanceOf[js.Any], kv = kv.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("lock")(js.Any.fromFunction1((t0: typingsJapgolly.consul.mod.Lock.Options) => lock(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.consul.mod.Watch.Options) => watch(t0).runNow()))
    __obj.asInstanceOf[Consul]
  }
}

