package typingsJapgolly.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingOutOptions extends StObject {
  
  var mustInvalidate: Boolean
}
object SingOutOptions {
  
  inline def apply(mustInvalidate: Boolean): SingOutOptions = {
    val __obj = js.Dynamic.literal(mustInvalidate = mustInvalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingOutOptions]
  }
  
  extension [Self <: SingOutOptions](x: Self) {
    
    inline def setMustInvalidate(value: Boolean): Self = StObject.set(x, "mustInvalidate", value.asInstanceOf[js.Any])
  }
}
