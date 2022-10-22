package typingsJapgolly.swaggerExpressMw

import typingsJapgolly.swaggerNodeRunner.mod.Config
import typingsJapgolly.swaggerNodeRunner.mod.ConnectMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-express-mw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* runner */ ConnectMiddleware, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
