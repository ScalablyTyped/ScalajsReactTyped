package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `302404` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDownloadcount
  
  var `302`: Any
  
  var `404`: Content6
}
object `302404` {
  
  inline def apply(`200`: ContentApplicationjsonDownloadcount, `302`: Any, `404`: Content6): `302404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("302")(`302`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`302404`]
  }
  
  extension [Self <: `302404`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonDownloadcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set302(value: Any): Self = StObject.set(x, "302", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
