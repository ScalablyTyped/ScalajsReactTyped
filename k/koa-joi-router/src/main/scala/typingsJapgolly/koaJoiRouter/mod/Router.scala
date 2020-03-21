package typingsJapgolly.koaJoiRouter.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koaJoiRouter.FnCall
import typingsJapgolly.koaRouter.mod.IMiddleware
import typingsJapgolly.koaRouter.mod.IParamMiddleware
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  @JSName("delete")
  var delete_Original: Method = js.native
  @JSName("get")
  var get_Original: Method = js.native
  @JSName("head")
  var head_Original: Method = js.native
  @JSName("options")
  var options_Original: Method = js.native
  @JSName("param")
  var param_Original: js.Function2[
    /* param */ String, 
    /* middleware */ IParamMiddleware, 
    typingsJapgolly.koaRouter.mod.Router[_, js.Object]
  ] = js.native
  @JSName("patch")
  var patch_Original: Method = js.native
  @JSName("post")
  var post_Original: Method = js.native
  @JSName("prefix")
  var prefix_Original: js.Function1[/* prefix */ String, typingsJapgolly.koaRouter.mod.Router[_, js.Object]] = js.native
  @JSName("put")
  var put_Original: Method = js.native
  var routes: js.Array[Spec] = js.native
  @JSName("use")
  var use_Original: FnCall = js.native
  def delete(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def delete(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def delete(path: RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def delete(path: RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def get(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def get(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def get(path: RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def get(path: RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def head(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def head(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def head(path: RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def head(path: RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def middleware(): Middleware[DefaultState, DefaultContext] = js.native
  def options(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def options(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def options(path: RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def options(path: RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def param(param: String, middleware: IParamMiddleware): typingsJapgolly.koaRouter.mod.Router[_, js.Object] = js.native
  def patch(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def patch(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def patch(path: RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def patch(path: RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def post(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def post(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def post(path: RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def post(path: RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def prefix(prefix: String): typingsJapgolly.koaRouter.mod.Router[_, js.Object] = js.native
  def put(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def put(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def put(path: RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
  def put(path: RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def route(spec: js.Array[Spec]): Router = js.native
  def route(spec: Spec): Router = js.native
  def use(middleware: (IMiddleware[_, js.Object])*): typingsJapgolly.koaRouter.mod.Router[_, js.Object] = js.native
  def use(path: String, middleware: (IMiddleware[_, js.Object])*): typingsJapgolly.koaRouter.mod.Router[_, js.Object] = js.native
  def use(path: js.Array[String], middleware: (IMiddleware[_, js.Object])*): typingsJapgolly.koaRouter.mod.Router[_, js.Object] = js.native
  def use(path: RegExp, middleware: (IMiddleware[_, js.Object])*): typingsJapgolly.koaRouter.mod.Router[_, js.Object] = js.native
}

