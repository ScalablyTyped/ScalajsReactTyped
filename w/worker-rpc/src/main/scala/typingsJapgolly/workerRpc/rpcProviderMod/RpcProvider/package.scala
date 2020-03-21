package typingsJapgolly.workerRpc.rpcProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RpcProvider {
  type Dispatcher = js.Function2[
    /* message */ typingsJapgolly.workerRpc.rpcProviderMod.RpcProvider.Message, 
    /* transfer */ js.UndefOr[js.Array[js.Any]], 
    scala.Unit
  ]
}
