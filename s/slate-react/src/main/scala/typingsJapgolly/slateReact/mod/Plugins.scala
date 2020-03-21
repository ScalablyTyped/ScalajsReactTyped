package typingsJapgolly.slateReact.mod

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugins[T /* <: Controller */]
  extends Array[PluginOrPlugins[T]]
     with PluginOrPlugins[T]

