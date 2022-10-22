package typingsJapgolly.naverWhale.whale.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCheckDetails extends StObject {
  
  /** The version of the available update. */
  var version: String
}
object UpdateCheckDetails {
  
  inline def apply(version: String): UpdateCheckDetails = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCheckDetails]
  }
  
  extension [Self <: UpdateCheckDetails](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
