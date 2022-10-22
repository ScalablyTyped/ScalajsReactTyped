package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.BindingToSyntax
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typingsJapgolly.inversifyExpressUtils.libInterfacesMod.HttpContext
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseMiddlewareMod {
  
  /* note: abstract class */ @JSImport("inversify-express-utils/lib/base_middleware", "BaseMiddleware")
  @js.native
  open class BaseMiddleware () extends StObject {
    
    /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
    
    def handler(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): Unit = js.native
    
    var httpContext: HttpContext = js.native
  }
}
