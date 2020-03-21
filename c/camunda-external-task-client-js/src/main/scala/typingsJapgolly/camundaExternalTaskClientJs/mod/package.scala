package typingsJapgolly.camundaExternalTaskClientJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler = js.Function1[/* args */ typingsJapgolly.camundaExternalTaskClientJs.mod.HandlerArgs, scala.Unit]
  type Interceptor = js.Function1[/* config */ js.Any, js.Any]
  type Logger_ = typingsJapgolly.camundaExternalTaskClientJs.mod.Middleware with typingsJapgolly.camundaExternalTaskClientJs.AnonError
  type Middleware = js.Function1[/* client */ typingsJapgolly.camundaExternalTaskClientJs.mod.Client, scala.Unit]
  type SuccessWithTasksEvent = typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonsuccess
  type Value = js.Any
}
