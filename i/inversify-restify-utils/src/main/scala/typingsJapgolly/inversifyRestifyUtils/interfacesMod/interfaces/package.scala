package typingsJapgolly.inversifyRestifyUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type ConfigFunction = js.Function1[/* app */ typingsJapgolly.restify.mod.Server, scala.Unit]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
  type Middleware = typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any] | typingsJapgolly.restify.mod.RequestHandler
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
    - typingsJapgolly.inversifyRestifyUtils.AnonPath
    - typingsJapgolly.inversifyRestifyUtils.optionsObjectpathStrOrReg
  */
  type RouteOptions = typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions | typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
  type StrOrRegex = java.lang.String | js.RegExp
}
