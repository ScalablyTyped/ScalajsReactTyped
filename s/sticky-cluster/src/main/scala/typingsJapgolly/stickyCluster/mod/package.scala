package typingsJapgolly.stickyCluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* server */ typingsJapgolly.node.httpMod.Server, scala.Unit]
  type InitializeFn = js.Function1[/* callback */ typingsJapgolly.stickyCluster.mod.Callback, scala.Unit]
}
