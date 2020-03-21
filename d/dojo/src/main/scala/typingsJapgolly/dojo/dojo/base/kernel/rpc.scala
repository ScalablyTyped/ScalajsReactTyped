package typingsJapgolly.dojo.dojo.base.kernel

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.rpc.html
  *
  *
  */
trait rpc extends js.Object {
  /**
    *
    */
  def JsonService(): Unit
  /**
    *
    */
  def JsonpService(): Unit
  /**
    *
    */
  def RpcService(): Unit
}

object rpc {
  @scala.inline
  def apply(JsonService: Callback, JsonpService: Callback, RpcService: Callback): rpc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("JsonService")(JsonService.toJsFn)
    __obj.updateDynamic("JsonpService")(JsonpService.toJsFn)
    __obj.updateDynamic("RpcService")(RpcService.toJsFn)
    __obj.asInstanceOf[rpc]
  }
}

