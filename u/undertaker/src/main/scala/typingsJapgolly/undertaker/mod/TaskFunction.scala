package typingsJapgolly.undertaker.mod

import typingsJapgolly.node.NodeJS.Process
import typingsJapgolly.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskFunction
  extends TaskFunctionBase
     with TaskFunctionParams {
  /* InferMemberOverrides */
  override def apply(T0: /* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit | Duplex | Process | js.Promise[scala.Nothing] | js.Any = js.native
}

