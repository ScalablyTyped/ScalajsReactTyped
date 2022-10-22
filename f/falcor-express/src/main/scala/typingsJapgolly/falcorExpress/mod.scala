package typingsJapgolly.falcorExpress

import typingsJapgolly.express.mod.Handler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.falcor.mod.DataSource
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("falcor-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dataSourceRoute(
    getDataSource: js.Function2[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      /* res */ Response_[Any, Record[String, Any]], 
      DataSource
    ]
  ): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("dataSourceRoute")(getDataSource.asInstanceOf[js.Any]).asInstanceOf[Handler]
}
