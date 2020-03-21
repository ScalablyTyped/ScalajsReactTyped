package typingsJapgolly.inversifyRestifyUtils

import typingsJapgolly.inversify.interfacesMod.interfaces.Container
import typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces.HandlerDecorator
import typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces.Middleware
import typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces.RouteOptions
import typingsJapgolly.restify.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-restify-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InversifyRestifyServer protected ()
    extends typingsJapgolly.inversifyRestifyUtils.serverMod.InversifyRestifyServer {
    def this(container: Container) = this()
    def this(
      container: Container,
      opts: ServerOptions with typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces.ServerOptions
    ) = this()
  }
  
  def Controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  def Delete(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Get(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Head(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Method(method: String, options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Options(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Patch(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Post(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Put(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  @js.native
  object TYPE extends js.Object {
    var Controller: js.Symbol = js.native
  }
  
}

