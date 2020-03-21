package typingsJapgolly.mongodbMemoryServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CallbackFn = js.Function1[/* repeated */ js.Any, js.Any]
  type DebugFn = js.Function1[/* repeated */ js.Any, js.Any]
  type DebugPropT = scala.Boolean | typingsJapgolly.mongodbMemoryServerCore.typesMod.DebugFn
  type EmptyVoidCallback = js.Function0[scala.Unit]
  type ErrorVoidCallback = js.Function1[/* err */ js.Any, scala.Unit]
}
