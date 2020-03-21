package typingsJapgolly.consul.mod

import typingsJapgolly.consul.mod.Kv.DelOptions
import typingsJapgolly.consul.mod.Kv.DeleteOptions
import typingsJapgolly.consul.mod.Kv.GetOptions
import typingsJapgolly.consul.mod.Kv.KeysOptions
import typingsJapgolly.consul.mod.Kv.SetOptions
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kv_ extends js.Object {
  var consul: Consul = js.native
  /**
    * Delete
    */
  def del[TData](key: String): Thenable[TData] = js.native
  /**
    * Delete
    */
  def del[TData](key: String, callback: Callback[TData]): Unit = js.native
  /**
    * Delete
    */
  def del[TData](opts: DelOptions): Thenable[TData] = js.native
  /**
    * Delete
    */
  def del[TData](opts: DelOptions, callback: Callback[TData]): Unit = js.native
  def delete[TData](key: String): Thenable[TData] = js.native
  def delete[TData](key: String, callback: Callback[TData]): Unit = js.native
  def delete[TData](opts: DeleteOptions): Thenable[TData] = js.native
  def delete[TData](opts: DeleteOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Get
    */
  def get[TData](key: String): Thenable[TData] = js.native
  /**
    * Get
    */
  def get[TData](key: String, callback: Callback[TData]): Unit = js.native
  /**
    * Get
    */
  def get[TData](opts: GetOptions): Thenable[TData] = js.native
  /**
    * Get
    */
  def get[TData](opts: GetOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Keys
    */
  def keys[TData](): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](callback: Callback[TData]): Unit = js.native
  def keys[TData](key: String): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](key: String, callback: Callback[TData]): Unit = js.native
  def keys[TData](opts: KeysOptions): Thenable[TData] = js.native
  /**
    * Keys
    */
  def keys[TData](opts: KeysOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Set
    */
  def set[TData](key: String, value: String): Thenable[TData] = js.native
  /**
    * Set
    */
  def set[TData](key: String, value: String, callback: Callback[TData]): Unit = js.native
  /**
    * Set
    */
  def set[TData](key: String, value: String, opts: SetOptions): Thenable[TData] = js.native
  /**
    * Set
    */
  def set[TData](key: String, value: String, opts: SetOptions, callback: Callback[TData]): Unit = js.native
  def set[TData](key: String, value: Buffer): Thenable[TData] = js.native
  def set[TData](key: String, value: Buffer, callback: Callback[TData]): Unit = js.native
  def set[TData](key: String, value: Buffer, opts: SetOptions): Thenable[TData] = js.native
  def set[TData](key: String, value: Buffer, opts: SetOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Set
    */
  def set[TData](opts: SetOptions): Thenable[TData] = js.native
  /**
    * Set
    */
  def set[TData](opts: SetOptions, callback: Callback[TData]): Unit = js.native
}

