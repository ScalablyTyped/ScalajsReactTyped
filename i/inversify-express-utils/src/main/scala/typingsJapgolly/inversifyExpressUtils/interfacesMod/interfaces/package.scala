package typingsJapgolly.inversifyExpressUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type ConfigFunction = js.Function1[/* app */ typingsJapgolly.express.mod.Application_, scala.Unit]
  type ControllerParameterMetadata = org.scalablytyped.runtime.StringDictionary[
    js.Array[typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.ParameterMetadata]
  ]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
  type Middleware = typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any] | typingsJapgolly.express.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]
}
