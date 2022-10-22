package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content544` extends StObject {
  
  /** The branch has been successfully synced with the upstream repository */
  var `200`: Content544
  
  /** The branch could not be synced because of a merge conflict */
  var `409`: Any
  
  /** The branch could not be synced for some other reason */
  var `422`: Any
}
object `200Content544` {
  
  inline def apply(`200`: Content544, `409`: Any, `422`: Any): `200Content544` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content544`]
  }
  
  extension [Self <: `200Content544`](x: Self) {
    
    inline def set200(value: Content544): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
