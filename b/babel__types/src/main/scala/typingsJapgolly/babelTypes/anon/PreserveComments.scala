package typingsJapgolly.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveComments extends StObject {
  
  var preserveComments: Boolean
}
object PreserveComments {
  
  inline def apply(preserveComments: Boolean): PreserveComments = {
    val __obj = js.Dynamic.literal(preserveComments = preserveComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveComments]
  }
  
  extension [Self <: PreserveComments](x: Self) {
    
    inline def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
  }
}
