package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonArtifacts` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonArtifacts
}
object `200ContentApplicationjsonArtifacts` {
  
  inline def apply(`200`: ContentApplicationjsonArtifacts): `200ContentApplicationjsonArtifacts` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonArtifacts`]
  }
  
  extension [Self <: `200ContentApplicationjsonArtifacts`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonArtifacts): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
