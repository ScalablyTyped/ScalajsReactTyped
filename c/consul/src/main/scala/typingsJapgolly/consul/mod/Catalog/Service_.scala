package typingsJapgolly.consul.mod.Catalog

import typingsJapgolly.consul.mod.Callback
import typingsJapgolly.consul.mod.Catalog.Service.ListOptions
import typingsJapgolly.consul.mod.Consul
import typingsJapgolly.consul.mod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service_ extends js.Object {
  var consul: Consul = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](dc: String): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](opts: typingsJapgolly.consul.mod.Catalog.Service.NodesOptions): Thenable[TData] = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](opts: typingsJapgolly.consul.mod.Catalog.Service.NodesOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](service: String): Thenable[TData] = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](service: String, callback: Callback[TData]): Unit = js.native
}

