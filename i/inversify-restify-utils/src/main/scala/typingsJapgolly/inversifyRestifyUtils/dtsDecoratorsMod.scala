package typingsJapgolly.inversifyRestifyUtils

import typingsJapgolly.inversifyRestifyUtils.dtsInterfacesMod.interfaces.HandlerDecorator
import typingsJapgolly.inversifyRestifyUtils.dtsInterfacesMod.interfaces.Middleware
import typingsJapgolly.inversifyRestifyUtils.dtsInterfacesMod.interfaces.RouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsDecoratorsMod {
  
  @JSImport("inversify-restify-utils/dts/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Controller(path: String, middleware: Middleware*): js.Function1[/* target */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Controller")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* target */ Any, Unit]]
  
  inline def Delete(options: RouteOptions, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Delete")(scala.List(options.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def Get(options: RouteOptions, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Get")(scala.List(options.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def Head(options: RouteOptions, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Head")(scala.List(options.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def Method(method: String, options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Method")((scala.List(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(middleware.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[HandlerDecorator]
  
  inline def Options(options: RouteOptions, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Options")(scala.List(options.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def Patch(options: RouteOptions, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Patch")(scala.List(options.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def Post(options: RouteOptions, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Post")(scala.List(options.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def Put(options: RouteOptions, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Put")(scala.List(options.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
}
