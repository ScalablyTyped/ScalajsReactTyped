package typingsJapgolly.prettyData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object pd {
    
    @JSImport("pretty-data", "pd")
    @js.native
    val ^ : js.Any = js.native
    
    inline def css(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def css(data: String, preserveComments: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(data.asInstanceOf[js.Any], preserveComments.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def cssmin(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssmin")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def json(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def jsonmin(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonmin")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sql(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sql")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sqlmin(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sqlmin")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def xml(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def xmlmin(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlmin")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def xmlmin(data: String, preserveComments: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlmin")(data.asInstanceOf[js.Any], preserveComments.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
