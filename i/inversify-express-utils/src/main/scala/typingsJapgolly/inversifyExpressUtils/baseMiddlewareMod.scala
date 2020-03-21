package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.inversify.interfacesMod.interfaces.BindingToSyntax
import typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.HttpContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", JSImport.Namespace)
@js.native
object baseMiddlewareMod extends js.Object {
  @js.native
  abstract class BaseMiddleware () extends js.Object {
    val httpContext: HttpContext = js.native
    /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
    def handler(req: Request_[ParamsDictionary], res: Response_, next: NextFunction): Unit = js.native
  }
  
}

