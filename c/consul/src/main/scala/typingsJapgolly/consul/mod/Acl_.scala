package typingsJapgolly.consul.mod

import typingsJapgolly.consul.mod.Acl.CloneOptions
import typingsJapgolly.consul.mod.Acl.CreateOptions
import typingsJapgolly.consul.mod.Acl.DestroyOptions
import typingsJapgolly.consul.mod.Acl.GetOptions
import typingsJapgolly.consul.mod.Acl.InfoOptions
import typingsJapgolly.consul.mod.Acl.ListOptions
import typingsJapgolly.consul.mod.Acl.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl_ extends js.Object {
  var consul: Consul = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: String): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: CloneOptions): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: CloneOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](callback: Callback[TData]): Unit = js.native
  def create[TData](opts: CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](opts: CreateOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: String): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: DestroyOptions, callback: Callback[TData]): Unit = js.native
  def get[TData](id: String): Thenable[TData] = js.native
  def get[TData](id: String, callback: Callback[TData]): Unit = js.native
  def get[TData](opts: GetOptions): Thenable[TData] = js.native
  def get[TData](opts: GetOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: String): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: InfoOptions): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: InfoOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: UpdateOptions): Thenable[TData] = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: UpdateOptions, callback: Callback[TData]): Unit = js.native
}

