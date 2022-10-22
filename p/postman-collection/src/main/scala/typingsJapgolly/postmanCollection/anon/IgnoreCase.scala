package typingsJapgolly.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreCase extends StObject {
  
  var ignoreCase: Boolean
}
object IgnoreCase {
  
  inline def apply(ignoreCase: Boolean): IgnoreCase = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreCase]
  }
  
  extension [Self <: IgnoreCase](x: Self) {
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
  }
}
