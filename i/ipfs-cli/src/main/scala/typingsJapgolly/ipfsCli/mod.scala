package typingsJapgolly.ipfsCli

import typingsJapgolly.yargs.mod.MiddlewareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cli(command: js.Array[String], ctxMiddleware: MiddlewareFunction[js.Object]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cli")(command.asInstanceOf[js.Any], ctxMiddleware.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
