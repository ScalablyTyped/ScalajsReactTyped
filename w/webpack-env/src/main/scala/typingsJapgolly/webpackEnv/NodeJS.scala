package typingsJapgolly.webpackEnv

import typingsJapgolly.webpackEnv.WebpackModuleApi.NodeProcess
import typingsJapgolly.webpackEnv.WebpackModuleApi.RequireFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Declare process variable
*/
@JSGlobal("NodeJS")
@js.native
object NodeJS extends js.Object {
  type Module = typingsJapgolly.webpackEnv.WebpackModuleApi.Module
  type Process = NodeProcess
  type Require = RequireFunction
  type RequireResolve = typingsJapgolly.webpackEnv.WebpackModuleApi.RequireResolve
}

