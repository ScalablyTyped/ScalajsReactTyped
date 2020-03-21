package typingsJapgolly.koaConvert

import typingsJapgolly.koa.mod.Context
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koa.mod.Next
import typingsJapgolly.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-convert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(mw: js.Function2[/* context */ Context, /* next */ Next, Generator[_, _, _]]): Middleware[DefaultState, DefaultContext] = js.native
}

