package typingsJapgolly.expressToKoa

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-to-koa", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(
    middleware: js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Middleware[DefaultState, DefaultContext] = js.native
}

