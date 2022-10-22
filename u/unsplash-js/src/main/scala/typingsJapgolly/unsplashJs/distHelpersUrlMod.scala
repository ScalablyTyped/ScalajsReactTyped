package typingsJapgolly.unsplashJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.unsplashJs.anon.Pathname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersUrlMod {
  
  @JSImport("unsplash-js/dist/helpers/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildUrl(hasPathnameQuery: BuildUrlParams): js.Function1[/* apiUrl */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUrl")(hasPathnameQuery.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* apiUrl */ String, String]]
  
  inline def parseQueryAndPathname(url: String): Pathname = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryAndPathname")(url.asInstanceOf[js.Any]).asInstanceOf[Pathname]
  
  trait BuildUrlParams extends StObject {
    
    var pathname: String
    
    var query: Query
  }
  object BuildUrlParams {
    
    inline def apply(pathname: String, query: Query): BuildUrlParams = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildUrlParams]
    }
    
    extension [Self <: BuildUrlParams](x: Self) {
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type Query = StringDictionary[String | Double | Boolean]
}
