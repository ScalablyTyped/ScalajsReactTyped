package typingsJapgolly.consul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Acl = typingsJapgolly.consul.mod.Acl_
  type Agent = typingsJapgolly.consul.mod.Agent_
  type Callback[TData] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* data */ js.UndefOr[TData], 
    /* res */ js.UndefOr[typingsJapgolly.consul.mod.Response], 
    js.Any
  ]
  type Catalog = typingsJapgolly.consul.mod.Catalog_
  type Event = typingsJapgolly.consul.mod.Event_
  type Health = typingsJapgolly.consul.mod.Health_
  type Kv = typingsJapgolly.consul.mod.Kv_
  type Lock = typingsJapgolly.consul.mod.Lock_
  type Session = typingsJapgolly.consul.mod.Session_
  type Watch = typingsJapgolly.consul.mod.Watch_
}
