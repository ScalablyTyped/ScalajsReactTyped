package typingsJapgolly.expressMyconnection

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressMyconnection.anon.Typeofmysql
import typingsJapgolly.mysql.mod.ConnectionConfig
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(mysqlInstance: Typeofmysql, dbConfig: ConnectionConfig, strategy: String): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(mysqlInstance.asInstanceOf[js.Any], dbConfig.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-myconnection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
